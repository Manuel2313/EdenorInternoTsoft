package TestsCases.ED_Pantalla_de_ingreso;

import Paquete1.BaseTest;
import login.Steps_Login;
import login_RedSocial.Steps_Facebook;
import org.testng.annotations.Test;

public class cp586_ED_Pantalla_de_ingreso_Ingresar_con_tu_red_social_Facebook extends BaseTest {

    @Test
    public void cp586() throws InterruptedException {
        Steps_Login sl = new Steps_Login(driver);
        Thread.sleep(5000);
        sl.clickRedSocial(Steps_Login.RedSocial.FACEBOOK);
        sl.verificarNuevaVentana();
        Steps_Facebook sfb = new Steps_Facebook(driver);
        sfb.validate();
    }
}
