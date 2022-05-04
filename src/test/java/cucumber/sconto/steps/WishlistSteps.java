package cucumber.sconto.steps;

import cucumber.sconto.pages.WishlistP;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.$;

public class WishlistSteps {

    WishlistP wishlistPage;

    @Then("I see added item")
    public void iSeeItems() {
        wishlistPage.listHasAnItem();
    }
}
