package miUsuario_datosPersonales_editarTelefoto;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Steps_EditarTelefono extends Steps_Base {

    private By Title_Main = By.xpath("//*[@id='alert-dialog-title']//*[contains(text(),'Cambiar teléfono')]");
    private By Input_NuevoTelefono = By.xpath("//input[@type='text']");
    private By Button_Cancelar = By.xpath("//*[text()='Cancelar']");
    private By Button_Cambiar = By.xpath("//*[text()='Cambiar']");

    public Steps_EditarTelefono(WebDriver driver) {
        super(driver);
    }

    public void  editar(String nuevoNumero){
        Actions action = new Actions(driver);
        WebElement itel = driver.findElement(Input_NuevoTelefono);
        action.doubleClick(itel);
        driver.findElement(Input_NuevoTelefono).sendKeys(Keys.DELETE.toString());
        ingresarCampo(Input_NuevoTelefono, nuevoNumero);
    }

    public void clickButtonCancelar(){
        driver.findElement(Button_Cancelar).click();
    }

    public void clickButtonCambiar(){
        driver.findElement(Button_Cambiar).click();
    }



}
