package login;

import login_RedSocial.Steps_Facebook;
import login_RedSocial.Steps_GmailUser;
import login_RedSocial.Steps_OutLookUser;
import login_RedSocial.Steps_Twitter;
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
    private static By GMAIL_LOGO = By.xpath("//button//span[contains(text(),'Google')]");
    private static By FB_LOGO = By.xpath("//button//span[contains(text(),'Facebook')]");
    private static By TWITTER_LOGO = By.xpath("//button//span[contains(text(),'Twitter')]");
    private static By OUTLOOK_LOGO = By.xpath("//button//span[contains(text(),'Outlook')]");


    public enum RedSocial {
        GMAIL(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[4]/span[1]/span/button")),
        FACEBOOK(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[4]/span[2]/button")),
        OUTLOOK(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[4]/span[3]/span/button/button")),
        TWITTER(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[4]/span[4]/tag/button"));

        private By logo;

        private RedSocial(By logo) {
            this.logo = logo;
        }

        public By logoRedSocial(){
            return logo;
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
        verifyAndClick(redSocial.logoRedSocial());
    }
    //Este es para el caso del Gmail y Facebook que con el verifyandclick no anda
    public void clickRedSocial(RedSocial redSocial){
        driver.findElement(redSocial.logoRedSocial()).click();
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


    public Steps_Starting clickTengoUsuarioRegistrarme(){
        click(noTengoUsuario);
        return new Steps_Starting(driver);
    }

    public void clickOlvideMiContrsena(){
        click(buttonOlvideContrasena);
    }

    public void clickVolverAInicioDeSesion(){
        click(buttonVolverAInicio);
    }

    public void  isGmailLogoVisible(){
        checkVisibility(GMAIL_LOGO);
    }

    public void isPasswordVisible(){
         checkVisibility(inputPassword);
    }

    public void  isSignInVisible(){
         checkVisibility(buttonSigIn);
    }

    public void  isIngresaConTuredSocialVisible(){
         checkVisibility(INGREA_CON_TU_RED_SOCIAL);
    }

    public void  isOlvideMiContrasenaVisible(){
         checkVisibility(buttonOlvideContrasena);
    }

    public void  isEdenorLogoVisible(){
         checkVisibility(EDENOR_LOGO_GRANDE);
    }

    public void  isTodaLainfoEnSuLugarVisible(){
         checkVisibility(TODA_LA_INFO_EN_SU_LUGAR);
    }

    public void  isDescargaTuUltimaFacturaVisible(){
         checkVisibility(DESCARGA_TU_ULTIMA_FACTURA);
    }

    public void  isPagaTusFacturasVisible(){
         checkVisibility(PAGA_TUS_FACTURAS);
    }

    public void  isGestionaTusCuentasVisible(){
         checkVisibility(GESTIONA_TUS_CUENTAS);
    }

    public Steps_OutLookUser clickOutlook(){
        verifyAndClick(OUTLOOK_LOGO);
        return new Steps_OutLookUser(driver);
    }

    public Steps_Facebook clickFacebook(){
        verifyAndClick(FB_LOGO);
        return new Steps_Facebook(driver);
    }

    public Steps_Twitter clickTwitter(){
        verifyAndClick(TWITTER_LOGO);
        return new Steps_Twitter(driver);
    }

    public Steps_GmailUser clickGmail(){
        verifyAndClick(GMAIL_LOGO);
        return new Steps_GmailUser(driver);
    }







}
