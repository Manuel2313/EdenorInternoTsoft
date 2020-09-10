import misCuentas_AsociaTuCuenta.Steps_AsociaTuCuenta;
import org.testng.annotations.Test;

public class cp658 extends BaseTest {


    private String usuario = "pruebadeqa03+0263@gmail.com";
    private String password = "Edenor2018";
    private String ncuenta = "0003585860";
    @Test
    public void cp658(){
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado(usuario,password);
        Fachada_Home fh = new Fachada_Home();
        fh.cerrarBienvenida();
        Fachada_MisCuentas fmc = new Fachada_MisCuentas();
        fmc.asociarCuenta(Steps_AsociaTuCuenta.OpcionesAsociaTuCuenta.N_CUENTA, "Administrador",ncuenta );
        fmc.seleccionarCuenta(ncuenta);
        Fachada_Verificar_Funcionalidades_Segun_Perfil fsp = new Fachada_Verificar_Funcionalidades_Segun_Perfil();
        fsp.verificarFuncionalidadNotificaciones();
        fsp.verificarFuncionalidadTramitesPerfil1();
        fsp.verificarFuncionalidadMisCuentasPerfil1();
        fmc.desasociarCuenta(ncuenta);
    }
}
