package cucumber.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WishlistP {

    private static By itemInWishlist = By.cssSelector(".wishlistEntry");

    private static By textUnderTheItem = By.cssSelector(".wishlistEntry__articleAddToWishlistInformation--hiddenInS");

    public SelenideElement listHasAnItem() {
        return $(textUnderTheItem);
    }
}
