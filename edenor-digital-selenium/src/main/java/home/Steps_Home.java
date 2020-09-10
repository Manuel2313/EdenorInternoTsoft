package home;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Home extends Steps_Base {


    private By TEXTO_NOTA_LEGAL = By.xpath("//*[text()='Nota legal']");
    private By TEXTO_POLITICAS_DE_PRIVACIDAD = By.xpath("//*[text()='Política de privacidad']");
    private By OPCION_TRAMITES = By.xpath("//*[@role='button']//*[contains(text(),'Trámites')]");
    private By OPCION_SERVICIO_TECNICO = By.xpath("//*[@role='button']//*[contains(text(),'Servicio Técnico')]");
    private By OPCION_NOTIFICACIONES = By.xpath("//*[@role='button']//*[contains(text(),'Notificaciones')]");
    private By TEXTO_BIENVENIDA = By.xpath("//*[contains(text(),'Hola')]");
    private By LOGO_ED = By.xpath("//*[@class='styles_item__4CtB_ styles_image__3yqtY']");
    private By LOGO_FB = By.xpath("//img[@src='/static/media/facebook-white.0d695261.svg']");
    private By LOGO_TWITTER = By.xpath("//img[@src='/static/media/twitter-white.11cbf943.svg']");
    private By LOGO_YT = By.xpath("//img[@src='/static/media/youtube-white.28dc2944.svg']");
    private By LOGO_NOTA_LEGAL = By.xpath("//*[text()='Nota legal']");
    private By LOGO_POLITICA_DE_PRIVACIDAD = By.xpath("//*[text()='Política de privacidad']");
    private By buttonUser = By.xpath("//*[contains(text(),'Hola,')]");
    private By OPCIONES_MIS_CUENTAS = By.xpath("//*[@role='button']//*[contains(text(),'Mis cuentas')]");


    public enum RedSocialSeguinos {
        FACEBOOK("https://www.facebook.com/edenoroficial/",By.xpath("//img[@src='/static/media/facebook-white.0d695261.svg']")),
        TWITTER("https://twitter.com/edenorclientes?lang=es",By.xpath("//img[@src='/static/media/twitter-white.11cbf943.svg']")),
        YOUTUBE("https://www.youtube.com/user/EdenorOficial",By.xpath("//img[@src='/static/media/youtube-white.28dc2944.svg']")),
        LINKEDIN("https://www.linkedin.com/company/edenor",By.xpath("//img[@src='todavia nunca estuvo el logo']"));

        private String urlPerfilEdenor;
        private By Object;
        private RedSocialSeguinos(String urlPerfilEdenor, By Object){
            this.urlPerfilEdenor=urlPerfilEdenor;
            this.Object=Object;
        }
        public By getObject() {
            return Object;
        }

        public String getUrlPerfilEdenor() {
            return urlPerfilEdenor;
        }

    }

    public void clickSeguinosEnRedSocial(RedSocialSeguinos redSocial){
        CustomAssert.assertTrue("No se encontro incono de red social",waitForElementClickable(redSocial.getObject()));
        click(redSocial.getObject());
    }

    public Steps_Home(WebDriver driver) {
        super(driver);
            isOpcionMisCuentasVisible();
            isOpcionTramitesVisible();
            isOpcionServicioTecnicoVisible();
            isOpcionNotificacionesVisible();
            isTextoBienvenidaVisible();
    }

    public void clickMiUsuario(){
        click(buttonUser);
    }
    public void clickMisCuentas(){
        click(OPCIONES_MIS_CUENTAS);
    }

    public void clickTramites(){
        click(OPCION_TRAMITES);
    }

    public void clickNotaLegal(){
        click(TEXTO_NOTA_LEGAL);
    }

    public void  clickPoliticasDePrivacidad(){
        click(TEXTO_POLITICAS_DE_PRIVACIDAD);
    }

    public void  clickNotificaciones(){
        click(OPCION_NOTIFICACIONES);
    }

    public void isLogoEDVisible(){
        checkVisibility(LOGO_ED);
    }

    public void islofoFBVisible(){
        checkVisibility(LOGO_FB);
    }

    public void islogoTwitterVisible(){
         checkVisibility(LOGO_TWITTER);
    }

    public void isLogoYTVisible(){
        checkVisibility(LOGO_YT);
    }

    public void isLogoNotaLegalVisible(){
        checkVisibility(LOGO_NOTA_LEGAL);
    }

    public void isLogoPoliticaDePrivacidadVisible(){
        checkVisibility(LOGO_POLITICA_DE_PRIVACIDAD);
    }

    public void isOpcionMisCuentasVisible(){
         checkVisibility(OPCIONES_MIS_CUENTAS);
    }

    public void isOpcionTramitesVisible(){
         checkVisibility(OPCION_TRAMITES);
    }

    public void isOpcionServicioTecnicoVisible(){
         checkVisibility(OPCION_SERVICIO_TECNICO);
    }

    public void isOpcionNotificacionesVisible(){
         checkVisibility(OPCION_NOTIFICACIONES);
    }

    public void isTextoBienvenidaVisible(){
         checkVisibility(TEXTO_BIENVENIDA);
    }
}
