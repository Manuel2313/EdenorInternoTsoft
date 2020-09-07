package registro;

import helper.CustomAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import registro.Steps_Registro;

public class Steps_Registro_InicioDelRegistro extends Steps_Registro {


    private By inputDNI = By.xpath("//*[text()='Número de DNI']/..//input");
    private By inputCodArea = By.xpath("//*[@name= 'area_code']");
    private By inputTelefono = By.xpath("//*[@name= 'phone_number']");
    private By buttonContinuar = By.xpath("//*[@type='submit']");
    private By genero = By.id("mui-component-select-id4");
    private By label_dni_formato_invalido = By.xpath("//*[contains(@class,'Mui-error') and text()='Formato inválido']");

    public Steps_Registro_InicioDelRegistro(WebDriver driver) {
        super(driver);
    }
    public void ingresarDni(String dni){
        ingresarCampo(inputDNI,dni);
    }
    public void ingresarCodArea(String codarea){
        ingresarCampo(inputCodArea,codarea);
    }
    public void ingresarTel(String telefono){
        ingresarCampo(inputTelefono,telefono);
    }
    public void seleccionarGenero(String text){
        seleccionarElementoDeSelect(genero,text);
    }
    public void clickButtonContinuar(){
        click(buttonContinuar);
    }

    public void verificarErrorDNIFormatoInvalido(){
        CustomAssert.assertTrue(waitForElementVisible(label_dni_formato_invalido),"No aparece el mesnaje formato invalido de DNI");
    }
}
