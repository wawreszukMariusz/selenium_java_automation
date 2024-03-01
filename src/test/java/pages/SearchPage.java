package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ExtentReport;

import java.util.List;

public class SearchPage {

    @FindBy(className = "product-thumb")
    public List<WebElement> productList;

    @FindBy(name = "category_id")
    public WebElement categoryDropDown;

    @FindBy(id = "button-search")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@id='content']/h1")
    public WebElement searchHeader;

    @FindBy(className = "fa-th-list")
    public WebElement productListViewButton;

    @FindBy(className = "fa-th")
    public WebElement productGridViewButton;

    @FindBy(id = "input-search")
    public WebElement resultsSearchInput;


    public void setResultsSearchInput(String searchPhrase){
        try {
            this.resultsSearchInput.sendKeys(searchPhrase);
            ExtentReport.test.pass("Send keys to results search input passed");
        } catch (Exception e) {
            ExtentReport.test.fail("Send keys to results search input failed");
        }
    }

    public void clearResultsSearchInput(){
        try {
            this.resultsSearchInput.clear();
            ExtentReport.test.pass("Clearing results search input passed");
        } catch (Exception e) {
            ExtentReport.test.fail("Clearing results search input failed");
        }
    }

    public void clickSearchButton(){
        try {
            this.searchButton.click();
            ExtentReport.test.pass("Clicking on search button done");
        } catch (Exception e) {
            ExtentReport.test.fail("Clicking on search button failed");
        }
    }
    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void productListNotDisplayed(){
        try {
            Assert.assertTrue(productList.isEmpty());
            ExtentReport.test.pass("Checking display of empty shopping cart text done");
        } catch (Exception e) {
            ExtentReport.test.fail("Checking display of empty shopping cart text failed");
        }
    }

    public void productListDisplayed(){
        try {
            Assert.assertTrue(productList.size()>1);
            ExtentReport.test.pass("Checking display of empty shopping cart text done");
        } catch (Exception e) {
            ExtentReport.test.fail("Checking display of empty shopping cart text failed");
        }
    }

    public void resultsNotFoundPageDisplayed(String searchPhrase){
        try{
            Assert.assertTrue(categoryDropDown.isDisplayed());
            Assert.assertTrue(searchButton.isDisplayed());
            Assert.assertTrue(searchHeader.isDisplayed());
            Assert.assertEquals(searchHeader.getText(), this.searchHeaderTextFormat(searchPhrase));
            productListNotDisplayed();

            ExtentReport.test.pass("Checking visibility of results not found page elements passed");
        } catch (AssertionError e) {
            ExtentReport.test.pass("Checking visibility of results not found page elements failed");
        }
    }

    public void resultsFoundPageDisplayed(String searchPhrase){
        try{
            Assert.assertTrue(categoryDropDown.isDisplayed());
            Assert.assertTrue(searchButton.isDisplayed());
            Assert.assertTrue(searchHeader.isDisplayed());
            Assert.assertEquals(searchHeader.getText(), this.searchHeaderTextFormat(searchPhrase));
            this.productListDisplayed();
            Assert.assertTrue(productListViewButton.isDisplayed());
            Assert.assertTrue(productGridViewButton.isDisplayed());

            ExtentReport.test.pass("Checking visibility of results found page elements passed");
        } catch (AssertionError e) {
            ExtentReport.test.pass("Checking visibility of results found page elements failed");
        }
    }

    public String searchHeaderTextFormat(String searchPhrase){
        return "Search - " + searchPhrase;
    }
}
