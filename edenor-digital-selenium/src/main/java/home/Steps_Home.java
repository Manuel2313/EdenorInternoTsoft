package home;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Home extends Steps_Base {
    public Steps_Home(WebDriver driver) {
        super(driver);
    }

    By buttonUser = By.xpath("//*[contains(text(),'Hola,')]");
    By OPCIONES_MIS_CUENTAS = By.xpath("//*[@role='button']//*[contains(text(),'Mis cuentas')]");

    public void clickMiUsuario(){
        click(buttonUser);
    }

    public void clickMisCuentas(){
        click(OPCIONES_MIS_CUENTAS);
    }
}
