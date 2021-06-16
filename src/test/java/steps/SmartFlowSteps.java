package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GooglePage;
import pages.SmartFlowPage;

public class SmartFlowSteps {
    SmartFlowPage smartflow = new SmartFlowPage();

    @Given("^I am on the loggin page$")
    public void navigateSmartFlow() {
        smartflow.navigateToSmartFlow();

    }

    @When("^I enter the credentials$")
    public void enterSearchCriteria() {
        smartflow.accesSmartFlow();
    }

    @And("^click enter$")
    public void clickSearchButton() {
        smartflow.enterSmartFlow();
    }

    @Then("^the i logged to the page$")
    public void validateResults() {

        System.out.println("Ya estamos adentro");

        try
        {
            Thread.sleep(10000);
        }catch(InterruptedException e){}
    }
}
