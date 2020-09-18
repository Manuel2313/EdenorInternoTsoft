package miUsuario_datosPersonales_cambiarContrasna;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_CambiarContraseña extends Steps_Base {
    private By Title_Main = By.xpath("//*[@id='alert-dialog-title']//*[contains(text(),'Cambiar contraseña')]");

    public Steps_CambiarContraseña(WebDriver driver) {
        super(driver);
    }

    public void validate(){
        CustomAssert.assertTrue("Titulo Cambiar Contrasena",waitForElementVisible(Title_Main));
    }


}
