package misCuentas_configuracionDeLaCuenta_administrarDelegaciones;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Administrar_Delegaciones extends Steps_Base {
    //ver esto
    private By Button_Delete_template_por_Nombre = By.xpath("//div[@class='styles_container__fJRob' and .//*[contains(text(),'${nombre}')]]//button/following-sibling::button");
    private By Button_Agregar_Delegacion = By.xpath("//div[@class='styles_header__1f5K7' and //span[contains(text(),'Delegaciones')]]/button");
    private By Title_AdministrarDelegaciones = By.xpath("//span[text()='Administrar delegaciones']");

    public Steps_Administrar_Delegaciones(WebDriver driver) {
        super(driver);
        validate();
    }
    //ver esto
    public void clickBorrarDelegacion(String nombreDelegado){
        waitForElementVisible(Button_Delete_template_por_Nombre);
        click(Button_Delete_template_por_Nombre);
    }
    public void validate(){
        CustomAssert.assertTrue("No se encuentra botón  '+'", waitForElementVisible(Button_Agregar_Delegacion));
        CustomAssert.assertTrue("No se encuentra header 'Administrar delegaciones'", waitForElementVisible(Title_AdministrarDelegaciones));
    }
}
