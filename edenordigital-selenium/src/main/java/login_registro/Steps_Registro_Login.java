package login_registro;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_Registro_Login extends Steps_Base {


    private By botonRegistrarme = By.xpath("//button/span[contains(text(),'REGISTRARME')]");
    private By inputMail = By.xpath("//input[@type = 'text']");
    private By inputPassword = By.xpath("//input[@type='password']");

    public Steps_Registro_Login(WebDriver driver) {
        super(driver);
        checkVisibility(botonRegistrarme);
        checkVisibility(inputMail);
        checkVisibility(inputPassword);
    }

    public void clickBotonRegistrarme(){
        click(botonRegistrarme);
    }
    public void ingrearEmail(String mail){
        ingresarCampo(inputMail,mail);
    }
    public void ingresarPassword(String pass){
        ingresarCampo(inputPassword,pass);
    }
}
