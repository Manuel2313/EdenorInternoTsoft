package TestsCases.ED_Ventana_principal.ED_Ventana_principal_Usuario;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_Home;
import Paquete1.Fachadas.Fachada_Login;
import miUsuario.SeleccionarOpcionUsuario;
import miUsuario_DatosPersonales.Steps_DatosPersonales;
import miUsuario_datosPersonales_editarTelefoto.Steps_EditarTelefono;
import org.testng.annotations.Test;

public class cp596 extends BaseTest {

    @Test
    public void cp596(){
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado("pruebadeqa03+0263@gmail.com", "Edenor2018");
        Fachada_Home fh = new Fachada_Home();
        fh.cerrarBienvenida();
        fh.abrirMiUsuario();
        SeleccionarOpcionUsuario op = new SeleccionarOpcionUsuario(driver);
        op.seleccionarOpcion("Datos personales");
        Steps_DatosPersonales sdp = new Steps_DatosPersonales(driver);
        sdp.clickButtonEditarTelefono();
        Steps_EditarTelefono set= new Steps_EditarTelefono(driver);
        set.validate();
    }

}
