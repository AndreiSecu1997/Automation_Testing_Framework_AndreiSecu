package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.junit.jupiter.api.Assertions;
import utils.TestContext;

public class GeneralSteps {

    private TestContext context;

    public GeneralSteps(TestContext testContext) {
        this.context = testContext;
    }

    @Given("^\"([^\"]*)\" is accessed$")
    public void isAccessed(String adresaUrl) {
        context.getWebDriverManager().getDriverul().get(adresaUrl);
    }

    @Then("^\"([^\"]*)\" is present within the current url$")
    public void isPresentWithinTheCurrentUrl(String keyWord) {
        boolean containsCorrectUrlEndpoint = context.getWebDriverManager().getDriverul().getCurrentUrl().contains(keyWord);
        Assertions.assertTrue(containsCorrectUrlEndpoint, "The Actual url does not contain the correct endpoint");
    }

    @And("^the system sleeps for (\\d+) ms$")
    public void theSystemSleepsForMs(int miliseconds) throws InterruptedException {
        Thread.sleep(miliseconds);
    }
}
