import home.Steps_Home;
import misCuentas_AsociaTuCuenta.Steps_AsociaTuCuenta;
import modalBienvenida.Steps_ModalBienvenida;
import org.testng.annotations.Test;

public class cp588_ED_Ventana_principial_Completitud extends BaseTest {

    //588 ED. Ventana principal. Completitud

    private String usuario = "pruebadeqa01@gmail.com";
    private String password = "Edenor2018";

    @Test
    public void cp588() throws InterruptedException {
        Fachada_Login fl =  new Fachada_Login();
        fl.loginConEmailNoFederado(usuario,password);
        Steps_ModalBienvenida smb = new Steps_ModalBienvenida(driver);
        smb.cerrarBienvenida();
        Steps_AsociaTuCuenta atc = new Steps_AsociaTuCuenta(driver);
        atc.cerrarVentana();
        Steps_Home sh = new Steps_Home(driver);
        sh.validate();
    }
}
