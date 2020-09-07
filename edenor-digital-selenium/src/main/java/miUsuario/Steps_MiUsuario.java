package miUsuario;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_MiUsuario extends Steps_Base {

    private By OPCION_DELEGAR_CUENTAS = By.xpath("//span[text()='Delegar cuentas']");
    private By OPCION_ADMINISTRAR_NOTIFICACIONES = By.xpath("//span[text()='Administrar notificaciones']");
    private By OPCION_DATOS_DE_CONTACTO = By.xpath("//span[text()='Datos personales']");
    private By HEADER_MI_USUARIO = By.xpath("//span[text()='Mi usuario']");
    private By OPCION_CERRAR_SESION = By.xpath("//span[text()='Cerrar sesión']");
    private By OPCION_GENERICO = By.xpath("//span[text()='${opcion}']");

    public enum OpcionesMiUsuario {
        DELEGAR_CUENTAS,
        ADMINISTRAR_NOTIFICACIONES,
        DATOS_DE_CONTACTO,
        OTRA_OPCION;
    }

    public Steps_MiUsuario(WebDriver driver) {
        super(driver);
        //waitForObject(HEADER_MI_USUARIO)
        //waitForObject(OPCION_CERRAR_SESION)
    }
    public void seleccionarOpcion(OpcionesMiUsuario opcion) {
        switch (opcion) {
            case DELEGAR_CUENTAS:
                click(OPCION_DELEGAR_CUENTAS);
                break;
            case DATOS_DE_CONTACTO:
                click(OPCION_DATOS_DE_CONTACTO);
                break;

            case ADMINISTRAR_NOTIFICACIONES:
                click(OPCION_ADMINISTRAR_NOTIFICACIONES);
                break;
            default:
                break;
        }
    }

    public void  seleccionarOpcion(String opcion){
        click(OPCION_GENERICO);
    }

    public void clickOpcionCerrarSesion(){
        click(OPCION_CERRAR_SESION);
    }

    public void clickBotonCerrarSesion(){
        click(OPCION_CERRAR_SESION);
    }


}
