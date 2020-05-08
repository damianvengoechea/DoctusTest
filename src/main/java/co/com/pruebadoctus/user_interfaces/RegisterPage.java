package co.com.pruebadoctus.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {

    public static final Target FORM_REGISTER = Target.the("Email start sesion").locatedBy("//input[@data-bind='value: {0}']");
    public static final Target CHK_I_AGREE = Target.the("Check I agree").locatedBy("//input[@data-bind='checked:AcceptTerms']");
    public static final Target BTN_LOGIN = Target.the("Button login").located(By.id("btnLogin"));
    public static final Target RESULT_MESSAGE = Target.the("Message result to register").located(By.id("register-login"));
}
