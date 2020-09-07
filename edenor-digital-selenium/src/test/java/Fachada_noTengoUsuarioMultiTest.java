import login.Steps_Login;

public class Fachada_noTengoUsuarioMultiTest extends BaseTest {
    private Fachada_Login fachadaLogin;
    private Steps_Login stepsLogin;

    public void noTengoUsuarioRegistrarmeGmail(){
        fachadaLogin = new Fachada_Login();
        stepsLogin= new Steps_Login(driver);
        try {
            fachadaLogin.noTengoUsuarioRegistrarme(Steps_Login.RedSocial.GMAIL);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
