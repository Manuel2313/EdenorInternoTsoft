package modelBase;

import modelBase.Steps_Base;
import org.openqa.selenium.WebDriver;

public class Steps_PopUp extends Steps_Base {

    public Steps_PopUp(WebDriver driver) {
        super(driver);
        String ventanaBase = driver.getWindowHandle();
        for(String ventana : driver.getWindowHandles()){
            driver.switchTo().window(ventana);
        }
        String ventanaNueva = driver.getWindowHandle();
    }
    public void validate(){
    }
}
