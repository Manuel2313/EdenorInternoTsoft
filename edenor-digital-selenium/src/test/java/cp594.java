import miUsuario.SeleccionarOpcionUsuario;
import miUsuario_DatosPersonales.Steps_DatosPersonales;
import miUsuario_datosPersonales_cambiarContrasna.Steps_CambiarContraseña;
import org.testng.annotations.Test;

public class cp594 extends BaseTest {
    private String usuario = "pruebadeqa03+0263@gmail.com";
    private String password = "Edenor2018";
    private String opcion = "Datos personales";

    @Test
    public void cp594() throws InterruptedException {
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado(usuario, password);
        //Thread.sleep(8000);
        Fachada_Home fh = new Fachada_Home();
        fh.cerrarBienvenida();
        fh.abrirMiUsuario();
        //Thread.sleep(3000);
        SeleccionarOpcionUsuario opcionUsuario = new SeleccionarOpcionUsuario(driver);
        opcionUsuario.seleccionarOpcion(opcion);
        Steps_DatosPersonales dp = new Steps_DatosPersonales(driver);
        dp.clickCambiarContraseña();
        Steps_CambiarContraseña cc = new Steps_CambiarContraseña(driver);
        cc.validate();
    }
}
