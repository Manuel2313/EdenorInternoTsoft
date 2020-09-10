package notificaciones;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Notificaciones extends Steps_Base {

    private By header = By.xpath("//*[text()='edenor te cuenta']");
    private By boton_cerrar = By.xpath("//*[text()='edenor te cuenta']/../following-sibling::button");

    public Steps_Notificaciones(WebDriver driver) {
        super(driver);
        validate();
    }

    public void validate(){
        CustomAssert.assertTrue("No se encuentra header",waitForElementVisible(header));
        CustomAssert.assertTrue("No se encuentra botón 'x' (cerrar)", waitForElementVisible(boton_cerrar));
    }
}
