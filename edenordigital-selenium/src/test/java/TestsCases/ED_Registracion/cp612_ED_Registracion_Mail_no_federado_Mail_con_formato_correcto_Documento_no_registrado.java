package TestsCases.ED_Registracion;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_Registro;
import Paquete1.Fachadas.Fachada_Registro_Login;
import login.Steps_Login;
import org.testng.annotations.Test;
import registro.Steps_Registro_Validacion_De_Datos;

public class cp612_ED_Registracion_Mail_no_federado_Mail_con_formato_correcto_Documento_no_registrado extends BaseTest {
    //612 ED. Registracion. Mail no federado. Mail con formato correcto. Documento no registrado
    private String email = "pruebanuevaedenor6@yahoo.com"; //helper.Email.getNewEmail();
    private String password = "Edenor2018";
    private String dni = "10123321";
    private String genero = "Male";
    private String numArea = "11";
    private String numTelefono = "22334455";

    //612 ED. Registracion. Mail no federado. Mail con formato correcto. Documento no registrado
    @Test
    public void cp612(){
        Steps_Login sl = new Steps_Login(driver);
        sl.clickTengoUsuarioRegistrarme();
        Fachada_Registro_Login frl = new Fachada_Registro_Login();
        frl.registrar(email,password);
        Fachada_Registro fr = new Fachada_Registro();
        fr.completarInicioDelRegistro(dni,genero,numArea,numTelefono);
        Steps_Registro_Validacion_De_Datos rvd = new Steps_Registro_Validacion_De_Datos(driver);
        rvd.validate();
    }
}
