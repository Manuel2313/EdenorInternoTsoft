package home_PoliticaDePrivacidad;

import helper.CustomAssert;
import modelBase.Steps_PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Politica_De_Privacidad extends Steps_PopUp {
    public Steps_Politica_De_Privacidad(WebDriver driver) {
        super(driver);
    }

    private By Titulo_Politicas_De_privacidad = By.xpath("//div[text()='Política de privacidad']");
    private By Subtitulos_template = By.xpath("");

    public void validarTituloPoliticaDePrivacidad(){
        CustomAssert.assertTrue("No se encuentra titulo 'Politica de privacidad", waitForElementPresent(Titulo_Politicas_De_privacidad));
    }

    private void validarSubtitulo(String texto){
        CustomAssert.assertTrue("No se encuentra subtitulo"+texto+"'",driver.findElement(Subtitulos_template).isDisplayed());
    }

    public void validarSubtitulos(){

        validarSubtitulo("Términos Legales y Condiciones de Uso");
        validarSubtitulo("Derechos de propiedad intelectual");
        validarSubtitulo("Violación a estos términos y condiciones");
        validarSubtitulo("El Titular de los Datos que decide ingresar sus datos personales manifiesta conocer y aceptar lo siguiente:");
        validarSubtitulo("Política de Confidencialidad y Protección de Datos");
        validarSubtitulo("Información Específica para el Titular de los Datos");
        validarSubtitulo("Opciones del Titular de los Datos de Modificar la Información Suministrada");
        validarSubtitulo("Política de Confidencialidad y Protección de Datos");
    }


}
