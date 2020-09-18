package Paquete1.Fachadas;

import Paquete1.BaseTest;
import miUsuario.Steps_MiUsuario;

public class Fachada_MiUsuario extends BaseTest {

    Steps_MiUsuario stepsMiUsuario;

    public void cerrarSesion(){
        stepsMiUsuario = new Steps_MiUsuario(driver);
        stepsMiUsuario.clickOpcionCerrarSesion();
        stepsMiUsuario.clickBotonCerrarSesion();
    }
}
