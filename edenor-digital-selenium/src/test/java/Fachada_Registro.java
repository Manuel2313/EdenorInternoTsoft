import helper.Steps_EmailReader;
import registro.Steps_Registro;
import registro.Steps_Registro_InicioDelRegistro;
import registro.Steps_Registro_Validacion_De_Datos;
import registro.Steps_Registro_Validacion_Email;

public class Fachada_Registro extends BaseTest {

    private  Steps_Registro_InicioDelRegistro stepsRegistroInicioDelRegistro;
    private  Steps_Registro_Validacion_De_Datos stepsRegistroValidacionDatos;
    private  Steps_Registro_Validacion_Email stepsRegistroValidacionEMail;
    private Steps_Registro stepsRegistro;
    private Steps_EmailReader stepsEmail;

    public void completarInicioDelRegistro(String dni, String genero, String area, String telefono) {
        Steps_Registro_InicioDelRegistro sri = new Steps_Registro_InicioDelRegistro(driver);
        sri.ingresarDni(dni);
        sri.seleccionarGenero(genero);
        sri.ingresarCodArea(area);
        sri.ingresarTel(telefono);
        sri.clickButtonContinuar();
    }
    public void validacionDatosPersonales(){
        Steps_Registro_Validacion_De_Datos srvdd = new Steps_Registro_Validacion_De_Datos(driver);
        srvdd.ingresarDatosDeValidacion();
        srvdd.clickButtonSiguiente();
    }

    public void completarValidacionDeEMail(String codigo){
        stepsRegistroValidacionEMail = new Steps_Registro_Validacion_Email(driver);
        stepsRegistroValidacionEMail.ingresarCodigo(codigo);
        stepsRegistroValidacionEMail.clickSiguiente();
    }
    /*
    public String getVerificationCode(Steps_EmailReader.EmailAccount account){
       // stepsEmail = new Steps_EmailReader(driver);
        //return stepsEmail.getVerificationCodeFromLastEmail(account);
    }
     */


    
}
