package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListPage extends BasePage{
    private String searchField = "//body/form[1]/input[1]";
    private String searchResults = "name";

    public ListPage() {
        super(driver);
    }

    public void navigateToListPage(){
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }

    public void enterSearchCriteria(String state) throws InterruptedException {
        try {
            Thread.sleep(600);
            write(searchField,state);
        } catch (NoSuchElementException e) {
            System.out.println("The Web element Search fields couldn't be found.");
            e.printStackTrace();
        }

    }

    public List<String> getAllSearchResults(){
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringsFromList = new ArrayList<>();
        for (WebElement e: list) {
            stringsFromList.add(e.getText());
        }
        return stringsFromList;
    }
}
