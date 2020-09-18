package Paquete1.Fachadas;

import Paquete1.BaseTest;
import home.Steps_Home;
import misCuentas_ConfiguracionDeLaCuenta.Steps_ConfiguracionDeLaCuenta;
import misCuentas_configuracionDeLaCuenta_administrarDelegaciones.Steps_Administrar_Delegaciones;
import misCuentas_configuracionDeLaCuenta_administrarDelegaciones.Steps_PopUpBorrarDelegacion;


public class Fachada_Administrar_Delegaciones extends BaseTest {

    private Steps_Home stepsHome;
    private Fachada_MisCuentas fachadaMisCuentas;
    private Steps_ConfiguracionDeLaCuenta stepsCfgCuenta;
    private Steps_Administrar_Delegaciones stepsAdministrar;
    private Steps_PopUpBorrarDelegacion stepsPopUpBorrar;

    public void borrarDelegacion(String nombreDelegado, String cuenta){
        fachadaMisCuentas = new Fachada_MisCuentas();
        fachadaMisCuentas.seleccionarCuenta(cuenta);
        //fachadaMisCuentas.clickConfiguracionDeCuenta()
        stepsCfgCuenta = new Steps_ConfiguracionDeLaCuenta(driver);
        stepsCfgCuenta.clickAdminDelegaciones();
        stepsAdministrar = new Steps_Administrar_Delegaciones(driver);
        stepsAdministrar.clickBorrarDelegacion(nombreDelegado);
        stepsPopUpBorrar = new Steps_PopUpBorrarDelegacion(driver);
        stepsPopUpBorrar.clickAceptar();
        //stepsPopUpBorrar.waitForAlertDialog();
    }
}
