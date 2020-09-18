package registro;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Registro_Validacion_Email extends Steps_Base {
    public Steps_Registro_Validacion_Email(WebDriver driver) {
        super(driver);
        driver.findElements(HEADER);
        //waitForElementPresent(HEADER);
    }
    private By HEADER = By.xpath("//*[@class='styles_containerTitle__1YFQa']//*[text()='Validá tu e-mail']");
    private By CODIGO = By.xpath("//*[text()='Código verificador']/following-sibling::*/input");
    private By CONTINUAR = By.xpath("//*[contains(@class,'MuiButton-label')] ");

    public void ingresarCodigo(String text){
        ingresarCampo(CODIGO,text);
    }
    public void clickSiguiente(){
        click(CONTINUAR);
    }

    public void validatee(){
        checkVisibility(HEADER);
    }
}
