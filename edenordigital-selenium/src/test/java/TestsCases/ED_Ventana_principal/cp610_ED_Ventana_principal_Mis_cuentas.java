package TestsCases.ED_Ventana_principal;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_Home;
import Paquete1.Fachadas.Fachada_Login;
import org.testng.annotations.Test;

public class cp610_ED_Ventana_principal_Mis_cuentas extends BaseTest {

    private String usuario = "pruebadeqa03+0263@gmail.com";
    private String password = "Edenor2018";

    //610 -ED. Ventana principal. Mis cuentas
    //Ver que datos usar, esos son incorrectos
    @Test
    public void cp610() throws InterruptedException {
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado(usuario,password);
        Fachada_Home fh =  new Fachada_Home();
        fh.cerrarBienvenida();
        fh.verificarElementosMisCuentas();
    }
}
