package misCuentas_historialDePagosYFacturas;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_HistorialDePagosYFacturas extends Steps_Base {

    private By Title_Monto = By.xpath("//*[contains(text(),'Mis pagos')]/following::div[6]");
    private By Title_Primer_Vencimiento = By.xpath("//*[contains(text(),'Mis pagos')]/following::div[9]");
    private By Value_Monto = By.xpath("//*[contains(text(),'Mis pagos')]/following::div[7]");
    private By Value_Primer_Vencimiento = By.xpath("//*[contains(text(),'Mis pagos')]/following::div[10]");

    public Steps_HistorialDePagosYFacturas(WebDriver driver) {
        super(driver);
    }

    public void validate(){
        CustomAssert.assertTrue("Titulo Monto no encontrado", waitForElementPresent(Title_Monto));
        CustomAssert.assertTrue("Titulo Monto no visible", waitForElementVisible(Title_Monto));
        CustomAssert.assertTrue("Titulo Primer Vencimiento", waitForElementPresent(Title_Primer_Vencimiento));
        CustomAssert.assertTrue("Valor Monto", waitForElementPresent(Value_Monto));
        CustomAssert.assertTrue("Valor Primer Vencimiento", waitForElementPresent(Value_Primer_Vencimiento));
    }
}
