import home.Steps_Home;
import login.Steps_Login;
import org.jsoup.Connection;
import org.testng.annotations.Test;

public class cp640 extends BaseTest {


    private String usuario= "";
    private String contraseña= "";
    private String dni = "";
    private String genero= "";
    private String area = "";
    private String telefono = "";


    @Test
    public void cp640(){
        Steps_Login sl = new Steps_Login(driver);
        sl.seleccionarRedSocial(Steps_Login.RedSocial.FACEBOOK);
        Fachada_LoginRedSocial flrs = new Fachada_LoginRedSocial();
        flrs.loginFacebook(usuario,contraseña);
        Fachada_Registro fr = new Fachada_Registro();
        fr.completarInicioDelRegistro(dni,genero,area,telefono);
    }
}
