package Paquete1.Fachadas;

import Paquete1.BaseTest;
import home.Steps_Home;
import misCuentas.Steps_MisCuentas;
import misCuentas.Steps_ModalInformacion;
import misCuentas_estadoDeCuenta.Steps_EstadoDeCuenta;
import misCuentas_historialDePagosYFacturas.Steps_HistorialDePagosYFacturas;
import notificaciones.Steps_Notificaciones;
import tramites.Steps_Tramites;
import tramites_IniciarNuevo.Steps_IniciarNuevo;

public class Fachada_Verificar_Funcionalidades_Segun_Perfil extends BaseTest {

    private Steps_Tramites stepsTramites;
    private Steps_IniciarNuevo stepsIniciarNuevoTramite;
    private Steps_MisCuentas misCuentas;
    private Steps_Home home;
    private Steps_ModalInformacion modalInformacionNoTenesPermisos;
    private Steps_EstadoDeCuenta estadoDeCuenta;
    private Steps_HistorialDePagosYFacturas historialPagosYFacturas;
    private Steps_Notificaciones notificaciones;

    public void verificarFuncionalidadTramitesPerfil1(){
        verificarFuncionalidadTramitesPerfil0();

        stepsIniciarNuevoTramite = new Steps_IniciarNuevo(driver);
        stepsIniciarNuevoTramite.seleccionarFormulario(Steps_IniciarNuevo.Formulario.ALTA_DEBITO_AUTOMATICO);
    }
    public void verificarFuncionalidadTramitesPerfil0(){
        home = new Steps_Home(driver);
        home.clickTramites();
        stepsTramites = new Steps_Tramites(driver);
        stepsTramites.clickIniciarNuevo();
        stepsIniciarNuevoTramite = new Steps_IniciarNuevo(driver);
        stepsIniciarNuevoTramite.seleccionarCategoria(Steps_IniciarNuevo.Categoria.DATOS_DE_CLIENTE);
        stepsIniciarNuevoTramite.seleccionarFormulario(Steps_IniciarNuevo.Formulario.AMPLIAR_HABILITACION_DE_ACCESOS);
        stepsIniciarNuevoTramite.seleccionarFormulario(Steps_IniciarNuevo.Formulario.CAMBIO_TITULARIDAD);
    }

    public void verificarFuncionalidadMisCuentasPerfil1(){
        home = new Steps_Home(driver);
        home.clickMisCuentas();
        misCuentas = new Steps_MisCuentas(driver);
        misCuentas.clickVerFactura();
        modalInformacionNoTenesPermisos = new Steps_ModalInformacion(driver);//validate en constructor
        modalInformacionNoTenesPermisos.clickEntendido();
        misCuentas.validate();
        misCuentas.clickEvolucionDeConsumos();
        modalInformacionNoTenesPermisos.validate();
        modalInformacionNoTenesPermisos.clickEntendido();
        misCuentas.validate();
        misCuentas.clickOpcionesDePago();
        estadoDeCuenta = new Steps_EstadoDeCuenta(driver);
        home.clickMisCuentas();
        misCuentas.validate();
        misCuentas.clickHistorialDeFacturas();
        historialPagosYFacturas =new Steps_HistorialDePagosYFacturas(driver);//validate en constructor
    }

    public void verificarFuncionalidadMisCuentasPerfil0(){
        home = new Steps_Home(driver);
        home.clickMisCuentas();
        misCuentas = new Steps_MisCuentas(driver);
        misCuentas.clickVerFactura();
        modalInformacionNoTenesPermisos = new Steps_ModalInformacion(driver);//validate en constructor
        modalInformacionNoTenesPermisos.clickEntendido();
        misCuentas.validate();
        misCuentas.clickEvolucionDeConsumos();
        modalInformacionNoTenesPermisos.validate();
        modalInformacionNoTenesPermisos.clickEntendido();
        misCuentas.validate();
        misCuentas.clickOpcionesDePago();
        modalInformacionNoTenesPermisos.validate();
        modalInformacionNoTenesPermisos.clickEntendido();
        misCuentas.validate();
        misCuentas.clickHistorialDeFacturas();
        modalInformacionNoTenesPermisos.validate();
        modalInformacionNoTenesPermisos.clickEntendido();
        misCuentas.validate();
    }

    public void verificarFuncionalidadNotificaciones(){
        home = new Steps_Home(driver);
        home.clickNotificaciones();
        notificaciones = new Steps_Notificaciones(driver);

    }
}
