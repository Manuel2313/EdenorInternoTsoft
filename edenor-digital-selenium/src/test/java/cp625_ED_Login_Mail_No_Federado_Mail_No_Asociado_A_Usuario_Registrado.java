import org.testng.annotations.Test;

public class cp625_ED_Login_Mail_No_Federado_Mail_No_Asociado_A_Usuario_Registrado extends BaseTest {

    //625 ED. Login. Mail no federado. Mail no asociado a usuario registrado

    private String usuario="unusuariofake@mailnoexistente.cc";
    private String password="Unacontrasena1";

    @Test
    public void cp625() throws InterruptedException {
        Fachada_Login fl = new Fachada_Login();
        fl.loginUsuarioY_OContrasenaInvalidos(usuario,password);
    }
}
