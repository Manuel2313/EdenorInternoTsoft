package helper;

import helper.Context;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public abstract class Operations extends Context {

    public Operations(WebDriver driver) {
        super(driver);
    }
    JavascriptExecutor js = (JavascriptExecutor)driver;

    public boolean isElementVisible(By locator){
        try{
            wait.until(visibilityOfElementLocated(locator));
            return true;
        }catch (TimeoutException e){
            return false;
        }
    }
    public void ingresarCampo(By locator, String text){
        waitForElementVisible(locator);
        driver.findElement(locator).sendKeys(text);
    }
    public void click(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).click();
    }
    public void visit(String url){
        driver.get(url);
    }

    public void seleccionarElementoDeSelect(By locator,String elem){
      WebElement genero = driver.findElement(locator);
      genero.click();
      List<WebElement> options = driver.findElements(By.tagName("li"));
        for (int i = 0; i < options.size() ; i++) {
            if (options.get(i).getAttribute("data-value").equalsIgnoreCase(elem)){
                options.get(i).click();
            }

        }
    }

    public void verifyAndClick(By locator){
        waitForElementVisible(locator);
        clickWithJavascript(locator);
    }

    public void clickWithJavascript(By Button){
        WebElement button = driver.findElement(Button);
        js.executeScript("arguments[0].click();", button);
    }








}
