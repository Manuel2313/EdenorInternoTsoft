package Paquete1.Fachadas;

import Paquete1.BaseTest;
import miUsuario.Steps_MiUsuario;
import miUsuario_DatosPersonales.Steps_DatosPersonales;
import miUsuario_administracionDeNotificaciones.Steps_AdministracionDeNotificaciones;
import miUsuario_delegarCuentas.Steps_Administracion_Delegaciones;
import org.openqa.selenium.ElementNotVisibleException;

public class Fachada_Mi_Usuario_Multitest extends BaseTest {
    private Steps_MiUsuario stepsMiUsuario;
    private Steps_Administracion_Delegaciones stepsAdmDelegaciones;
    private Steps_AdministracionDeNotificaciones stepsAdmNotificaciones;
    private Steps_DatosPersonales stepsDatosPersonales;

    public void TC_593_SeleccionarYValidarOpcionDelegarCuentas(){
        try {
            stepsMiUsuario = new Steps_MiUsuario(driver);
            stepsMiUsuario.seleccionarOpcion(Steps_MiUsuario.OpcionesMiUsuario.DELEGAR_CUENTAS);
            stepsAdmDelegaciones = new Steps_Administracion_Delegaciones(driver);//validate en constructor
            System.out.println("593. Mi usuario. Administracion de delegaciones PASSED");
        } catch (ElementNotVisibleException e) {
            System.out.println(e.getLocalizedMessage());
        }
        //si fallan 2 metodos/test
    }

    public void TC_591_SeleccionarYValidarOpcionDatosDeContacto(){
        try {
            stepsMiUsuario = new Steps_MiUsuario(driver);
            stepsMiUsuario.seleccionarOpcion(Steps_MiUsuario.OpcionesMiUsuario.DATOS_DE_CONTACTO);
            stepsDatosPersonales = new Steps_DatosPersonales(driver);//validate en constructor
            System.out.println("591. Mi usuario. Datos de contacto PASSED");
        } catch (ElementNotVisibleException e) {
            System.out.println(e.getLocalizedMessage());
        }
        //si fallan 2 metodos/test
    }

    public void TC_592_SeleccionarYValidarOpcionAdministrarNotificaciones(){
        try {
            stepsMiUsuario = new Steps_MiUsuario(driver);
            stepsMiUsuario.seleccionarOpcion(Steps_MiUsuario.OpcionesMiUsuario.ADMINISTRAR_NOTIFICACIONES);
            stepsAdmNotificaciones = new Steps_AdministracionDeNotificaciones(driver);//validate en constructor
            System.out.println("592. Mi usuario. Administracion Notificaciones PASSED ");
        }  catch (ElementNotVisibleException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }



}
