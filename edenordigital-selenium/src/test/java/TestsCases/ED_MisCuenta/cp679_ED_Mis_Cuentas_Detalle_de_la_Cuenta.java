package TestsCases.ED_MisCuenta;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_ConfiguracionDeLaCuenta;
import Paquete1.Fachadas.Fachada_Home;
import Paquete1.Fachadas.Fachada_Login;
import Paquete1.Fachadas.Fachada_MisCuentas;
import org.testng.annotations.Test;

public class cp679_ED_Mis_Cuentas_Detalle_de_la_Cuenta extends BaseTest {
    //679 ED. Mis cuentas. Detalle de la cuenta

    private String usuario="pruebadeqa03+0270@gmail.com";
    private String password="Edenor2018";
    private String nroCuenta = "4923000000";
    private String direccion = "LA INDUSTRIAL 2";
    private String titular = "DUIFREI SA";
    private String tarifa = "T3";
    private String estado = "Servicio Activo";
    private String debito = "No adherido";


    @Test
    public void cp679() throws InterruptedException {
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado(usuario,password);
        Fachada_Home fh = new Fachada_Home();
        fh.cerrarBienvenida();
        Fachada_MisCuentas fmc = new Fachada_MisCuentas();
        fmc.clickDetalleMisCuentas();
        Fachada_ConfiguracionDeLaCuenta fdlc = new Fachada_ConfiguracionDeLaCuenta();
        fdlc.validarDatosDeLaCuenta(debito,direccion,estado,titular,nroCuenta,tarifa);
    }
}
