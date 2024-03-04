package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(className = "product-thumb")
    private List<WebElement> productList;

    @FindBy(name = "category_id")
    private WebElement categoryDropDown;

    @FindBy(id = "button-search")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement searchHeader;

    @FindBy(className = "fa-th-list")
    private WebElement productListViewButton;

    @FindBy(className = "fa-th")
    private WebElement productGridViewButton;

    @FindBy(id = "input-search")
    private WebElement resultsSearchInput;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setResultsSearchInput(String searchPhrase) {
        elementSendKeys(this.resultsSearchInput, "result search input", searchPhrase);
    }

    public void clearResultsSearchInput() {
        clearElement(this.resultsSearchInput, "results search input");
    }

    public void clickSearchButton() {
        clickElement(this.searchButton, "search button");
    }

    public void productListNotDisplayed() {
        elementListNotDisplayed(this.productList, "product list");
    }

    public void productListDisplayed() {
        elementListNotEmpty(this.productList, "product list");
    }

    public void categoryDropDownDisplayed() {
        elementDisplayed(this.categoryDropDown, "category dropdown");
    }

    public void searchButtonDisplayed() {
        elementDisplayed(this.searchButton, "search button");
    }

    public void searchHeaderDisplayed(String searchPhrase) {
        elementDisplayed(this.searchHeader, "search header");
        compareElements(this.searchHeader, "search header", this.searchHeaderTextFormat(searchPhrase));
    }

    public void productListViewButtonDisplayed() {
        elementDisplayed(this.productListViewButton, "product list view button");
    }

    public void productGridViewButtonDisplayed() {
        elementDisplayed(this.productGridViewButton, "product grid view button");
    }

    public void resultsNotFoundPageDisplayed(String searchPhrase) {
        this.categoryDropDownDisplayed();
        this.searchButtonDisplayed();
        this.searchHeaderDisplayed(searchPhrase);
        this.productListNotDisplayed();
    }

    public void resultsFoundPageDisplayed(String searchPhrase) {
        this.categoryDropDownDisplayed();
        this.searchButtonDisplayed();
        this.searchHeaderDisplayed(searchPhrase);
        this.productListDisplayed();
        this.productListViewButtonDisplayed();
        this.productGridViewButtonDisplayed();
    }

    public String searchHeaderTextFormat(String searchPhrase) {
        return "Search - " + searchPhrase;
    }
}
