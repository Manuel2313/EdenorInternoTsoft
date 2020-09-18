package Paquete1.Fachadas;

import Paquete1.BaseTest;
import home.Steps_Home;
import misCuentas.Steps_MisCuentas;
import misCuentas_AsociaTuCuenta.Steps_AsociaTuCuenta;
import misCuentas_ConfiguracionDeLaCuenta.Steps_ConfiguracionDeLaCuenta;
import misCuentas_configuracionDeLaCuenta_desasociarCuenta.Steps_DesasociarCuenta;

public class Fachada_MisCuentas extends BaseTest {

    Steps_MisCuentas misCuentas;
    Steps_AsociaTuCuenta asociaTuCuenta;
    home.Steps_Home home;
    Steps_ConfiguracionDeLaCuenta detallesDeCuenta;
    Steps_DesasociarCuenta desasociarCuenta;

    public void clickDetalleMisCuentas(){
        misCuentas = new Steps_MisCuentas(driver);
        misCuentas.clickConfiguracionDeCuenta();
    }
    public Steps_MisCuentas seleccionarCuenta(String numeroCuenta){
        misCuentas = new Steps_MisCuentas(driver);
        misCuentas.clickSelectorDeCuentas();
        misCuentas.seleccionarCuenta(numeroCuenta);
        //misCuentas.esperarVentanaDisponible();
        return misCuentas;
    }
    public void asociarCuenta(Steps_AsociaTuCuenta.OpcionesAsociaTuCuenta opcion, String relacionConlasCuentas, String numero){
        misCuentas = new Steps_MisCuentas(driver);
        misCuentas.clickAsociarCuenta();
        asociaTuCuenta = new Steps_AsociaTuCuenta(driver);
        asociaTuCuenta.clickOpcion(opcion);
        asociaTuCuenta.ingresarNumero(numero);
        asociaTuCuenta.clickAceptar();
        //asociaTuCuenta.seleccionarRelacionConLasCuentas(relacionConlasCuentas);
        asociaTuCuenta.clickAceptar();
        //home = new Steps_Home(driver);
    }
    public void desasociarCuenta(String numero){
        home = new Steps_Home(driver);

        home.clickMisCuentas();

        misCuentas = seleccionarCuenta(numero);

        misCuentas.clickConfiguracionDeCuenta();

        detallesDeCuenta = new Steps_ConfiguracionDeLaCuenta(driver);

        detallesDeCuenta.clickDesasociar();

        desasociarCuenta = new Steps_DesasociarCuenta(driver);

        desasociarCuenta.confirmar();

    }


}
