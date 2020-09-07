package helper;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Context {
    protected WebDriver driver;
    WebDriverWait wait;

    public Context(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

    public boolean waitForElementVisible(By locator){
        try{
            wait.until(visibilityOfElementLocated(locator));
            return true;
        }catch (TimeoutException e){
            return false;
        }
    }

    public boolean waitForElementClickable(By locator){
        try{
            wait.until(elementToBeClickable(locator));
            return true;
        }catch (TimeoutException e){
            return false;
        }
    }
    public boolean waitForElementPresent(By locator){
        return driver.findElements(locator).size()>0;
    }

    public boolean checkVisibility(By locator){
        if (driver.findElement(locator).isDisplayed())
            return true;
        else
            return false;
    }
    //private By textAlert = By.xpath("/div/div");
    public void waitForAlertDialog(String text){
        //wait.until(ExpectedConditions.alertIsPresent());
        //Alert alert = driver.switchTo().alert();
        //alert.dismiss();
        //CustomAssert.assertTrue(driver.findElement(textAlert).getText().equalsIgnoreCase(text),"No se encontro Alerta");
    }






}
