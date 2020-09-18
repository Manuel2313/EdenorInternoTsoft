package TestsCases.ED_Ventana_principal.ED_Ventana_principal_Usuario;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_Home;
import Paquete1.Fachadas.Fachada_Login;
import Paquete1.Fachadas.Fachada_MiUsuario;
import login.Steps_Login;
import miUsuario.Steps_MiUsuario;
import misCuentas_AsociaTuCuenta.Steps_AsociaTuCuenta;
import org.testng.annotations.Test;

public class cp590_ED_Ventana_principal_Usuario_Cerrar_sesion extends BaseTest {
    private String usuario="pruebadeqa01@gmail.com";
    private String password="Edenor2018";

    @Test
    public void cp590(){
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado(usuario,password);
        Steps_AsociaTuCuenta atc = new Steps_AsociaTuCuenta(driver);
        atc.cerrarVentana();
        Fachada_Home fh = new Fachada_Home();
        fh.cerrarBienvenida();
        fh.abrirMiUsuario();
        Steps_MiUsuario sm = new Steps_MiUsuario(driver);
        Fachada_MiUsuario fmu = new Fachada_MiUsuario();
        fmu.cerrarSesion();
        Steps_Login sl = new Steps_Login(driver);
        sl.validate();

    }
}
