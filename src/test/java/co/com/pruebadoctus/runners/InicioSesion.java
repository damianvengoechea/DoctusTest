package co.com.pruebadoctus.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/inicio_sesion.feature",
        glue = "co.com.pruebadoctus.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class InicioSesion {
}
