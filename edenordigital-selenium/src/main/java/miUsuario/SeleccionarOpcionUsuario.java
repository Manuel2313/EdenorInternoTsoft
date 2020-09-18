package miUsuario;

import miUsuario_DatosPersonales.Steps_DatosPersonales;
import miUsuario_administracionDeNotificaciones.Steps_AdministracionDeNotificaciones;
import miUsuario_delegarCuentas.Steps_Administracion_Delegaciones;
import modelBase.Steps_Base;
import miUsuario.Steps_MiUsuario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import miUsuario.administracionDeNotificaciones.Steps_AdministracionDeNotificaciones
//import miUsuario.datosPersonales.Steps_DatosPersonales;
//import miUsuario.delegarCuentas.Steps_Administracion_Delegaciones;


public class SeleccionarOpcionUsuario extends Steps_MiUsuario {

    private Steps_MiUsuario miUsuario;
    private static Steps_Base opcionElegida;

    public SeleccionarOpcionUsuario(WebDriver driver) {
        super(driver);
    }





    public void seleccionarOpcion(String opcion){
        miUsuario = new Steps_MiUsuario(driver);
        //miUsuario.seleccionarOpcion(opcion);
        setearPagina(opcion);
    }

    public void setearPagina(String opcion){
        switch (opcion){
            case "Delegar cuentas":
                verifyAndClick(OPCION_DELEGAR_CUENTAS);
                Steps_Administracion_Delegaciones admd= new Steps_Administracion_Delegaciones(driver);
                break;
            case "Datos personales":
                verifyAndClick(OPCION_DATOS_DE_CONTACTO);
                Steps_DatosPersonales sdp = new Steps_DatosPersonales(driver);
                break;
            case "Administrar notificaciones":
                verifyAndClick(OPCION_ADMINISTRAR_NOTIFICACIONES);
                Steps_AdministracionDeNotificaciones admn = new Steps_AdministracionDeNotificaciones(driver);
                break;
            default:
                break;
            /*
            case "Datos personales":
                verifyAndClick(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div"));

                break;
            case "Administrar notificaciones":
                verifyAndClick(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div"));

                break;
            case "Delegar cuentas":
                verifyAndClick(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[4]/div"));

                break;
            default:
                break;
             */
        }
    }
    /*
    public void setearPagina(String opcion){
        opcionElegida = new Steps_Base(driver);
        public void Steps_Opcion() {
            switch (opcion) {
                case "Datos personales":
                    Steps_Opcion = new Steps_DatosPersonales(driver);
                    break;
                case "Administrar notificaciones":
                    Steps_Opcion = new Steps_AdministracionDeNotificaciones(driver);
                    break;
                case "Delegar cuentas":
                    Steps_Opcion = new Steps_Administracion_Delegaciones(driver);
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
