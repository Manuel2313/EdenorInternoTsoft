package login_RedSocial;

import modelBase.Steps_PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;

public class Steps_GmailUser extends Steps_PopUp {

    private By HEADER = By.xpath("//*[text()='Iniciar sesión con Google']");
    private By INPUT_EMAIL = By.xpath("//input[@type = 'email']");
    private By BTN_NEXT = By.xpath("//div[@id='identifierNext']/content/span");


    public Steps_GmailUser(WebDriver driver) {
        super(driver);
        validate();
    }

    public void validate(){
        waitForElementPresent(INPUT_EMAIL);
    }

    public void ingresarMail(String mail){
        ingresarCampo(INPUT_EMAIL, mail);
    }

    public Steps_GmailPassword clickSiguiente(){
        click(BTN_NEXT);
        return new Steps_GmailPassword(driver);
    }
}
