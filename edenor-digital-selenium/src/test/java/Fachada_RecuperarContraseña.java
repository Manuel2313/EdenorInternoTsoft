import helper.CustomAssert;
import login.Steps_Login;
import login.Steps_Starting;
import login_RecuperarContraseña.Steps_RecuperarContraseña;
import org.openqa.selenium.Alert;
import org.testng.Assert;

public class Fachada_RecuperarContraseña extends BaseTest {

    private Steps_RecuperarContraseña stepsRecuperarContrasena;
    private Steps_Starting stepsStarting;
    private Steps_Login stepsLogin = new Steps_Login(driver);

    public void TC_618_RecuperarContrasenaMailFormatoInvalido(){
        stepsStarting = new Steps_Starting(driver);
        stepsStarting.clickButtonIngresarConEmail();
        stepsLogin.clickOlvideMiContrsena();
        stepsRecuperarContrasena = new Steps_RecuperarContraseña(driver);
        stepsRecuperarContrasena.ingresarMail("mail sin arroba ni punto");
        stepsRecuperarContrasena.cliclEnviarSolicitud();
        //Assert.assertTrue(stepsRecuperarContrasena.isMensajeMailIncorrectoVisible(),"FAILED: No se encuentra mensaje de email inválido");
        CustomAssert.assertTrue("FAILED: No se encuentra mensaje de email inválido",stepsRecuperarContrasena.isMensajeMailIncorrectoVisible());
        stepsRecuperarContrasena.clickVolver();
    }
    public void TC_619_RecuperarContrasenaMailFormatoValidoUsuarioNoRegistrado() throws InterruptedException {
        stepsStarting = new Steps_Starting(driver);
        stepsStarting.clickButtonIngresarConEmail();
        stepsLogin.clickOlvideMiContrsena();
        stepsRecuperarContrasena = new Steps_RecuperarContraseña(driver);
        stepsRecuperarContrasena.ingresarMail("mail_con_arroba_@maiol.cc");
        stepsRecuperarContrasena.cliclEnviarSolicitud();
        //Thread.sleep(6000);
        stepsRecuperarContrasena.waitForAlertDialog();
        //Thread.sleep(4000);
        stepsRecuperarContrasena.clickVolver();
        //Thread.sleep(4000);
    }
    public void TC_620_RecuperarContrasenaMailValidoUsuarioRegistrado(String usuario) throws InterruptedException {
        stepsStarting = new Steps_Starting(driver);
        stepsStarting.clickButtonIngresarConEmail();
        stepsLogin.clickOlvideMiContrsena();
        stepsRecuperarContrasena = new Steps_RecuperarContraseña(driver);
        stepsRecuperarContrasena.ingresarMail(usuario);
        stepsRecuperarContrasena.cliclEnviarSolicitud();
        //Thread.sleep(4000);
        stepsRecuperarContrasena.waitForAlertDialog();
    }

}
