package TestsCases.ED_Pantalla_de_ingreso;

import Paquete1.BaseTest;
import login.Steps_Login;
import login_RedSocial.Steps_GmailUser;
import org.testng.annotations.Test;

public class cp585_ED_Pantalla_de_ingreso_Ingresar_con_tu_red_social_Gmail extends BaseTest {

    @Test
    public void cp585() throws InterruptedException {
        Steps_Login sl = new Steps_Login(driver);
        Thread.sleep(8000);
        sl.clickRedSocial(Steps_Login.RedSocial.GMAIL);
        sl.verificarNuevaVentana();
        Steps_GmailUser su = new Steps_GmailUser(driver);
        su.validate();
    }
}
