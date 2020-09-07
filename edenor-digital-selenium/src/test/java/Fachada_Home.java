import home.Steps_Home;
import modalBienvenida.Steps_ModalBienvenida;

public class Fachada_Home extends BaseTest {

    public void abrirMiUsuario(){
        Steps_Home hm = new Steps_Home(driver);
        hm.clickMiUsuario();
    }
    public void cerrarBienvenida() throws InterruptedException {
        Steps_ModalBienvenida sm =  new Steps_ModalBienvenida(driver);
        Thread.sleep(6000);
        sm.cerrarBienvenida();
    }

}
