package Paquete1.Fachadas;

import Paquete1.BaseTest;
import misCuentas_ConfiguracionDeLaCuenta.Steps_ConfiguracionDeLaCuenta;

public class Fachada_ConfiguracionDeLaCuenta extends BaseTest {
    Steps_ConfiguracionDeLaCuenta detalleDeLaCuenta;

    public void validarDatosDeLaCuenta(String debitoAutomatico, String direccion, String estado, String nombreTitular, String nroDeCuenta, String tarifa){
        detalleDeLaCuenta = new Steps_ConfiguracionDeLaCuenta(driver);

        detalleDeLaCuenta.verificarDebitoAutimatico(debitoAutomatico);
        detalleDeLaCuenta.verificarDireccion(direccion);
        detalleDeLaCuenta.verificarEstado(estado);
        detalleDeLaCuenta.verificarNombreTitular(nombreTitular);
        detalleDeLaCuenta.verificarNumeroCuenta(nroDeCuenta);
        detalleDeLaCuenta.verificarTarifa(tarifa);
    }
}
