package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListPage;

import java.util.List;

public class SandBoxSteps {
    ListPage listPage = new ListPage();
    @Given("I navigate to the list page")
    public void iNavigateToTheListPage() {
    listPage.navigateToListPage();
    }

    @When("I search the list")
    public void iSearchTheList() throws InterruptedException {
        listPage.enterSearchCriteria();
    }

    @Then("I can find the text in the list")
    public void iCanFindTheTextInTheList() {
        List<String> lista = listPage.getAllSearchResults();
        boolean textIsThere = lista.contains("Seattle, Washington");

        if (textIsThere){
            System.out.println("The text in on the list");
        }else {
            throw new Error("No text");
        }
    }
}
