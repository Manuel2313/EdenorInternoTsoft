package misCuentas_configuracionDeLaCuenta_administrarDelegaciones;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_PopUpBorrarDelegacion extends Steps_Base {

    private By title = By.xpath("//*[text()='¿Desea borrar la delegación?']");
    private By Button_Aceptar = By.xpath("//button/*[text()='Aceptar']");


    public Steps_PopUpBorrarDelegacion(WebDriver driver) {
        super(driver);
        validate();
    }
    public void  validate(){
        CustomAssert.assertTrue("No se encuentra header de Pop Up",waitForElementVisible(title));
    }
    public void clickAceptar(){
        click(Button_Aceptar);
    }

}
