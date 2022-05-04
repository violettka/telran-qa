package cucumber.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FurnitureP {

    /* Elements */

    private static By furnitureHeader = By.xpath("//*[@id=\"categoryHeaderContainer\"]/div/h1");

    private static By itemWishlistIcon = By.cssSelector("articleTile--hover .wishlistIcon");

    public SelenideElement furnitureHeader() {
        return $(furnitureHeader);
    }

    public void clickOn(){
        $(itemWishlistIcon).click();
    }

    public void activeWishlistIcon() {
        $(itemWishlistIcon).hover();
    }
}
