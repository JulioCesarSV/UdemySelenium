package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListPage;

import java.util.List;

public class ListSteps {
    ListPage listPage = new ListPage();
    @Given("I navigate to the list page$")
    public void iNavigateToTheListPage() {
    listPage.navigateToListPage();
    }

    @When("I search (.+) in the list$")
    public void iSearchTheList(String state) throws InterruptedException {
        listPage.enterSearchCriteria(state);
    }

    @Then("I can find (.+) in the list$")
    public void iCanFindTheTextInTheList(String city) {
        List<String> lista = listPage.getAllSearchResults();
        boolean textIsThere = lista.contains(city);

        if (textIsThere){
            System.out.println("The text in on the list");
        }else {
            throw new Error("No text");
        }
    }
}
