package misCuentas_ConfiguracionDeLaCuenta;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_ConfiguracionDeLaCuenta extends Steps_Base {

    private By address = By.xpath("//span[text()='Dirección']//following::span[1]");
    private By nroCuenta = By.xpath("//span[text()='Número de cuenta']//following::span[1]");
    private By nomTitular = By.xpath("//span[text()='Nombre del titular']//following::span[1]");
    private By nroTarifa = By.xpath("//span[text()='Tarifa']//following::span[1]");
    private By debito = By.xpath("//span[text()='Débito automático']//following::span[1]");
    private By buttonDesasociar = By.xpath("//button/*[text()='Desasociar cuenta']");
    private By perFil = By.xpath("//span[text()='Perfil']//following::span[1]");
    private By relacionCuenta = By.xpath("//span[text()='Relación con cuenta']//following::span[1]");
    private By admDelegaciones = By.xpath("//div[./span[contains(text(),'Delegar cuentas')]]");
    private By estado = By.xpath("//span[text()='Estado']//following::span[1]");


    public Steps_ConfiguracionDeLaCuenta(WebDriver driver) {
        super(driver);
    }

    public void verificarDireccion(String direccion){
        CustomAssert.assertequalsText("Textos Distintos",driver.findElement(address).getText(),direccion);
    }
    public void verificarNumeroCuenta(String numeroDeCuenta){
        CustomAssert.assertequalsText("Textos Distintos",driver.findElement(nroCuenta).getText(),numeroDeCuenta);
    }
    public void verificarNombreTitular(String nombreTitular){
        CustomAssert.assertequalsText("Textos Distintos",driver.findElement(nroCuenta).getText(),nombreTitular);
    }
    public void verificarEstado(String estadoo){
        CustomAssert.assertequalsText("Textos Distintos",driver.findElement(estado).getText(),estadoo);
    }
    public void verificarTarifa(String tarifa){
        CustomAssert.assertequalsText("Textos Distintos",driver.findElement(nroTarifa).getText(),tarifa);
    }
    public void verificarDebitoAutimatico(String nroDebito){
        CustomAssert.assertequalsText("Textos Distintos",driver.findElement(debito).getText(),nroDebito);
    }
    public void clickDesasociar(){
        click(buttonDesasociar);
    }
    public void validarPerfil(String perfil){
        CustomAssert.assertequalsText("Textos Distintos",driver.findElement(perFil).getText(),perfil);
    }
    public void validarRelacionConLaCuenta(String relacion){
        CustomAssert.assertequalsText("Textos Distintos",driver.findElement(relacionCuenta).getText(),relacion);
    }
    public void clickAdminDelegaciones(){
        click(admDelegaciones);
    }


}
