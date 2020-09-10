import helper.Email;
import login.Steps_Login;
import org.testng.annotations.Test;
import registro.Steps_Registro;
import registro.Steps_Registro_InicioDelRegistro;

public class cp614_ED_Registracion_Mail_no_federado_Documento_con_formato_incorrecto extends BaseTest {

    //614 ED. Registracion. Mail no federado. Documento con formato incorrecto

    private String dni ="XX23114";
    private String genero="Male";
    private String area ="11";
    private String telefono ="22334455";

    private String email = Email.getNewEmail();
    private String pass = "Edenor2018";

    @Test
    public void cp614() throws InterruptedException {
        Steps_Login sl = new Steps_Login(driver);
        //Thread.sleep(6000);
        sl.clickTengoUsuarioRegistrarme();
        Fachada_Registro_Login frl = new Fachada_Registro_Login();
        frl.registrar(email,pass);
        //Thread.sleep(6000);
        Fachada_Registro fr = new Fachada_Registro();
        fr.completarInicioDelRegistro(dni,genero,area,telefono);
        Steps_Registro_InicioDelRegistro sri =  new Steps_Registro_InicioDelRegistro(driver);
        sri.verificarErrorDNIFormatoInvalido();
    }
}
