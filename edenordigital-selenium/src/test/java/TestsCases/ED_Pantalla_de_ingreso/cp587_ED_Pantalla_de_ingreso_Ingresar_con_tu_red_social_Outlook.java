package TestsCases.ED_Pantalla_de_ingreso;

import Paquete1.BaseTest;
import login.Steps_Login;
import login_RedSocial.Steps_OutLookUser;
import org.testng.annotations.Test;

public class cp587_ED_Pantalla_de_ingreso_Ingresar_con_tu_red_social_Outlook extends BaseTest {

    @Test
    public void cp587(){
        Steps_Login sl = new Steps_Login(driver);
        sl.seleccionarRedSocial(Steps_Login.RedSocial.OUTLOOK);
        sl.verificarNuevaVentana();
        Steps_OutLookUser sou = new Steps_OutLookUser(driver);
        sou.validate();
    }
}
