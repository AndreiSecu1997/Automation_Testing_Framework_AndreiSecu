package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.jupiter.api.Assertions;
import utils.TestContext;

public class GeneralSteps {

    private TestContext context;

    public GeneralSteps(TestContext testContext) {
        this.context = testContext;
    }

    @Given("^\"([^\"]*)\" is accessed$")
    public void isAccessed(String adresaUrl) throws InterruptedException {
        context.getWebDriverManager().getDriverul().get(adresaUrl);
    }

    @Then("^\"([^\"]*)\" is present within the current url$")
    public void isPresentWithinTheCurrentUrl(String keyWord) {
        boolean containsCorrectUrlEndpoint = context.getWebDriverManager().getDriverul().getCurrentUrl().contains(keyWord);
        Assertions.assertTrue(containsCorrectUrlEndpoint, "The Actual url does not contain the correct endpoint");
    }
}
