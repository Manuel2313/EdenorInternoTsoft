package Paquete1.Fachadas;

import Paquete1.BaseTest;
import login_RedSocial.*;

public class Fachada_LoginRedSocial extends BaseTest {

    private Steps_Facebook stepsFacebook;
    private Steps_GmailUser stepsGmailUser;
    private Steps_OutLookUser stepsOutlookUser;
    private Steps_Twitter stepsTwitter;
    private Steps_OutlookPermission steps_OutlookPerm;

    public void loginFacebook(String email , String password){
        stepsFacebook = new Steps_Facebook(driver);
        stepsFacebook.ingresarEmail(email);
        stepsFacebook.ingresarPassWord(password);
        stepsFacebook.clickSignIn();
    }
    public void loginGmail(String email , String password){
        stepsGmailUser = new Steps_GmailUser(driver);
        stepsGmailUser.ingresarMail(email);
        stepsGmailUser.clickSiguiente();
        Steps_GmailPassword stepsGmailPassword = stepsGmailUser.clickSiguiente();
        stepsGmailPassword.ingresarPassword(password);
        stepsGmailPassword.clickSignIn();
    }
    public void loginOutlook(String email , String password){
        stepsOutlookUser = new Steps_OutLookUser(driver);
        stepsOutlookUser.ingresarEmail(email);
        Steps_OutlookPassword stepsOutlookPassword = stepsOutlookUser.clickNext();
        stepsOutlookPassword.ingresarPassword(password);
        stepsOutlookPassword.clickSignIn();
    }

    public void loginTwitter(String email , String password){
        stepsTwitter = new Steps_Twitter(driver);
        stepsTwitter.ingresarEmail(email);
        stepsTwitter.ingresarPassword(password);
        stepsTwitter.clickSignIn();
    }

    public void aceptarPermisosOutlook(){
        steps_OutlookPerm = new Steps_OutlookPermission(driver);
        steps_OutlookPerm.clickSi();
    }

}
