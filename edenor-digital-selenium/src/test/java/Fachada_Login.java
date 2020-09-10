import login.Steps_Login;
import login.Steps_Starting;
import org.testng.annotations.Test;

public class Fachada_Login extends BaseTest {
    //login bien
    //private String email = "a.lisis@yahoo.com";
    //private String pass = "Prueba2018";
    //LOGIN MAL
    //private String usuario="unusuariofake@mailnoexistente.cc";
    //private String password="Unacontrasena1";

    public void loginConEmailNoFederado(String usuario,String password){
        Steps_Starting ss = new Steps_Starting(driver);
        //Thread.sleep(6000);
        ss.clickButtonIngresarConEmail();
        Steps_Login hi = new Steps_Login(driver);
        hi.ingrearEmail(usuario);
        hi.ingresarPassword(password);
        hi.clickSiguiente();
        hi.waitForAlertDialog();
    }

    public void loginUsuarioY_OContrasenaInvalidos(String usuario, String password) throws InterruptedException {
        Steps_Starting ss = new Steps_Starting(driver);
        //Thread.sleep(6000);
        ss.clickButtonIngresarConEmail();
        Steps_Login hi = new Steps_Login(driver);
        hi.ingrearEmail(usuario);
        hi.ingresarPassword(password);
        hi.clickSiguiente();
        //Thread.sleep(3000);
        hi.waitForAlertDialog();
    }

    public void noTengoUsuarioRegistrarme(Steps_Login.RedSocial redSocial) throws InterruptedException {
        Steps_Login hi = new Steps_Login(driver);
        //Thread.sleep(8000);
        hi.clickTengoUsuarioRegistrarme();
        Steps_Starting ss = new Steps_Starting(driver);
        //Thread.sleep(8000);
        ss.clickButtonIngresarConEmail();
    }
}
