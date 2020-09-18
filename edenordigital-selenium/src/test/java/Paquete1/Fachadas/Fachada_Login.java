package Paquete1.Fachadas;

import Paquete1.BaseTest;
import login.Steps_Login;
import login.Steps_Starting;

public class Fachada_Login extends BaseTest {


    public void loginConEmailNoFederado(String usuario,String password){
        Steps_Starting ss = new Steps_Starting(driver);
        ss.clickButtonIngresarConEmail();
        Steps_Login hi = new Steps_Login(driver);
        hi.ingrearEmail(usuario);
        hi.ingresarPassword(password);
        hi.clickSiguiente();
        hi.waitForAlertDialog();
    }

    public void loginUsuarioY_OContrasenaInvalidos(String usuario, String password){
        Steps_Starting ss = new Steps_Starting(driver);
        ss.clickButtonIngresarConEmail();
        Steps_Login hi = new Steps_Login(driver);
        hi.ingrearEmail(usuario);
        hi.ingresarPassword(password);
        hi.clickSiguiente();
        hi.waitForAlertDialog();
    }

    public void noTengoUsuarioRegistrarme(Steps_Login.RedSocial redSocial){
        Steps_Login stepsLogin = new Steps_Login(driver);
        stepsLogin.clickTengoUsuarioRegistrarme();
        stepsLogin.seleccionarRedSocial(redSocial);
        stepsLogin.verificarNuevaVentana();
    }
}
