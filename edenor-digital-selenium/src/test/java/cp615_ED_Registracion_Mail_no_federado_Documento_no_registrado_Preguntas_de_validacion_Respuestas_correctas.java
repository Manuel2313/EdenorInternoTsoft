import helper.Utils;
import login.Steps_Login;
import org.testng.annotations.Test;
import registro.Steps_Registro_Validacion_Email;

public class cp615_ED_Registracion_Mail_no_federado_Documento_no_registrado_Preguntas_de_validacion_Respuestas_correctas extends BaseTest {
    //615 ED. Registracion. Mail no federado. Documento no registrado. Preguntas de validacion. Respuestas correctas

    private String dni ="11123321";
    private String genero="Male";
    private String area ="11";
    private String telefono ="22334455";

    private String email = "pruebadeqa17@gmail.com";
    private String pass = "Edenor2018";

    @Test
    public void cp615() throws InterruptedException {
        Steps_Login sl = new Steps_Login(driver);
        //Thread.sleep(6000);
        sl.clickTengoUsuarioRegistrarme();
        Fachada_Registro_Login frl = new Fachada_Registro_Login();
        frl.registrar(email,pass);
        //Thread.sleep(6000);
        Fachada_Registro fr = new Fachada_Registro();
        fr.completarInicioDelRegistro(dni,genero,area,telefono);
        //Thread.sleep(4000);
        fr.validacionDatosPersonales();
        Steps_Registro_Validacion_Email srve = new Steps_Registro_Validacion_Email(driver);
        //Thread.sleep(8000);
        srve.validatee();
    }
}
