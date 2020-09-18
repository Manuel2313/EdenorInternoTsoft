package TestsCases.ED_Registracion;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_Login;
import Paquete1.Fachadas.Fachada_LoginRedSocial;
import helper.CustomAssert;
import login.Steps_Login;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static helper.Utils_Excel.readCell;

public class cp644_645_646_647 extends BaseTest {

    private String rutaArchivo = "C:\\Users\\mauro.andres\\Katalon Studio\\edenor_automation-edenor-digital-47e8b878274e\\Data Sets\\USERS.xlsx";
    File file = new File(rutaArchivo);


    @Test
    public void cp644_645_646_647() throws IOException {
        Steps_Login sl = new Steps_Login(driver);
        sl.clickTengoUsuarioRegistrarme();
        Fachada_LoginRedSocial rs = new Fachada_LoginRedSocial();
        for (int i=1;i<5;i++) {
            String usuario = readCell(file, "Red Social Asociado", i, 0);
            String password = readCell(file, "Red Social Asociado", i, 1);
            String red = readCell(file, "Red Social Asociado", i, 3);
            System.out.println(red);
            switch (red) {
                case "Outlook":
                    sl.clickOutlook();
                    rs.loginOutlook(usuario, password);
                    break;
                case "Facebook":
                    sl.clickFacebook();
                    rs.loginFacebook(usuario, password);
                    break;
            }
        }
    }
}
