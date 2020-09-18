package Paquete1.Fachadas;

import Paquete1.BaseTest;
import login.Steps_Login;
import login_RedSocial.Steps_Facebook;
import login_RedSocial.Steps_GmailUser;
import login_RedSocial.Steps_Twitter;

public class Fachada_noTengoUsuarioMultiTest extends BaseTest {
    private Fachada_Login fachadaLogin;
    private Steps_Login stepsLogin;

    public void noTengoUsuarioRegistrarmeGmail(){
        fachadaLogin = new Fachada_Login();
        stepsLogin= new Steps_Login(driver);
        String parentHandle = driver.getWindowHandle();
        fachadaLogin.noTengoUsuarioRegistrarme(Steps_Login.RedSocial.GMAIL);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        String ventanaNueva = driver.getWindowHandle();
        Steps_GmailUser gu = new Steps_GmailUser(driver);
        gu.ingresarMail("Hola Pepe");
        driver.close();
        driver.switchTo().window(parentHandle);
    }

    public void noTengoUsuarioRegistrarmeTwitter() {
        fachadaLogin = new Fachada_Login();
        stepsLogin = new Steps_Login(driver);
        String parentHandle = driver.getWindowHandle();
        fachadaLogin.noTengoUsuarioRegistrarme(Steps_Login.RedSocial.TWITTER);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        new Steps_Twitter(driver);
        driver.close();
        driver.switchTo().window(parentHandle);
    }

    public void noTengoUsuarioRegistrarmeFacebook() {
        fachadaLogin = new Fachada_Login();
        stepsLogin = new Steps_Login(driver);
        String parentHandle = driver.getWindowHandle();
        fachadaLogin.noTengoUsuarioRegistrarme(Steps_Login.RedSocial.FACEBOOK);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        new Steps_Facebook(driver);
        driver.close();
        driver.switchTo().window(parentHandle);
    }
}
