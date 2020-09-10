package helper;

import org.openqa.selenium.*;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.beans.Visibility;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Context {
    protected WebDriver driver;
    WebDriverWait wait;

    public Context(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

    public boolean waitForElementVisible(By locator){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        }catch (TimeoutException e){
            return false;
        }
    }

    public boolean waitForElementClickable(By locator){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            return true;
        }catch (TimeoutException e){
            return false;
        }
    }
    public boolean waitForElementPresent(By locator){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        }catch (TimeoutException e){
            return false;
        }
    }

    public boolean waitForElementNotPresent(By locator){
        try{
            wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(locator)));
            return true;
        }catch (TimeoutException e){
            return false;
        }

    }

    public void checkVisibility(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        CustomAssert.assertTrue("No se encontro elemento",driver.findElement(locator).isDisplayed());

    }

    private By alert = By.xpath("/html/body/div[1]/div[1]"); //By.xpath("/html/body/div[1]/div[1]/div/div[1]");

    public void waitForAlertDialog(){
        CustomAssert.assertTrue("No se encontro alerta",driver.findElement(alert).isDisplayed());
    }

    public void verificarNuevaVentanaConURL(String url){
        verificarNuevaVentana();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); //switches to new tab
        CustomAssert.assertequalsText("Url incorrecta",driver.getCurrentUrl(),url);
    }

    public void verificarNuevaVentana(){
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception{
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = "C:\\Users\\mauro.andres\\Desktop\\Reportes"+screenshotName+".png";
        File finalDestination = new File(destination);
        FileHandler.copy(source, finalDestination);
        return destination;
    }

}
