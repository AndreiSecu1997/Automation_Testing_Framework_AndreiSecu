import managers.WebDriverManager;

public class TestRunner {
    public static void main(String[] args) {

        WebDriverManager fireFoxDriverManager = new WebDriverManager("firefox");
        fireFoxDriverManager.getDriverul().get("https://www.google.com/");
        fireFoxDriverManager.getDriverul().close();

        WebDriverManager webDriverManagerObiect = new WebDriverManager("Chrome");
        webDriverManagerObiect.getDriverul().get("https://www.google.com/");
        webDriverManagerObiect.getDriverul().close();

    }
}
