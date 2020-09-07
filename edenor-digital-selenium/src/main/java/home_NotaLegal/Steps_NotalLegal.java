package home_NotaLegal;

import helper.CustomAssert;
import modelBase.Steps_PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_NotalLegal extends Steps_PopUp {
    public Steps_NotalLegal(WebDriver driver) {
        super(driver);
    }

    private By titulo_NotaLegal = By.xpath("//div[text()='Nota legal']");
    private By subtitulo_ProteccionDatosPersonales = By.xpath("//strong[text()='Protección de los Datos Personales']");

    public void validarNotaLegal(){
        CustomAssert.assertTrue("No se encuentra titulo 'Nota legal'",waitForElementVisible(titulo_NotaLegal));
        CustomAssert.assertTrue("No se encuentra titulo 'Protección de los Datos Personales'",waitForElementVisible(subtitulo_ProteccionDatosPersonales));
    }
}
