package d220317;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class LoginPage extends Page { // PageFactory
    public LoginPage(WebDriver driver) { // конструктор
        super(driver);
    }

    //@FindBy - в скобках мы выбираем linkText и добавляем нужную надпись, сразу под этой строкой пишем какой WebElement
    @FindBy (linkText = "Form Authentication")
    WebElement authenticationText;
    //  driver.findElement(By.linkText("Form Authentication")).click();

    public void goToLoginPage (){ // метод, который кликает на элемент
        authenticationText.click();
    }
}

