package TestsCases.ED_Registracion;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_LoginRedSocial;
import Paquete1.Fachadas.Fachada_Registro;
import login.Steps_Login;
import org.testng.annotations.Test;

public class cp649 extends BaseTest {

    private String usuario = "automationnoregistradoened@gmail.com";
    private String password = "Edenor2019";
    private String dni = "22667612";

    @Test
    public void cp649(){
        Steps_Login sl = new Steps_Login(driver);
        sl.clickTengoUsuarioRegistrarme();
        String parentH = driver.getWindowHandle();
        sl.seleccionarRedSocial(Steps_Login.RedSocial.TWITTER);
        Fachada_LoginRedSocial lrs = new Fachada_LoginRedSocial();
        lrs.loginTwitter(usuario,password);
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(parentH);
        Fachada_Registro fr = new Fachada_Registro();
        fr.completarInicioDelRegistro(dni,"Male", "11", "11111111");
    }

}
