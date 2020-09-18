package misCuentas_configuracionDeLaCuenta_desasociarCuenta;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_DesasociarCuenta extends Steps_Base {

    private By buttonConfirmar = By.xpath("//button/*[text()='Confirmar']");

    public Steps_DesasociarCuenta(WebDriver driver) {
        super(driver);
    }
    public void confirmar(){
        click(buttonConfirmar);
    }
}
