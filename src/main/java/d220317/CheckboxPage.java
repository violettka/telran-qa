package d220317;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends Page{

    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input:nth-child(1)")
    WebElement checkbox1;

    @FindBy(css = "input:nth-child(3)")
    WebElement checkbox2;

    @FindBy(id = "checkboxes")
    WebElement passwordField;

    public void addElt1() {
        checkbox1.click();
    }

    public void addElt2() {
        checkbox2.click();
    }
}
