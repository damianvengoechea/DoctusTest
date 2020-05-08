package co.com.pruebadoctus.stepdefinitions;

import co.com.pruebadoctus.interactions.StartSesion;
import co.com.pruebadoctus.questions.Register;
import co.com.pruebadoctus.questions.StartSesionFail;
import co.com.pruebadoctus.tasks.OpenTheBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class InicioSesionStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor damian = Actor.named("Damian");

    @Before
    public void setUp() {
        damian.can(BrowseTheWeb.with(herBrowser));
    }

    @Given("^that Damian is on the page euno$")
    public void thatDamianIsOnThePageEuno() {
        damian.wasAbleTo(OpenTheBrowser.on());
    }

    @When("^start sesion with email (.*), pass (.*)$")
    public void startSesionWithEmailPass(String email, String pass)  {
        damian.attemptsTo(StartSesion.userData(email, pass));
    }

    @Then("^the reply message will be (.*)$")
    public void theReplyMessageWillBe(String message)  {

        damian.should(seeThat(StartSesionFail.expectedMessage(),equalTo(message)));
    }


}
