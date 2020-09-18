package tramites;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Tramites extends Steps_Base {

    private By HEADER = By.xpath("//div[span[text()='Trámites'] and preceding-sibling::*[@role='presentation']]");
    private By BOTON_VOLVER = By.xpath("//*[div[span[text()='Trámites']]]//button");
    private By BOTON_INICIAR_NUUEVO = By.xpath("//button//*[text()='Iniciar Nuevo']");


    public Steps_Tramites(WebDriver driver) {
        super(driver);
    }

    public void validate(){
        CustomAssert.assertTrue("No se encuentra header", waitForElementVisible(HEADER));
        CustomAssert.assertTrue("No se encuentra botón 'Iniciar nuevo'", waitForElementVisible(BOTON_INICIAR_NUUEVO));
        CustomAssert.assertTrue("No se encuentra botón 'Volver'", waitForElementVisible(BOTON_VOLVER));
    }

    public void clickIniciarNuevo(){
        click(BOTON_INICIAR_NUUEVO);
    }

}
