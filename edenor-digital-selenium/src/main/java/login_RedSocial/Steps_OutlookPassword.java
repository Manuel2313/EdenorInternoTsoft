package login_RedSocial;

import modelBase.Steps_PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_OutlookPassword extends Steps_PopUp {
    public Steps_OutlookPassword(WebDriver driver) {
        super(driver);
    }
    private By INPUT_PWD = By.xpath("//*[@id='i0118'']");
    private By BTN_SIGN_IN = By.xpath("//*[@id='idSIButton9']");

    public void ingresarPassword(String pwd){
        ingresarCampo(INPUT_PWD, pwd);
    }

    public void clickSignIn(){
        click(BTN_SIGN_IN);
    }

}
