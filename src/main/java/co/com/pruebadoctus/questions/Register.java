package co.com.pruebadoctus.questions;

import co.com.pruebadoctus.user_interfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Register implements Question<String> {

    public String mensaje;

    @Override
    public String answeredBy(Actor actor) {
        mensaje = RegisterPage.RESULT_MESSAGE.resolveFor(actor).getText();
        System.out.println("Este es el mensaje capturado" + mensaje);
        return mensaje;
    }

    public static Register expectedMessage () {
        return new Register();
    }
}
