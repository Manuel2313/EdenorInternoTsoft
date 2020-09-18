package misCuentas;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_ModalInformacion extends Steps_Base {

    private By IMAGEN_ALERTA = By.xpath("//div[@role='dialog']//img[@alt='alertIcon']");
    private By BOTON_CERRAR = By.xpath("//div[@role='dialog']/*[@id='alert-dialog-title']//button");
    private By BOTON_ENTENDIDO = By.xpath("//div[@role='dialog']//button/*[text()='Entendido']");

    public Steps_ModalInformacion(WebDriver driver) {
        super(driver);
    }

    public void validate(){
        waitForElementVisible(IMAGEN_ALERTA);
    }
    public void clickCerrar(){
        click(BOTON_CERRAR);
    }
    public void clickEntendido(){
        click(BOTON_ENTENDIDO);
    }
}

