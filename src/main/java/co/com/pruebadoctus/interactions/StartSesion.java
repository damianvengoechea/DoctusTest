package co.com.pruebadoctus.interactions;

import co.com.pruebadoctus.user_interfaces.EunoHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StartSesion implements Interaction {
    public String email;
    public String password;

    public StartSesion(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(email).into(EunoHome.EMAIL));
        actor.attemptsTo(Enter.theValue(password).into(EunoHome.PASS));
        actor.attemptsTo(Click.on(EunoHome.BTN_SEND));
    }

    public static StartSesion userData(String email, String pass) {
        return instrumented(StartSesion.class,email,pass);
    }
}
