package TestsCases.ED_Registracion;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_Registro_Login;
import helper.Context;
import login.Steps_Login;
import org.testng.annotations.Test;

public class cp613_ED_Registracion_Mail_no_federado_Mail_ya_registrado extends BaseTest {

    //613 ED. Registracion. Mail no federado. Mail ya registrado

    private String email = "pruebadeqa01@gmail.com";
    private String pass = "Edenor2018";

    @Test
    public void cp613(){
        Steps_Login sl = new Steps_Login(driver);
        sl.clickTengoUsuarioRegistrarme();
        Fachada_Registro_Login frl = new Fachada_Registro_Login();
        frl.registrar(email,pass);
        Context c = new Context(driver);
        c.waitForAlertDialog();
    }
}
