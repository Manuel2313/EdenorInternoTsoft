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
        CustomAssert.assertTrue(stepsRecuperarContrasena.isMensajeMailIncorrectoVisible(),"FAILED: No se encuentra mensaje de email inválido");
        stepsRecuperarContrasena.clickVolver();
    }
    public void TC_619_RecuperarContrasenaMailFormatoValidoUsuarioNoRegistrado() throws InterruptedException {
        stepsStarting = new Steps_Starting(driver);
        stepsStarting.clickButtonIngresarConEmail();
        stepsLogin.clickOlvideMiContrsena();
        stepsRecuperarContrasena = new Steps_RecuperarContraseña(driver);
        stepsRecuperarContrasena.ingresarMail("mail_con_arroba_@maiol.cc");
        stepsRecuperarContrasena.cliclEnviarSolicitud();
        //stepsRecuperarContrasena.waitForAlertDialog("Usuario no registrado, por favor verifique los datos ingresados.");
        Thread.sleep(4000);
        stepsRecuperarContrasena.clickVolver();
        Thread.sleep(4000);
    }
    public void TC_620_RecuperarContrasenaMailValidoUsuarioRegistrado(String usuario){
        stepsStarting = new Steps_Starting(driver);
        stepsStarting.clickButtonIngresarConEmail();
        stepsLogin.clickOlvideMiContrsena();
        stepsRecuperarContrasena = new Steps_RecuperarContraseña(driver);
        stepsRecuperarContrasena.ingresarMail(usuario);
        stepsRecuperarContrasena.cliclEnviarSolicitud();
        //stepsRecuperarContrasena.waitForAlertDialog("En instantes recibirás un correo electrónico con instrucciones para cambiar tu contraseña. Si no ves el correo en tu bandeja de entrada, revisá la carpeta de correo no deseado.")
    }

}
