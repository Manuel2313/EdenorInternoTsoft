package registro;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Registro extends Steps_Base {

    private By ERROR_MSG = By.xpath("//*[contains(@class,'MuiSnackbar')] ");

    public Steps_Registro(WebDriver driver) {
        super(driver);
    }

    public void isErrorMsgVisible(){
         checkVisibility(ERROR_MSG);
    }

}
