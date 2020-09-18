package login_RedSocial;

import helper.CustomAssert;
import modelBase.Steps_PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_OutLookUser extends Steps_PopUp {

    //private By ss = By.xpath("");
    private By INPUT_EMAIL = By.xpath("//*[@id='i0116']");
    private By BTN_NEXT = By.xpath("//*[@id='idSIButton9']");
    private By LOGO = By.xpath("//img[@alt='Microsoft']");
    public Steps_OutLookUser(WebDriver driver) {
        super(driver);
        validate();
    }

    public void validate(){
        CustomAssert.assertTrue("No se encuentra visible logo de Microsoft", waitForElementVisible(LOGO));
    }

    public void ingresarEmail(String email){
        //CustomAssert.assertTrue("No se encuentra input mail",WebUI.waitForElementClickable(findTestObject(INPUT_EMAIL), GlobalVariable.WAIT_DEFAULT));
        ingresarCampo(INPUT_EMAIL, email);
    }

    public Steps_OutlookPassword clickNext(){
        click(BTN_NEXT);
        return new Steps_OutlookPassword(driver);
    }
}
