package TestsCases.ED_Registracion;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_LoginRedSocial;
import Paquete1.Fachadas.Fachada_Registro;
import login.Steps_Login;
import org.testng.annotations.Test;

public class cp651 extends BaseTest {

    private String usuario = "prueba001983@outlook.com";
    private String password = "Edenor2018";
    private String dni = "13021376";

    @Test
    public void cp650(){
        Steps_Login sl = new Steps_Login(driver);
        sl.clickTengoUsuarioRegistrarme();
        sl.seleccionarRedSocial(Steps_Login.RedSocial.OUTLOOK);
        Fachada_LoginRedSocial lrs = new Fachada_LoginRedSocial();
        lrs.loginOutlook(usuario,password);
        Fachada_Registro fr = new Fachada_Registro();
        fr.completarInicioDelRegistro(dni,"Male", "11", "11111111");
    }
}
