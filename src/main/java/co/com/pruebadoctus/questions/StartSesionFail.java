package co.com.pruebadoctus.questions;

import co.com.pruebadoctus.user_interfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class StartSesionFail implements Question<String> {
   public String mensaje;


    @Override
    public String answeredBy(Actor actor) {
        mensaje = RegisterPage.RESULT_MESSAGE.resolveFor(actor).getText();

        return mensaje;
    }

    public static StartSesionFail expectedMessage () {
        return new StartSesionFail();
    }
}
