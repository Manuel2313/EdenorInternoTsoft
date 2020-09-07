package miUsuario;

import modelBase.Steps_Base;
import miUsuario.Steps_MiUsuario;
import org.openqa.selenium.WebDriver;
//import miUsuario.administracionDeNotificaciones.Steps_AdministracionDeNotificaciones
//import miUsuario.datosPersonales.Steps_DatosPersonales;
//import miUsuario.delegarCuentas.Steps_Administracion_Delegaciones;


public class SeleccionarOpcionUsuario extends Steps_MiUsuario {

    public SeleccionarOpcionUsuario(WebDriver driver) {
        super(driver);
    }
        /*
    private Steps_MiUsuario miUsuario;
    private static Steps_Base opcionElegida;



    public void seleccionarOpcion(String opcion){
        miUsuario = new Steps_MiUsuario(driver);
        miUsuario = new Steps_MiUsuario(driver);
        miUsuario.seleccionarOpcion(opcion);
        setearPagina(opcion);
    }

    public void setearPagina(String opcion){
        opcionElegida = new Steps_Base(driver);
        public void Steps_Opcion() {
            switch (opcion) {
                case "Datos personales":
                    Steps_Opcion = new Steps_DatosPersonales();
                    break;
                case "Administrar notificaciones":
                    Steps_Opcion = new Steps_AdministracionDeNotificaciones();
                    break;
                case "Delegar cuentas":
                    Steps_Opcion = new Steps_Administracion_Delegaciones();
                    break;
                default:
                    break;
            }
            opcionElegida = Steps_Opcion;
        }
    }

    public void validarPaginaOpcionElegida(String opcion){
        opcionElegida.validate();
    }
    */



}
