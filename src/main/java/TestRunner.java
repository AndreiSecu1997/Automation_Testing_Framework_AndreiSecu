import managers.WebDriverManager;
import pageobjects.HomePage;
import pageobjects.RegisterPage;


public class TestRunner {
    public static void main(String[] args) {
        WebDriverManager webDriverManagerObiect = new WebDriverManager("Chrome");
        webDriverManagerObiect.getDriverul().get("https://demo.opencart.com/");

        HomePage homePage = new HomePage(webDriverManagerObiect.getDriverul());
        homePage.navigateToRegisterPageViaHeader();

        RegisterPage registerPage = new RegisterPage(webDriverManagerObiect.getDriverul());
        registerPage.populateRegisterFormWithData("Charls", "Smith", "emailadres@gmail.com", "067717845", "HardPass123321", "HardPass123321");
        registerPage.clickContinueBtn();

        registerPage.performSearchFor("Apple");
        registerPage.clearSearchField();
        registerPage.performSearchFor("Samsung");

        webDriverManagerObiect.getDriverul().get("https://www.google.com/");
        webDriverManagerObiect.getDriverul().close();
    }
}
