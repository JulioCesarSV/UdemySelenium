package pages;

import org.openqa.selenium.JavascriptExecutor;

import java.util.NoSuchElementException;

public class SmartFlowPage extends BasePage{
    private  String userField = "//input[@id='UserName']";
    private  String passwordField = "//input[@id='Password']";
    private  String accessButton = "//input[@id='button']";
    private  String accessAdministration = "/html/body/div[3]/div/div[1]/div[2]/div[12]/div[1]/span[1]";
    private  String notifications = "//body[1]/nav[1]/div[4]/div[2]/ul[1]/li[2]/div[1]/div[2]/a[2]";
    private  String cookies = "//*[@id=\"main\"]/section/div/button";
    private  String employeeCatalog = "//body[1]/div[3]/div[1]/div[1]/div[2]/div[4]/div[1]";
    private  String newEmployee = "//body/div[@id='main']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]";
    private  String newCompany = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
    private  String getNewEmployee = "//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";

    public SmartFlowPage (){
        super(driver);
    }

    public void navigateToSmartFlow() {
        navigateTo("https://stage-0.smartflow.com.mx/");
    }
    public void accesSmartFlow(){
        write(userField,"root");
        write(passwordField,"St4rtTheChange.");
    }
    public void enterSmartFlow(){
        clickElement(accessButton);
        clickElement(cookies);
        //clickElement(notifications);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        clickElement(accessAdministration);
        clickElement(employeeCatalog);
        //clickElement(notifications);
        clickElement(newEmployee);
        write(newCompany,"NUEVA");
        try
        {
            Thread.sleep(5000);
        }catch(InterruptedException e){}
        tab(newCompany);
        write(getNewEmployee,"test");
        try
        {
            Thread.sleep(10000);
        }catch(InterruptedException e){}
    }
}
