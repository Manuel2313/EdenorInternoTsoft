package modelBase;

import modelBase.Steps_Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Steps_PopUp extends Steps_Base {

    public Steps_PopUp(WebDriver driver) {
        super(driver);
        String ventanaBase = driver.getWindowHandle();
        for(String ventana : driver.getWindowHandles()){
            driver.switchTo().window(ventana);
        }
    }
    public void validate(){
    }
}
