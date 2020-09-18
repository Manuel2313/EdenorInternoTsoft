package login_RedSocial;

import helper.CustomAssert;
import modelBase.Steps_PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Instant;

public class Steps_Facebook extends Steps_PopUp {

    private By TITLE_FACEBOOK = By.xpath("//*[@id='homelink']");
    private By INPUT_EMAIL = By.xpath("//*[@id='email']");
    private By INPUT_PWD = By.xpath("//*[@id='pass']");
    private By BTN_SIGN_IN = By.xpath("//input[@name='login']");

    public Steps_Facebook(WebDriver driver) {
        super(driver);
        validate();
    }

    public void validate(){
        CustomAssert.assertTrue("No se encuentra visible el titulo Facebook", waitForElementVisible(TITLE_FACEBOOK));
    }
    public void ingresarEmail(String mail){
        ingresarCampo(INPUT_EMAIL,mail);
    }
    public void ingresarPassWord(String pwd){
        ingresarCampo(INPUT_PWD,pwd);
    }
    public void  clickSignIn(){
        click(BTN_SIGN_IN);
    }

}
