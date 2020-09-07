package tramites_IniciarNuevo;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_IniciarNuevo extends Steps_Base {

    private By HEADER = By.xpath("//span[text()='Iniciar nuevo']");
    private By BOTON_SALIR = By.xpath("//*[div[span[text()='Iniciar nuevo']]]//button");
    private By BOTON_CONTINUAR = By.xpath("//button/*[contains(text(),'Continuar')]");

    //ver esto
    private By TITULO_PASO1 = By.xpath("");
    private By TITULO_PASO2 = By.xpath("");
    private By TEMPLATE_OPCION_CATEGORIA = By.xpath("//*[*[span[contains(text(),'${categoria}')]] and @role='button']");
    private By TEMPLATE_OPCION_FORMULARIO = By.xpath("//*[*[span[contains(text(),'${formulario}')]] and @role='button']");

    public Steps_IniciarNuevo(WebDriver driver) {
        super(driver);
    }

    public void validate(){
        CustomAssert.assertTrue("No se encuentra header 'Iniciar nuevo'", waitForElementVisible(HEADER));
        CustomAssert.assertTrue("No se encuentra botón 'X salir'", waitForElementVisible(BOTON_SALIR));
    }
}
