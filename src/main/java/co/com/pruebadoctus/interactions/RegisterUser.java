package co.com.pruebadoctus.interactions;

import co.com.pruebadoctus.user_interfaces.RegisterPage;
import co.com.pruebadoctus.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pruebadoctus.utils.Constant.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterUser implements Interaction {

    public String nombre;
    public String apellido;
    public String documento;
    public String email;
    public String password;

    public RegisterUser(String nombre, String apellido, String documento, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(nombre).into(RegisterPage.FORM_REGISTER.of(NAME)));
        actor.attemptsTo(Enter.theValue(apellido).into(RegisterPage.FORM_REGISTER.of(LASTNAME)));
        actor.attemptsTo(Enter.theValue(documento).into(RegisterPage.FORM_REGISTER.of(DOCUMENT)));
        actor.attemptsTo(Enter.theValue(email).into(RegisterPage.FORM_REGISTER.of(EMAIL)));
        actor.attemptsTo(Enter.theValue(email).into(RegisterPage.FORM_REGISTER.of(CONFIRME_EMAIL)));
        actor.attemptsTo(Enter.theValue(password).into(RegisterPage.FORM_REGISTER.of(PASS)));
        actor.attemptsTo(Enter.theValue(password).into(RegisterPage.FORM_REGISTER.of(CONFIRME_PASS)));
        actor.attemptsTo(Click.on(RegisterPage.CHK_I_AGREE));
        actor.attemptsTo(Click.on(RegisterPage.BTN_LOGIN));
        actor.attemptsTo(WaitUntil.the(RegisterPage.RESULT_MESSAGE, isVisible()).forNoMoreThan(5).seconds());

    }

    public static RegisterUser DataRegister(String nombre, String apellido, String documento, String email, String password) {
        return instrumented(RegisterUser.class,nombre,apellido,documento,email,password);
    }
}
