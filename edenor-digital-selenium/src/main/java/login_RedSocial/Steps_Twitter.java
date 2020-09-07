package login_RedSocial;

import helper.CustomAssert;
import modelBase.Steps_PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Twitter extends Steps_PopUp {
    public Steps_Twitter(WebDriver driver) {
        super(driver);
    }
    private By TITLE_TWITTER = By.xpath("");
    private By INPUT_EMAIL = By.xpath("");
    private By INPUT_PWD = By.xpath("");
    private By BTN_SIGN_IN = By.xpath("");

    public void validate(){
        CustomAssert.assertTrue("No se encuentra visible el titulo Twitter", waitForElementVisible(TITLE_TWITTER));
        CustomAssert.assertTrue("No se encuentra visible el INPUT  email", waitForElementVisible(INPUT_EMAIL));
    }

    public void ingresarEmail(String email){
        ingresarCampo(INPUT_EMAIL, email);
    }

    public void ingresarPassword(String pwd){
        ingresarCampo(INPUT_PWD, pwd);
    }

    public void clickSignIn(){
        click(BTN_SIGN_IN);
    }
}

