package miUsuario_DatosPersonales;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_DatosPersonales extends Steps_Base {

    private By Title_Datos_Personales = By.xpath("//*[@class='styles_topbar__3uyBL ']//span[text()='Datos personales']");
    private By Button_Editar_Contraseña = By.xpath("//div[.//*[text()='Contraseña']]/following-sibling::Button");
    private By Button_Editar_Telefono = By.xpath("//div[.//*[text()='Contraseña']]/following-sibling::Button");
    private By Field_DNI = By.xpath("//div[.//*[text()='Contraseña']]/following-sibling::Button");
    private By Field_Email = By.xpath("//div[.//*[text()='Contraseña']]/following-sibling::Button");
    private By Field_Telefono = By.xpath("//div[.//*[text()='Contraseña']]/following-sibling::Button");
    private By Popup_CambiosRealizados = By.xpath("//*[text()='Los datos del usuario se han actualizado correctamente']");


    public Steps_DatosPersonales(WebDriver driver) {
        super(driver);
    }
    public void validate(){
        CustomAssert.assertTrue("Titulo Datos personales", waitForElementVisible(Title_Datos_Personales));
    }

    public void clickCambiarContraseña(){
        driver.findElement(Button_Editar_Contraseña).click();
    }

    public String getNumeroTelefono(){
        waitForElementVisible(Field_Telefono);
        return driver.findElement(Field_Telefono).getText();
    }

    public String getEmail(){
        return driver.findElement(Field_Email).getText();
    }

    public String getDNI(){
        return driver.findElement(Field_DNI).getText();
    }
    /*
    public boolean setEmail(String email) {
        try {
            driver.findElement(Field_Email).sendKeys(email);
        } catch (AssertionError e) {
            return false;
        }
    }
    */
    public void clickBurronEditarTelefono(){
        driver.findElement(Button_Editar_Telefono).click();
    }

    public void esperarCambiosRealizados(){

    }









}
