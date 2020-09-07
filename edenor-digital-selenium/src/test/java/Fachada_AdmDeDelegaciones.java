import home.Steps_Home;
import miUsuario.Steps_MiUsuario;
import miUsuario_delegarCuentas.Steps_Administracion_Delegaciones;
import misCuentas.Steps_MisCuentas;
import misCuentas_ConfiguracionDeLaCuenta.Steps_ConfiguracionDeLaCuenta;
import misCuentas_configuracionDeLaCuenta_administrarDelegaciones.Steps_Administrar_Delegaciones;

public class Fachada_AdmDeDelegaciones extends BaseTest {

    Steps_Administracion_Delegaciones stepsAdmDelegaciones; //mi usuario->delegar cuentas
    Steps_MiUsuario stepsMiUsuario;
    Steps_Home stepsHome;
    Steps_ConfiguracionDeLaCuenta stepsCfgCuenta;
    Steps_MisCuentas stepsMisCuentas;
    Steps_Administrar_Delegaciones stepsAdministrar; //Mis cuentas->config de la cuenta->administrar delegaciones

    public void llenarFormularioDeDelegacion ( String nombre , String apellido , String email ,
                                               String dni , String codArea, String telefono , String opcionGenero, String perfilUsuario ,String  relacionConCuentas) {
        stepsAdmDelegaciones = new Steps_Administracion_Delegaciones(driver);
        stepsAdmDelegaciones.ingresarNombre(nombre);
        //stepsAdmDelegaciones.ingresarApellido(apellido)
        stepsAdmDelegaciones.ingresarEmail(email);
        stepsAdmDelegaciones.ingresarDNI(dni);
        stepsAdmDelegaciones.ingresarCodArea(codArea);
        stepsAdmDelegaciones.ingresarTelefono(telefono);
        stepsAdmDelegaciones.seleccionarGenero(opcionGenero);
        //stepsAdmDelegaciones.seleccionarRelacionConCuentas(relacionConCuentas);
        //stepsAdmDelegaciones.seleccionarPerfilDeUsuario(perfilUsuario);
    }

    public void irAdelegarCuentas(){
        stepsHome = new Steps_Home(driver);
        stepsHome.clickMiUsuario();
        stepsMiUsuario = new Steps_MiUsuario(driver);
        stepsMiUsuario.seleccionarOpcion(Steps_MiUsuario.OpcionesMiUsuario.DELEGAR_CUENTAS);
    }

    public void seleccionarCuentaYGuardar(String direccionDeLaCuenta){
        stepsAdmDelegaciones = new Steps_Administracion_Delegaciones(driver);
        //stepsAdmDelegaciones.seleccionarCuenta(direccionDeLaCuenta);
        stepsAdmDelegaciones.guardar();
        stepsAdmDelegaciones.validarDelegacionGuardadaCorrectamente();
    }






}
