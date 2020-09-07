package miUsuario_administracionDeNotificaciones;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_AdministracionDeNotificaciones extends Steps_Base {

    private By Title_Administracion_De_Notificaciones = By.xpath("//*[@class='styles_topbar__3uyBL ']//span[text()='Administración de notificaciones']");

    public Steps_AdministracionDeNotificaciones(WebDriver driver) {
        super(driver);
    }

    public void validate(){
        CustomAssert.assertTrue("Titulo Administracion de Notificaciones", waitForElementVisible(Title_Administracion_De_Notificaciones));
    }
}
