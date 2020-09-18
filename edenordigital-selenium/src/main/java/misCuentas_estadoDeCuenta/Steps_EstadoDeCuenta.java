package misCuentas_estadoDeCuenta;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_EstadoDeCuenta extends Steps_Base {

    private By Button_Pagar_Con_Tarjeta = By.xpath("//button/span[text()='Pagar con tarjeta']");
    private By Radio_Saldo_Total = By.xpath("//*[@type='radio' and @value='Saldo Total']");
    private By Value_Saldo_Total = By.xpath("//*[@type='radio' and @value='Saldo Total']/following::span[4]");

    public Steps_EstadoDeCuenta(WebDriver driver) {
        super(driver);
    }

    public void validate(){
        CustomAssert.assertTrue("No se encuentra botón 'Pagar con tarjeta' ",waitForElementClickable(Button_Pagar_Con_Tarjeta));
        CustomAssert.assertTrue("No se encuentra opción 'Saldo total' ",waitForElementClickable(Radio_Saldo_Total));
        //CustomAssert.assertTrue("No se encuentra opción 'Factura actual' ",waitForElementClickable("Object Repository/Page_Home/Page_Mis_Cuentas/Page_Estado_De_Cuenta/Radio_Factura_Actual"))
        CustomAssert.assertTrue("botón 'Pagar con tarjeta' no clickeable ",waitForElementClickable(Button_Pagar_Con_Tarjeta));
    }

    public String obtenerSaldoTotal(){
        validate();
        return driver.findElement(Value_Saldo_Total).getText();
    }
    public void verificarSalgoTotal(String saldo){
        CustomAssert.assertEquals(obtenerSaldoTotal(), saldo);
    }


}
