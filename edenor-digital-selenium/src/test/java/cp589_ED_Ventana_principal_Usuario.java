import miUsuario.Steps_MiUsuario;
import misCuentas_AsociaTuCuenta.Steps_AsociaTuCuenta;
import org.testng.annotations.Test;

public class cp589_ED_Ventana_principal_Usuario extends BaseTest {

    private String usuario="pruebadeqa01@gmail.com";
    private String password="Edenor2018";

    @Test
    public void cp589() throws InterruptedException {
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado(usuario,password);
        Steps_AsociaTuCuenta atc = new Steps_AsociaTuCuenta(driver);
        atc.cerrarVentana();
        Fachada_Home fh = new Fachada_Home();
        fh.cerrarBienvenida();
        fh.abrirMiUsuario();
        //Thread.sleep(6000);
        Steps_MiUsuario sm = new Steps_MiUsuario(driver);

    }
}
