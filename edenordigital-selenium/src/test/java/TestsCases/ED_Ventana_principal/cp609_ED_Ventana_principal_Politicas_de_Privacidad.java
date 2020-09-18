package TestsCases.ED_Ventana_principal;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_Home;
import Paquete1.Fachadas.Fachada_Login;
import org.testng.annotations.Test;

public class cp609_ED_Ventana_principal_Politicas_de_Privacidad extends BaseTest {
    private String email = "a.lisis@yahoo.com";
    private String pass = "Prueba2018";

    @Test
    public void cp609(){
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado(email,pass);
        Fachada_Home fh = new Fachada_Home();
        fh.cerrarBienvenida();
        fh.verificarPoliticasDePrivacidad();
    }
}
