package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends Page {
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"input-name\"]")
    private WebElement nameInput;

    public void enterName(String name) {
        nameInput.sendKeys(name);
    }
}
