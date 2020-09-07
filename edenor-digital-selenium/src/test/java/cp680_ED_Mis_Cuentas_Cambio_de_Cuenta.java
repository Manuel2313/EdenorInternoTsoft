import org.testng.annotations.Test;

public class cp680_ED_Mis_Cuentas_Cambio_de_Cuenta extends BaseTest {

    //680 ED. Mis cuentas. Cambio de cuenta

    private String usuario = "pruebadeqa03+0263@gmail.com";
    private String passsword = "Edenor2018";
    private String nroCuenta = "8123782758";
    private String direccion = "BRIO PRIV SAN SEBASTIAN 172 - ARE 2";
    private String titular = "BRITO GUSTAVO HECTOR LUIS";
    private String tarifa = "T1 - Residencial";
    private String estado = "Servicio Activo";
    private String debito = "No adherido";


    @Test
    public void cp680() throws InterruptedException {
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado(usuario,passsword);
        Fachada_Home fh = new Fachada_Home();
        fh.cerrarBienvenida();
        Fachada_MisCuentas fmc = new Fachada_MisCuentas();
        fmc.seleccionarCuenta(nroCuenta);
        fmc.clickDetalleMisCuentas();
        Fachada_ConfiguracionDeLaCuenta fcdl = new Fachada_ConfiguracionDeLaCuenta();
        fcdl.validarDatosDeLaCuenta(debito,direccion,estado,titular,nroCuenta,tarifa);
    }
}
