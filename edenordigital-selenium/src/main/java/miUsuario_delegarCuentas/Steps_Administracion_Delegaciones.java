package miUsuario_delegarCuentas;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Administracion_Delegaciones extends Steps_Base {

    private By button_Guardar = By.xpath("//button[@type='submit']");
    private By Button_Volver = By.xpath("//button/span[text()='Volver']");
    private By checkbox_Seleccionar_Todas = By.xpath("//*[@class='MuiIconButton-label']//following::span[26]");
    private By checkbox_template = By.xpath("//*[contains(text(),'${direccion_de_cuenta}')]/..//*[@type='checkbox']");
    private By contenedor_DeOpciones = By.xpath("//ul[li[@role='option']]");
    private By div_SE_est_procesando_su_solic = By.xpath("//div[(contains(text(), 'realizada') or contains(., 'realizada'))]");
    private By div_SeleccionPerfil = By.xpath("//div[@id='root']/div[2]/div[2]/div[3]/form/div/div/div[7]/div/div/div/div");
    private By Header_Administracion_De_Delegaciones = By.xpath("//*[text() = 'Administración de delegaciones']");
    private By input_Apellido = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Apellido'])[1]/following::input[1]");
    private By input_CodArea = By.xpath("//input[@name = 'area_code' and @type = 'tel']");
    private By input_DNI = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::input[2]");
    private By input_Email = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::input[1]");
    private By input_Nombre = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nombre'])[1]/following::input[1]");
    private By input_Telefono = By.xpath("//input[@name = 'phone_number' and @type = 'tel']");
    //ver estos dos
    private By template_dropDown = By.xpath("//*[@id = '${dropdown}']");
    private By template_OpcionesDropdown = By.xpath("//li[text()='${opcion}']/span");



    public Steps_Administracion_Delegaciones(WebDriver driver) {
        super(driver);
    }

    public void validate(){
        CustomAssert.assertTrue("No se encuentra header en menú 'Administracion de delegaciones' ", waitForElementVisible(Header_Administracion_De_Delegaciones));
        CustomAssert.assertTrue("No se encuentra botón 'Volver' en menú 'Administracion de delegaciones' ",waitForElementVisible(Button_Volver));
    }

    public void ingresarNombre(String nombre){
        CustomAssert.assertTrue("No se encuentra campo de texto 'Nombre'", waitForElementVisible(input_Nombre));
        ingresarCampo(input_Nombre,nombre);
    }

    public void ingresarApellido(String apellido){
        CustomAssert.assertTrue("No se encuentra campo de texto 'Nombre'", waitForElementVisible(input_Apellido));
        ingresarCampo(input_Apellido,apellido);
    }

    public void ingresarEmail(String email){
        CustomAssert.assertTrue("No se encuentra campo de texto 'Nombre'", waitForElementVisible(input_Email));
        ingresarCampo(input_Email,email);
    }

    public void ingresarDNI(String dni){
        CustomAssert.assertTrue("No se encuentra campo de texto 'Nombre'", waitForElementVisible(input_DNI));
        ingresarCampo(input_DNI,dni);
    }

    public void ingresarCodArea(String codArea){
        CustomAssert.assertTrue("No se encuentra campo de texto 'Nombre'", waitForElementVisible(input_CodArea));
        ingresarCampo(input_CodArea,codArea);
    }

    public void ingresarTelefono(String telefono){
        CustomAssert.assertTrue("No se encuentra campo de texto 'Nombre'", waitForElementVisible(input_Telefono));
        CustomAssert.assertTrue("Campo de texto 'Telefono' no interactuable",waitForElementClickable(input_Telefono));
        ingresarCampo(input_Telefono,telefono);
    }

    public void seleccionarGenero(String opcionGenero){
        seleccionarElementoDeSelect(template_dropDown,opcionGenero);
    }
    public void seleccionarRelacionCuentas(String opcionGenero){
        seleccionarElementoDeSelect(template_dropDown,opcionGenero);
    }
    public void seleccionarPerfilUsuario(String opcionGenero){
        seleccionarElementoDeSelect(template_dropDown,opcionGenero);
    }

    public void guardar(){
        CustomAssert.assertTrue("No se encuentra el botón 'Guardar'", waitForElementVisible(button_Guardar));
        driver.findElement(button_Guardar).click();
    }

    public void validarDelegacionGuardadaCorrectamente(){
        //waitForAlertDialog("La delegación fue realizada correctamente.")
    }















}
