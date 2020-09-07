import login.Steps_Starting;
import login_registro.Steps_Registro_Login;

public class Fachada_Registro_Login extends BaseTest {



    public void registrar(String usuario,String password){
        Steps_Starting ss =  new Steps_Starting(driver);
        ss.clickButtonIngresarConEmail();
        Steps_Registro_Login srl = new Steps_Registro_Login(driver);
        srl.ingrearEmail(usuario);
        srl.ingresarPassword(password);
        srl.clickBotonRegistrarme();
    }
}
