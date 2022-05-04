package cucumber.sconto.steps;

import com.codeborne.selenide.Selenide;
import cucumber.sconto.pages.HomeP;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.open;


/**
 * HomePageSteps
 * Class implements the Homepage step definitions.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HomeSteps {
    HomeP homePage;

    @Given("I am on the Homepage")
    public void iAmOnHomePage() {
        homePage = Selenide.open(HomeP.basicURL, HomeP.class);
        homePage.acceptCookies();
    }

    @Then("I should see icon text {}") // {} - плэйсхолдер, теперь можем менять
    public void iShouldSeeIconText(String text) {
        homePage.checkIconText(text);
    }
}
