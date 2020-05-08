package co.com.pruebadoctus.tasks;

import co.com.pruebadoctus.user_interfaces.EunoHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new EunoHome()));
    }
    public static OpenTheBrowser on() {
        return instrumented(OpenTheBrowser.class);
    }

}
