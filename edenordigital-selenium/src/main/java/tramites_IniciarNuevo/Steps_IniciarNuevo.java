package tramites_IniciarNuevo;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_IniciarNuevo extends Steps_Base {

    private By HEADER = By.xpath("//span[text()='Iniciar nuevo']");
    private By BOTON_SALIR = By.xpath("//*[div[span[text()='Iniciar nuevo']]]//button");
    private By BOTON_CONTINUAR = By.xpath("//button/*[contains(text(),'Continuar')]");

    //ver esto
    private By TITULO_PASO1 = By.xpath("");
    private By TITULO_PASO2 = By.xpath("");
    private By TEMPLATE_OPCION_CATEGORIA = By.xpath("//*[*[span[contains(text(),'${categoria}')]] and @role='button']");
    private By TEMPLATE_OPCION_FORMULARIO = By.xpath("//*[*[span[contains(text(),'${formulario}')]] and @role='button']");

    public enum Categoria {
        DATOS_DE_CLIENTE("Datos de cliente"),
        FACTURACION("Facturación"),
        INSTALACIONES("Instalaciones");

        private String label;

        private Categoria(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public enum Formulario {
        //DENTRO DE DATOS DE CLIENTE
        ALTA_DEBITO_AUTOMATICO("Alta débito automático"),
        AMPLIAR_HABILITACION_DE_ACCESOS("Ampliar habilitación de accesos"),
        CAMBIO_DE_ACTIVIDAD("Cambio de actividad"),
        BAJA_DE_SUMINISTRO("Baja de suministro"),
        CAMBIO_TITULARIDAD("Cambio de Titularidad"),
        CONSULTA_TARIFA_SOCIAL("Consulta Tarifa Social"),
        ACTUALIZACION_DATOS("Actualización de datos"),
        //DENTRO DE FACTURACION
        REVISION_CONSUMO_FACTURADO("Revisión del consumo facturado - E"),
        RESUMEN_FACTURA_EN_BRAILLE("Resumen de factura en sistema braille"),
        PROBLEMAS_RECEPCION_FACTURA("Problemas en la recepción de factura"),
        CAMBIO_DE_DOMICILIO_POSTAL("Cambio de domicilio postal"),
        //DENTRO DE INSTALACIONES
        TRASLADO_POSTES_O_INSTALACIONES("Traslado de postes o instalaciones"),
        SOLICITUD_AUMENTO_POTENCIA("Solicitud aumento de potencia"),
        TRASLADO_MEDIDOR("Traslado de medidor"),
        CAMBIO_A_TRIFASICA("Cambio de instalación a trifásica"),
        MEDIDOR_NO_REGISTRA_CONSUMO("Medidor no registra consumos - E");

        private String label;

        private Formulario(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public Steps_IniciarNuevo(WebDriver driver) {
        super(driver);
        validate();
    }

    public void validate(){
        CustomAssert.assertTrue("No se encuentra header 'Iniciar nuevo'", waitForElementVisible(HEADER));
        CustomAssert.assertTrue("No se encuentra botón 'X salir'", waitForElementVisible(BOTON_SALIR));
    }

    public void seleccionarCategoria(Categoria categoria){
        CustomAssert.assertTrue("Opcion categoria" + categoria.getLabel() + "no visible", waitForElementVisible(TEMPLATE_OPCION_CATEGORIA));
        click(TEMPLATE_OPCION_CATEGORIA);
    }
    public void seleccionarFormulario(Formulario formulario){
        CustomAssert.assertTrue("Opcion formulario"+ formulario.getLabel() + "no visible",waitForElementVisible(TEMPLATE_OPCION_FORMULARIO));
        click(TEMPLATE_OPCION_FORMULARIO);
    }


}
