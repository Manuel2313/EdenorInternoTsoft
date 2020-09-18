package login_RecuperarContraseña;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_RecuperarContraseña extends Steps_Base {
    public Steps_RecuperarContraseña(WebDriver driver) {
        super(driver);
    }
    private By INPUT_EMAIL = By.xpath("//input[@type = 'text']");
    private By BOTON_VOLVER = By.xpath("//span[text() = 'Volver']");
    private By BOTON_ENVIAR_SOLICITUD = By.xpath("//button[@type = 'submit']/*[text()='ENVIAR SOLICITUD']");
    private By TITULO = By.xpath("//*[text()='Recuperar contraseña']");
    private By MENSAJE_EMAIL_INVALIDO = By.xpath("//*[contains(@class,'MuiFormHelperText')]");



    public void ingresarMail(String mail){
        ingresarCampo(INPUT_EMAIL,mail);
    }
    public void cliclEnviarSolicitud(){
        click(BOTON_ENVIAR_SOLICITUD);
    }
    public void clickVolver(){
        click(BOTON_VOLVER);
    }
    public boolean isTitleVisible(){
        return isElementVisible(TITULO);
    }
    public boolean isMensajeMailIncorrectoVisible(){
        return isElementVisible(MENSAJE_EMAIL_INVALIDO);
    }
}
