package cucumber.sconto.steps;

import com.codeborne.selenide.Condition;
import cucumber.sconto.pages.CustomerAccountP;
import cucumber.sconto.pages.LoginP;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.page;

/**
 * CustomerAccountSteps
 * Class implements the Customer Account page step definitions.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class CustomerAccountSteps {

    CustomerAccountP customerAccountPage;
    LoginP loginPage;

    @Then("I should be logged in")
    public void shouldBeLoggedIn() {
        customerAccountPage = page(CustomerAccountP.class);
        customerAccountPage.accountTitle().should(Condition.exist);
    }

    @When("I click on logout Button")
    public void iClickOnLogoutButton() {
        loginPage = customerAccountPage.clickOnLogout();
    }

    @Given("I am logged in")
    public void iAmLoggedIn() {
        shouldBeLoggedIn();
    }
}
