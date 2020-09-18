package login_RedSocial;

import helper.CustomAssert;
import modelBase.Steps_PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Twitter extends Steps_PopUp {

    private By TITLE_TWITTER = By.xpath("//a[text()='Twitter']");
    private By INPUT_EMAIL = By.xpath("/html/body/div[2]/div/form/fieldset[1]/div[1]/input");//By.xpath("//*[@id='username_or_email']");
    private By INPUT_PWD = By.xpath("/html/body/div[2]/div/form/fieldset[1]/div[2]/input");//By.xpath("//*[@id='password']");
    private By BTN_SIGN_IN = By.xpath("/html/body/div[2]/div/form/fieldset[2]/input[1]");//By.xpath("//*[@id='allow']");

    public Steps_Twitter(WebDriver driver) {
        super(driver);
        validate();
    }

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

