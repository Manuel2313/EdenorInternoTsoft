package TestsCases.ED_Ventana_principal.ED_Ventana_principal_Usuario;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_Home;
import Paquete1.Fachadas.Fachada_Login;
import Paquete1.Fachadas.Fachada_Mi_Usuario_Multitest;
import org.testng.annotations.Test;

public class cp591_592_593 extends BaseTest {

    @Test
    public void cp591(){
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado("pruebadeqa03+0263@gmail.com","Edenor2018");
        Fachada_Home fh = new Fachada_Home();
        fh.cerrarBienvenida();
        fh.abrirMiUsuario();
        Fachada_Mi_Usuario_Multitest mumt = new Fachada_Mi_Usuario_Multitest();
        mumt.TC_591_SeleccionarYValidarOpcionDatosDeContacto();
        fh.abrirMiUsuario();
        mumt.TC_592_SeleccionarYValidarOpcionAdministrarNotificaciones();
        fh.abrirMiUsuario();
        mumt.TC_593_SeleccionarYValidarOpcionDelegarCuentas();
    }
}
