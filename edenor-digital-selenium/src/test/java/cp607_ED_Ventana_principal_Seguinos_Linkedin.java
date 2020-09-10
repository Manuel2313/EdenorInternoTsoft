import home.Steps_Home;
import org.testng.annotations.Test;

public class cp607_ED_Ventana_principal_Seguinos_Linkedin extends BaseTest {

    private String email = "a.lisis@yahoo.com";
    private String pass = "Prueba2018";

    //605. ED. Ventana principal. Seguinos. Linkedin
    @Test
    public void cp607(){
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado(email,pass);
        Fachada_Home fh = new Fachada_Home();
        fh.cerrarBienvenida();
        fh.verificarSeguinosEnRedesSociales(Steps_Home.RedSocialSeguinos.LINKEDIN);

    }
}
