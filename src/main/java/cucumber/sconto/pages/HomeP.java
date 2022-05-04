package cucumber.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import d220407.sconto.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * HomePage
 * Class implements the HomePage methods and fields.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HomeP {

    /* Properties */

    public static String basicURL = PropertiesLoader.loadProperty("url");

    /* Elements */

    private static By acceptBtn = By.xpath("//*[@data-accept-action='all']");
    // private static By banner = By.cssSelector(".consentForm__title");
    private static By loginIcon = By.cssSelector(".headerElement--login");
    // private static By carouselImg = By.cssSelector(".carouselImage");

    private static final By iconLogin = By.cssSelector(".headerElement__text--login");

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

    public void hoverLoginIcon() {
        $(loginIcon).hover();
    }

    //public SelenideElement carousel(){ return $(carouselImg); }
}
