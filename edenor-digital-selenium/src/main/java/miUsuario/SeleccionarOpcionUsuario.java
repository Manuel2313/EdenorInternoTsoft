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

    public SeleccionarOpcionUsuario(WebDriver driver) {
        super(driver);
    }

    private Steps_MiUsuario miUsuario;
    private static Steps_Base opcionElegida;



    public void seleccionarOpcion(String opcion){
        miUsuario = new Steps_MiUsuario(driver);
        //miUsuario.seleccionarOpcion(opcion);
        setearPagina(opcion);
    }


    public void setearPagina(String opcion){
        switch (opcion){
            case "Datos personales":
                click(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div"));
            case "Administrar notificaciones":
                click(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div"));
            case "Delegar cuentas":
                click(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[4]/div"));
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
