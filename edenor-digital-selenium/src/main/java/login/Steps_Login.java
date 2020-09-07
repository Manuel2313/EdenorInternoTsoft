package login;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Steps_Login extends Steps_Base {

    private By inputMail = By.xpath("//input[@type = 'text']");
    private By inputPassword = By.xpath("//input[@type='password']");
    private By buttonSigIn = By.xpath("//button/span[contains(text(),'Ingresar')]");
    private By buttonOlvideContrasena = By.xpath("//*[(text() = 'Olvidé mi contraseña')]");
    private By buttonVolverAInicio = By.xpath("//span[text()='Volver al inicio']");
    private By noTengoUsuario = By.xpath("//button[.//*[text()='Ingresar']]/following-sibling::Button");
    private By INGREA_CON_TU_RED_SOCIAL = By.xpath("//span[contains(text(),'Ingresá con tu red social')]");
    private By EDENOR_LOGO_GRANDE = By.id("Proceso-de-login");//By.xpath("//*[@id=logo/edenor-blanco2]");
    private By TODA_LA_INFO_EN_SU_LUGAR = By.xpath("//span[contains(text(),'Toda la información de tu servicio en un solo lugar.')]");
    private By DESCARGA_TU_ULTIMA_FACTURA = By.xpath("//span[contains(text(),'Mirá tu factura')]");
    private By PAGA_TUS_FACTURAS = By.xpath("//span[contains(text(),'Pagá tus facturas')]");
    private By GESTIONA_TUS_CUENTAS = By.xpath("//span[contains(text(),'Gestioná tus trámites')]");
    private By GMAIL_LOGO = By.xpath("//button//span[contains(text(),'Google')]");
    private By FB_LOGO = By.xpath("//button//span[contains(text(),'Facebook')]");
    private By TWITTER_LOGO = By.xpath("//button//span[contains(text(),'Twitter')]");
    private By OUTLOOK_LOGO = By.xpath("//button//span[contains(text(),'Outlook')]");

    public enum RedSocial {
        GMAIL,
        FACEBOOK,
        OUTLOOK,
        TWITTER,
        OTRA_RED_SOCIAL;

        private static By testObjectPathLogo;

        public static By getTestObjectPathLogo() {
            return testObjectPathLogo;
        }
    }

    public Steps_Login(WebDriver driver) {
        super(driver);
        isEdenorLogoVisible();
        isTodaLainfoEnSuLugarVisible();
        isDescargaTuUltimaFacturaVisible();
        isPagaTusFacturasVisible();
        isGestionaTusCuentasVisible();
    }

    public void seleccionarRedSocial(RedSocial redSocial){
        click(RedSocial.getTestObjectPathLogo());
    }

    public void ingrearEmail(String mail){
        ingresarCampo(inputMail,mail);
    }
    public void ingresarPassword(String pass){
        ingresarCampo(inputPassword,pass);
    }
    public void clickSiguiente (){
        click(buttonSigIn);
    }
    public void clickTengoUsuarioRegistrarme(){
        click(noTengoUsuario);
    }

    public void clickOlvideMiContrsena(){
        click(buttonOlvideContrasena);
    }
    public void clickVolverAInicioDeSesion(){
        click(buttonVolverAInicio);
    }

    public boolean isGmailLogoVisible(){
        return checkVisibility(GMAIL_LOGO);
    }

    public boolean isPasswordVisible(){
        return checkVisibility(inputPassword);
    }

    public boolean isSignInVisible(){
        return checkVisibility(buttonSigIn);
    }

    public boolean isIngresaConTuredSocialVisible(){
        return checkVisibility(INGREA_CON_TU_RED_SOCIAL);
    }

    public boolean isOlvideMiContrasenaVisible(){
        return checkVisibility(buttonOlvideContrasena);
    }

    public boolean isEdenorLogoVisible(){
        return checkVisibility(EDENOR_LOGO_GRANDE);
    }

    public boolean isTodaLainfoEnSuLugarVisible(){
        return checkVisibility(TODA_LA_INFO_EN_SU_LUGAR);
    }

    public boolean isDescargaTuUltimaFacturaVisible(){
        return checkVisibility(DESCARGA_TU_ULTIMA_FACTURA);
    }

    public boolean isPagaTusFacturasVisible(){
        return checkVisibility(PAGA_TUS_FACTURAS);
    }

    public boolean isGestionaTusCuentasVisible(){
        return checkVisibility(GESTIONA_TUS_CUENTAS);
    }

}
