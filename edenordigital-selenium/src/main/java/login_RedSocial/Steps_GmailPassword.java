package login_RedSocial;

import modelBase.Steps_PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_GmailPassword extends Steps_PopUp {

    private By INPUT_PWD = By.xpath("//input[@name='password']");
    private By BTN_SIGN_IN = By.xpath("//*[@id='passwordNext']");


    public Steps_GmailPassword(WebDriver driver) {
        super(driver);
    }
    public void ingresarPassword(String pwd){
        ingresarCampo(INPUT_PWD, pwd);
    }
    public void clickSignIn(){
        click(BTN_SIGN_IN);
    }
}
