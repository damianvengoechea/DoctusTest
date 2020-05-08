package co.com.pruebadoctus.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://euno.lms.doctustest.com/")
public class EunoHome extends PageObject {
    public static final Target EMAIL = Target.the("Email start sesion").located(By.id("Email"));
    public static final Target PASS = Target.the("Pass start sesion").located(By.id("Password"));
    public static final Target BTN_SEND = Target.the("Button start sesion").located(By.id("btnLogin"));
    public static final Target LINK_REGISTER = Target.the("Link Register").locatedBy("//a[@href='/Public/User/UserRegister']");
    public static final Target EXPECTED_MESSAGE_LOGIN = Target.the("Message start sesion").locatedBy("//div[@class='validation-summary-errors']");

}
