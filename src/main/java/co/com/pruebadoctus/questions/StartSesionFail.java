package co.com.pruebadoctus.questions;

import co.com.pruebadoctus.user_interfaces.EunoHome;
import co.com.pruebadoctus.user_interfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class StartSesionFail implements Question<String> {
   public String mensaje;


    @Override
    public String answeredBy(Actor actor) {
        mensaje = EunoHome.EXPECTED_MESSAGE_LOGIN.resolveFor(actor).getText();
        System.out.println("Este es el mensaje capturado: " + mensaje);
        return mensaje;
    }

    public static StartSesionFail expectedMessage () {
        return new StartSesionFail();
    }
}
