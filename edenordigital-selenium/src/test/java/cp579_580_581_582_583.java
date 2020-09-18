import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_noTengoUsuarioMultiTest;
import org.testng.annotations.Test;

public class cp579_580_581_582_583 extends BaseTest {

    //579 -580-581-582-583-ED. Pantalla de ingreso. Boton - No tengo usuario, registrarme
    @Test
    public void cp579_580_581_582_583() throws InterruptedException {
        Fachada_noTengoUsuarioMultiTest umt = new Fachada_noTengoUsuarioMultiTest();
        umt.noTengoUsuarioRegistrarmeGmail();
        umt.noTengoUsuarioRegistrarmeFacebook();
        umt.noTengoUsuarioRegistrarmeTwitter();
    }
}
