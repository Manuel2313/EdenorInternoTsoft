import login.Steps_Login;
import org.testng.annotations.Test;

public class cp613_ED_Registracion_Mail_no_federado_Mail_ya_registrado extends BaseTest {

    //613 ED. Registracion. Mail no federado. Mail ya registrado

    private String email = "pruebadeqa03@gmail.com";
    private String pass = "Edenor2018";

    @Test
    public void cp613() throws InterruptedException {
        Steps_Login sl = new Steps_Login(driver);
        Thread.sleep(6000);
        sl.clickTengoUsuarioRegistrarme();
        Fachada_Registro_Login frl = new Fachada_Registro_Login();
        frl.registrar(email,pass);
    }
}
