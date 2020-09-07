import misCuentas_AsociaTuCuenta.Steps_AsociaTuCuenta;
import org.testng.annotations.Test;

public class cp1285_1286 extends BaseTest{

    private String usuario = "pruebedenor01@yahoo.com";
    private String contrasenia = "Edenor2018";
    private String relacion = "Apoderado";
    private String cuenta = "7345379572";

    @Test
    public void cp1285_1286() throws InterruptedException {
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado(usuario,contrasenia);
        Fachada_Home fh = new Fachada_Home();
        fh.cerrarBienvenida();
        Fachada_MisCuentas fmc = new Fachada_MisCuentas();
        fmc.asociarCuenta(Steps_AsociaTuCuenta.OpcionesAsociaTuCuenta.N_CUENTA,relacion,cuenta);
        fmc.desasociarCuenta(cuenta);
    }


}
