package login;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Starting extends Steps_Base {


    public Steps_Starting(WebDriver driver) {
        super(driver);
        //validate();
    }
    private By buttonContinuarConEmail = By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[4]/a[1]/button");

    public void clickButtonIngresarConEmail(){
        //isElementVisible(buttonContinuarConEmail);
        click(buttonContinuarConEmail);
    }
    public void validate(){
        CustomAssert.assertTrue(driver.findElement(buttonContinuarConEmail).isDisplayed(),"no se encuentra boton e-mail");
    }

}
