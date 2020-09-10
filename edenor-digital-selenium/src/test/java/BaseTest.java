import helper.Context;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.File;
import java.util.Random;
import java.util.function.Function;

public abstract class BaseTest {
    static WebDriver driver;
    private static ExtentTest extentTests;
    private static ExtentReports reports;
    private static ExtentTest test;
    private String nombreDePrueba = "Edenor Digital";
    private String autorTest = "TSOFT";

    public String generarNombresRandom(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomString="";
        int longitud = 5;
        Random rando = new Random();
        char[] text = new char[longitud];

        for (int i=0; i<longitud; i++){
             text[i]= caracteres.charAt(rando.nextInt(caracteres.length()));
        }
        for (int i=0; i<longitud; i++){
            randomString+=text[i];
        }

        return randomString;

    }

    static void generarLog(Boolean condicion, String logEvent) throws Exception {
        //Conficion,
        // Si es verdadera, en reporte se genera un log Pass con el mensaje "logEvent Exitoso" con su captura
        // Si es falsa, se genera un log Fail con el mensaje "logEvent Fallido" con su captura

        if (condicion) {
            test.log(LogStatus.PASS, extentTests.addScreenCapture(Context.getScreenshot(driver, logEvent)) + logEvent + "Exitoso");
        } else {
            test.log(LogStatus.FAIL, extentTests.addScreenCapture(Context.getScreenshot(driver, logEvent)) + logEvent + "Fallido");
        }
    }

    @BeforeClass(alwaysRun = true)
    public void setUp(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\mauro.andres\\Desktop\\Chr\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://ugo-0019-stage.widergydev.com/ingreso");
            test = reports.startTest(getClass().getName());
            test.assignAuthor(autorTest);
            test.setDescription(getClass().getName());
            extentTests.log(LogStatus.INFO, getClass().getName() + "- Inicia");
    }
    @BeforeTest
    public void startReport(){
        //Nombre del archivo del reporte con la direccion del test
        reports = new ExtentReports("C:\\Users\\mauro.andres\\Desktop\\Reportes\\" + generarNombresRandom()+ ".html");
        //Configuracion del reporte
        reports.loadConfig(new File(System.getProperty("user.dir")+ "\\extent-config.xml"));
        extentTests = reports.startTest(nombreDePrueba);
        extentTests.assignAuthor(autorTest);
        extentTests.setDescription("Horarios de inicio y finalizacion");
    }

    @AfterMethod(alwaysRun = true)
    public void cleanAndReflesh(){
        //driver.manage().deleteAllCookies();
        //driver.navigate().refresh();
    }

    @AfterClass(alwaysRun = true)
    public void tearDawn(){
        extentTests.log(LogStatus.INFO, getClass().getName() + "-- Finaliza");
        reports.flush();
    }

    @AfterTest(alwaysRun = true)
    public void reportTest(){
        reports.endTest(extentTests);
    }
    public void waitForPageLoad() {

        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                System.out.println("Current Window State       : "
                        + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
                return String
                        .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        });
    }

}



