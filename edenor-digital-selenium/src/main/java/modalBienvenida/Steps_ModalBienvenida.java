package modalBienvenida;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_ModalBienvenida extends Steps_Base {
    public Steps_ModalBienvenida(WebDriver driver) {
        super(driver);
    }

    By buttonCerar= By.xpath("//*[@alt='stageimg']/preceding::button[1]");
    By modal_bienvenida = By.xpath("//*[@class='styles_layoutContainer__LawcI'] ");

    public void cerrarBienvenida(){
        isElementVisible(buttonCerar);
        click(buttonCerar);
    }
}
