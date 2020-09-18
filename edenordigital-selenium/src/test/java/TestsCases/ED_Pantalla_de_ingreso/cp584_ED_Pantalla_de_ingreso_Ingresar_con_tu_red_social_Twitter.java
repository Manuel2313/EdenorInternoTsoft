package TestsCases.ED_Pantalla_de_ingreso;

import Paquete1.BaseTest;
import login.Steps_Login;
import login_RedSocial.Steps_Twitter;
import org.testng.annotations.Test;

public class cp584_ED_Pantalla_de_ingreso_Ingresar_con_tu_red_social_Twitter extends BaseTest {

    @Test
    public void cp584(){
        Steps_Login sl = new Steps_Login(driver);
        sl.seleccionarRedSocial(Steps_Login.RedSocial.TWITTER);
        sl.verificarNuevaVentana();
        Steps_Twitter st = new Steps_Twitter(driver);
        st.validate();
    }
}
