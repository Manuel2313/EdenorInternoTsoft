import login.Steps_Login;
import org.testng.annotations.Test;

public class cp617_18_19_20_Recuperar_Contrasenia_Mail_Formato_Invalido_Valido_con_Usuario_no_Registrado_Registado extends BaseTest {

    //617-618-619-620 Recuperar Contrasena. Mail  formato invalido. valido con Usuario no registrado - registrado
    //me falta este dato, lo saque de la planilla pero al parecer no es

    private String usuario="pruebanuevaedenor3@gmail.com";

    @Test
    public void cp617_18_19_20() throws InterruptedException {
        Thread.sleep(4000);
        Fachada_RecuperarContraseña frc = new Fachada_RecuperarContraseña();
        frc.TC_618_RecuperarContrasenaMailFormatoInvalido();
        frc.TC_619_RecuperarContrasenaMailFormatoValidoUsuarioNoRegistrado();
        frc.TC_620_RecuperarContrasenaMailValidoUsuarioRegistrado(usuario);
    }
}
