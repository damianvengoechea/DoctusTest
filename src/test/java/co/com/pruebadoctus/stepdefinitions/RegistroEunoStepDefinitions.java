package co.com.pruebadoctus.stepdefinitions;

import co.com.pruebadoctus.interactions.RegisterUser;
import co.com.pruebadoctus.questions.Register;
import co.com.pruebadoctus.tasks.OpenTheBrowser;
import co.com.pruebadoctus.user_interfaces.EunoHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroEunoStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor damian = Actor.named("Damian");

    @Before
    public void setUp() {
        damian.can(BrowseTheWeb.with(herBrowser));
    }

    @Given("^that Damian is on the page the register euno$")
    public void thatDamianIsOnThePageEunoTheRegister()  {
        damian.wasAbleTo(OpenTheBrowser.on());
        damian.attemptsTo(Click.on(EunoHome.LINK_REGISTER));
    }

    @When("^register with name(.*), lastname(.*), document(.*), email(.*),password (.*)$")
    public void registerWithNameSurnameDocumentEmailPassword(String name, String lastname, String document, String email, String pass)  {
        damian.attemptsTo(RegisterUser.DataRegister(name,lastname,document,email,pass));
    }

    @Then("^the log message should be (.*)$")
    public void theLogMessageShouldBe(String message)  {
        damian.should(seeThat(Register.expectedMessage(),equalTo(message)));
    }
}
