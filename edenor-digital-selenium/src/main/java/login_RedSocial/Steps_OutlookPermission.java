package login_RedSocial;

import modelBase.Steps_PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_OutlookPermission extends Steps_PopUp {
    public Steps_OutlookPermission(WebDriver driver) {
        super(driver);
    }
    private By TITULO_PERMISSION = By.xpath("//*[text()='¿Permites el acceso a tu información?']");
    private By BOTON_SI = By.xpath("//*[@type='submit' and @role='button' and @value='Sí' ]");

    public void validate(){
        waitForElementVisible(TITULO_PERMISSION);
    }
    public void clickSi(){
        click(BOTON_SI);
    }
}
