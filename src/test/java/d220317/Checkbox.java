package d220317;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Checkbox extends BaseTest{

    @Test
    public void checkbox1Click() { // оба выбраны
        checkboxPage = homePage.goToCheckboxPage(); // driver.findElement(By.linkText("Checkboxes")).click();
        checkboxPage.addElt1(); // driver.findElement(By.cssSelector("input:nth-child(1)")).click();
    }

    @Test
    public void checkbox2Click() { // оба не выбраны
        checkboxPage = homePage.goToCheckboxPage(); // driver.findElement(By.linkText("Checkboxes")).click();
        checkboxPage.addElt2(); // driver.findElement(By.cssSelector("input:nth-child(3)")).click();
    }

    @Test
    public void clickCheckbox1and2() { // верхний даб нижний нет
        checkboxPage = homePage.goToCheckboxPage(); // driver.findElement(By.linkText("Checkboxes")).click();
        checkboxPage.addElt1(); // driver.findElement(By.cssSelector("input:nth-child(1)")).click();
        checkboxPage.addElt2(); // driver.findElement(By.cssSelector("input:nth-child(3)")).click();
    }

    @Test
    public void clickCheckbox1twoTimes() { // нажимаем 2 раза на 1 элемент
        checkboxPage = homePage.goToCheckboxPage(); // driver.findElement(By.linkText("Checkboxes")).click();
        checkboxPage.addElt1(); // driver.findElement(By.cssSelector("input:nth-child(1)")).click();
        checkboxPage.addElt1(); // driver.findElement(By.cssSelector("input:nth-child(1)")).click();
    }

    @Test
    public void clickCheckbox2twoTimes() { // нажимаем 2 раза на 2 элемент
        checkboxPage = homePage.goToCheckboxPage(); // driver.findElement(By.linkText("Checkboxes")).click();
        checkboxPage.addElt2(); // driver.findElement(By.cssSelector("input:nth-child(3)")).click();
        checkboxPage.addElt2(); // driver.findElement(By.cssSelector("input:nth-child(3)")).click();
    }

}
