package misCuentas_AsociaTuCuenta;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_AsociaTuCuenta extends Steps_Base {

    private final By OPCION_NUMERO_DE_CUENTA = By.xpath("//button[@role='tab']//*[contains(text(),'Cuenta')]");
    private final By OPCION_NUEMRO_MIDE = By.xpath("//button[@role='tab']//*[contains(text(),'MIDE')]");
    private final By INPUT_NUMERO = By.xpath("//input[@type='text']");
    private final By BTN_ACEPTAR = By.xpath("//button/*[text()='Aceptar']");
    private final By DROPDOWN_RELACION_CON_LAS_CUENTAS = By.xpath("//*[@id = 'mui-component-select-relationship']");
    private final By OPCIONES_DROPDOWN = By.xpath("");
    private final By CONTENEDOR_DE_OPCIONES = By.xpath("");
    private final By BTN_CERRAR_VENTANA = By.xpath("//*[text()='Asociá tu cuenta']/button");

    public Steps_AsociaTuCuenta(WebDriver driver) {
        super(driver);
    }

    public static enum OpcionesAsociaTuCuenta{
        N_CUENTA,
        CUIT,
        MIDE
    }

    public void  clickOpcion(OpcionesAsociaTuCuenta opcion) {
        switch(opcion){
            case N_CUENTA:
                click(OPCION_NUMERO_DE_CUENTA);
                break;
            case MIDE:
                click(OPCION_NUEMRO_MIDE);
                break;
            default:
                break;
        }
    }


    public void  ingresarNumero(String numero){
        click(INPUT_NUMERO);
        ingresarCampo(INPUT_NUMERO, numero);
    }

    public void clickAceptar(){
        click(BTN_ACEPTAR);
    }
    public void  cerrarVentana(){
        waitForElementVisible(BTN_CERRAR_VENTANA);
        driver.findElement(BTN_CERRAR_VENTANA).click();
    }



}
