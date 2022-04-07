package d220407.sconto;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {

    HomePage homePage; // эту часть мы выносим для упрощения написания других тестов
    HeaderMenu headerMenu;
    LoginPage loginPage;
    KontoPage kontoPage;

    @Test
    public void LoginLogoutTest() {
        headerMenu = open("https://www.sconto.de/", HeaderMenu.class);
        // удаляем всплывающее окно
        loginPage = headerMenu.clickOnLoginIcon();
        loginPage.fillCred("abramova.violetta@gmail.com", "GetS0meSconto!");
        headerMenu = loginPage.clickOnLoginBtn(); // мы фиксируем изменения
        headerMenu.checkIconText("Mein Konto");
        kontoPage = headerMenu.clickMyKontoIcon();
        kontoPage.checkGreetingsText();
        headerMenu = kontoPage.clickOnLogout(); // и тут мы поняли, что что-то нужно менять
        headerMenu.checkIconText("Anmelden");
    }
}
/*
        1. open HomePage
        2. click id=loginEmail
        3. LoginPage https://www.sconto.de/login
        4. fill e-mail - abramova.violetta@gmail.com
        5. click id=loginPassword
        6. fill pass - GetS0meSconto!
        7. click button
        8. HomePage
        9. shouldHave text "Mein Konto"
        10. click css=.headerElement__link--login
        11. KundenkontoPage
        12. shouldHave text "Hallo, " / "Willkommen in Ihrem Kundenkonto."
        13. click Abmelden
        14. LoginPage
        15. shouldHave text "Anmelden" / "Sie haben noch kein Kundenkonto?"
        */
