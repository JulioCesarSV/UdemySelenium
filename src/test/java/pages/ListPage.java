package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends BasePage{
    private String searchField = "";
    private String searchResults = "name";

    public ListPage() {
        super(driver);
    }

    public void enterSearchCriteria() throws InterruptedException {
        Thread.sleep(600);
        write(searchField,"Washington");
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
