package registro;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Registro_Validacion_De_Datos extends Steps_Base {
    public Steps_Registro_Validacion_De_Datos(WebDriver driver) {
        super(driver);
        validate();
    }
    private By HEADER = By.xpath("//*[text()='Validación de datos']");
    private By CHECKBOX_NINGUNO_DE_LOS_ANTERIORES_0 = By.xpath("(//*[contains(text(),'anteriores')])[1]");
    private By CHECKBOX_NINGUNO_DE_LOS_ANTERIORES_1 = By.xpath("(//*[contains(text(),'anteriores')])[2]");
    private By CHECKBOX_NINGUNO_DE_LOS_ANTERIORES_2 = By.xpath("(//*[contains(text(),'anteriores')])[3]");
    private By BTN_SIGUIENTE = By.xpath("//*[text()='Siguiente']");

    public void ingresarDatosDeValidacion(){
        driver.findElement(CHECKBOX_NINGUNO_DE_LOS_ANTERIORES_0).click();
        driver.findElement(CHECKBOX_NINGUNO_DE_LOS_ANTERIORES_1).click();
        driver.findElement(CHECKBOX_NINGUNO_DE_LOS_ANTERIORES_2).click();
    }
    public void validate(){
        CustomAssert.assertTrue(waitForElementVisible(HEADER),"No se encuentra el header");
        CustomAssert.assertTrue(waitForElementVisible(CHECKBOX_NINGUNO_DE_LOS_ANTERIORES_0),"No se encuntra opcion");
    }
    public void ingresarDatosDeValidacion(String respuesta1, String respuesta2, String respuesta3){
    }
    public void clickButtonSiguiente(){
        driver.findElement(BTN_SIGUIENTE).click();
    }
    public boolean isHeaderVisible(){
        return isElementVisible(HEADER);
    }

}
