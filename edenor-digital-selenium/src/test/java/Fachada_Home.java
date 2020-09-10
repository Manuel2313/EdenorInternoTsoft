import home.Steps_Home;
import home_NotaLegal.Steps_NotaLegal;
import home_PoliticaDePrivacidad.Steps_Politica_De_Privacidad;
import misCuentas.Steps_MisCuentas;
import modalBienvenida.Steps_ModalBienvenida;

public class Fachada_Home extends BaseTest {
    private Steps_Home stepsHome = new Steps_Home(driver);
    private Steps_ModalBienvenida stepsModalBienvenida;
    private Steps_NotaLegal stepsNotaLegal;
    private Steps_Politica_De_Privacidad stepsPoliticasDePrivacidad;
    private Steps_MisCuentas stepsMisCuentas;

    public void abrirMiUsuario(){
        stepsHome.clickMiUsuario();
    }

    public void cerrarBienvenida() {
        Steps_ModalBienvenida sm =  new Steps_ModalBienvenida(driver);
        //Thread.sleep(2000);
        sm.cerrarBienvenida();
    }

    public void verificarNotaLegal(){
        stepsHome.clickNotaLegal();
        stepsHome.verificarNuevaVentanaConURL("https://www.edenor.com/nota-legal");
        stepsNotaLegal = new Steps_NotaLegal(driver);
        stepsNotaLegal.validarNotaLegal();
    }
    public void verificarPoliticasDePrivacidad(){
        stepsHome.clickPoliticasDePrivacidad();
        stepsHome.verificarNuevaVentanaConURL("https://www.edenor.com/politica-de-privacidad");
        stepsPoliticasDePrivacidad = new Steps_Politica_De_Privacidad(driver);
        stepsPoliticasDePrivacidad.validarTituloPoliticaDePrivacidad();
        stepsPoliticasDePrivacidad.validarSubtitulos();
    }
    public void verificarElementosMisCuentas(){
        stepsHome.clickMisCuentas();
        stepsMisCuentas = new Steps_MisCuentas(driver);//validate() en constructor
    }

    public void verificarSeguinosEnRedesSociales(Steps_Home.RedSocialSeguinos redSocial){
        stepsHome.clickSeguinosEnRedSocial(redSocial);
        stepsHome.verificarNuevaVentanaConURL(redSocial.getUrlPerfilEdenor());
    }


}
