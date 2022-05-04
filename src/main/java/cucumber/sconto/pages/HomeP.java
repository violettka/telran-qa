package cucumber.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import d220407.sconto.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * HomePage
 * Class implements the HomePage methods and fields.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HomeP {
    HomeP homePage;

    /* Properties */

    public static String basicURL = PropertiesLoader.loadProperty("url");

    /* Elements */

    private static By acceptBtn = By.xpath("//*[@data-accept-action='all']");
    // private static By banner = By.cssSelector(".consentForm__title");
    private static By loginIcon = By.cssSelector(".headerElement--login");
    private static By markedListIcon = By.cssSelector(".headerElement--Merkliste");

    private static final By iconLogin = By.cssSelector(".headerElement__text--login"); // тут можно придумать выбор из вариантов навигации
    private static By wishlistNumber = By.cssSelector(".headerElement__status--wishlist");
    private static final By sofa = By.cssSelector(".menu__link--moebel__text--sofa"); // тут можно придумать выбор из вариантов мебели

    public void checkIconText(String iconText) {
        $(iconLogin).shouldHave(Condition.text(iconText));
    }

    public void acceptCookies(){
        $(acceptBtn).click();
        // $(banner).shouldNot(Condition.exist);
    }

    public LoginP clickLoginIcon() {
        $(loginIcon).click();
        return Selenide.page(LoginP.class);
    }

    public FurnitureP clickOnFurniture() {
        $(sofa).doubleClick(); // если клик 1, то открывается меню выбора вариантов софы
        return Selenide.page(FurnitureP.class);
    }

    public WishlistP clickOnWishlist() {
        $(markedListIcon).click();
        return Selenide.page(WishlistP.class);
    }

    public SelenideElement countNumber() {
        return $(wishlistNumber);
    }

    public void hoverLoginIcon() {
        $(loginIcon).hover();
    }

    //public SelenideElement carousel(){ return $(carouselImg); }
}
