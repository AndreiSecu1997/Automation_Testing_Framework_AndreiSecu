package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import pageobjects.ContactPage;
import utils.TestContext;

public class ContactSteps {

    private TestContext context;
    private ContactPage contactPage;

    public ContactSteps(TestContext context) {
        this.context = context;
        contactPage = new ContactPage(context.getWebDriverManager().getDriverul());
    }

    @When("^\"([^\"]*)\" is entered into Name input field$")
    public void isEnteredIntoNameInputField(String nameData) throws Throwable {
        contactPage.enterName(nameData);
    }
}
