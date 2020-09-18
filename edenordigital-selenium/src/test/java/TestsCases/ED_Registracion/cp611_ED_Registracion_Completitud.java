package TestsCases.ED_Registracion;

import Paquete1.BaseTest;
import login.Steps_Login;
import login.Steps_Starting;
import login_registro.Steps_Registro_Login;
import org.testng.annotations.Test;

public class cp611_ED_Registracion_Completitud extends BaseTest {

    //Ver este TestCase, parece que no hace lo que pide
    @Test
    public void cp611(){
        Steps_Login sl = new Steps_Login(driver);
        sl.clickTengoUsuarioRegistrarme();
        Steps_Starting ss = new Steps_Starting(driver);
    }

}
