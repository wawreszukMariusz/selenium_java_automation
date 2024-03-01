package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ExtentReport;

import java.util.List;


public class HomePage extends BasePage {

    @FindBy(id = "slideshow0")
    public WebElement slideShow;

    @FindBy(className = "swiper-button-next")
    public WebElement slideShowNextButton;

    @FindBy(className = "swiper-button-prev")
    public WebElement slideShowPrevButton;

    @FindBy(xpath = "//h3[text()='Featured']")
    public WebElement featuredHeader;

    @FindBy(xpath = "//div[@class='caption']//a")
    public List<WebElement> productNameList;

    @FindBy(className = "product-thumb")
    public List<WebElement> productList;

    @FindBy(className = "caption")
    public List<WebElement> productDesc;

    @FindBy(className = "fa-shopping-cart")
    public List<WebElement> productAddToCart;

    @FindBy(className = "fa-heart")
    public List<WebElement> productAddToWishList;

    @FindBy(className = "fa-exchange")
    public List<WebElement> productCompareProducts;

    @FindBy(className = "price")
    public List<WebElement> productPrice;

    @FindBy(className = "price-tax")
    public List<WebElement> productTaxPrice;

    @FindBy(className = "carousel0")
    public WebElement featuredCompaniesSection;

    @FindBy(xpath = "//div[@id='carousel0']/div/div")
    public List<WebElement> singleFeaturedCompany;

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=common/home']")
    public WebElement logo;

    @FindBy(name = "search")
    public WebElement searchInput;

    @FindBy(className = "input-group-btn")
    public WebElement searchSubmitButton;

    @FindBy(id = "cart")
    public WebElement shoppingBasketListButton;

    @FindBy(xpath = "//div[@class='btn-group']")
    public WebElement changeCurrencyButton;

    @FindBy(name = "EUR")
    public WebElement changeToEuroCurrencyButton;

    @FindBy(name = "GBP")
    public WebElement changeToPoundCurrencyButton;

    @FindBy(name = "USD")
    public WebElement changeToDollarCurrencyButton;

    @FindBy(className = "fa-phone")
    public WebElement phoneContactButton;

    @FindBy(xpath = "//span[text()='123456789']")
    public WebElement phoneNumberSpan;

    @FindBy(className = "fa-user")
    public WebElement myAccountButton;

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerDropDownButton;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginDropDownButton;

    @FindBy(className = "fa-heart")
    public WebElement wishListButton;

    @FindBy(className = "fa-shopping-cart")
    public WebElement shoppingBasketButton;

    @FindBy(className = "fa-share")
    public WebElement checkoutButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu pull-right']//p")
    public WebElement shoppingBasketEmptyInfo;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a")
    public List<WebElement> navigationLinkList;

    @FindBy(xpath = "//div[@class='dropdown-menu']//li/a")
    public List<WebElement> navigationDropdownLinkList;

    public void clickMyAccountButton(){
        try {
            this.myAccountButton.click();
            ExtentReport.test.pass("Clicking on My account button done");
        } catch (Exception e) {
            ExtentReport.test.fail("Clicking on My account failed");
        }
    }

    public void clickRegisterDropDownButton(){
        try {
            this.registerDropDownButton.click();
            ExtentReport.test.pass("Clicking on register dropdown button done");
        } catch (Exception e) {
            ExtentReport.test.fail("Clicking on register dropdown button failed");
        }
    }

    public void clickLoginDropDownButton(){
        try {
            this.loginDropDownButton.click();
            ExtentReport.test.pass("Clicking on login dropdown button done");
        } catch (Exception e) {
            ExtentReport.test.fail("Clicking on login dropdown button failed");
        }
    }

    public void clickSearchInput(){
        try {
            this.searchInput.click();
            ExtentReport.test.pass("Clicking on search input done");
        } catch (Exception e) {
            ExtentReport.test.fail("Clicking on search input failed");
        }
    }

    public void setSearchInput(String searchPhrase){
        try {
            this.searchInput.sendKeys(searchPhrase);
            ExtentReport.test.pass("Send keys to search input passed");
        } catch (Exception e) {
            ExtentReport.test.fail("Send keys to search input failed");
        }
    }

    public void clickSearchSubmitButton(){
        try {
            this.searchSubmitButton.click();
            ExtentReport.test.pass("Clicking on search submit button done");
        } catch (Exception e) {
            ExtentReport.test.fail("Clicking on search submit button failed");
        }
    }

    public void clickChangeCurrencyButton(){
        try {
            this.changeCurrencyButton.click();
            ExtentReport.test.pass("Clicking on change currency button done");
        } catch (Exception e) {
            ExtentReport.test.fail("Clicking on change currency button failed");
        }
    }

    public void clickChangeToEuroCurrencyButton(){
        try {
            this.changeToEuroCurrencyButton.click();
            ExtentReport.test.pass("Clicking on change to euro currency button done");
        } catch (Exception e) {
            ExtentReport.test.fail("Clicking on change to euro currency button failed");
        }
    }

    public void clickChangeToPoundCurrencyButton(){
        try {
            this.changeToPoundCurrencyButton.click();
            ExtentReport.test.pass("Clicking on change to pound currency button done");
        } catch (Exception e) {
            ExtentReport.test.fail("Clicking on change to pound currency button failed");
        }
    }

    public void checkProductPriceCurrency(String expectedCurrency){
        try {
            Assert.assertTrue(this.productPrice.get(0).getText().contains(expectedCurrency));
            ExtentReport.test.pass("Checking product price currency change to " + expectedCurrency + "  done");
        } catch (AssertionError e) {
            ExtentReport.test.fail("Checking product price currency change to " + expectedCurrency + "  failed");
        }
    }

    public void clickOnProduct(String productName){
        try {
            for(int i=0; i<this.productNameList.size(); i++){
                if(productName.equals(this.productNameList.get(i).getText())){
                    this.productNameList.get(i).click();
                    ExtentReport.test.pass("Clicking on product " + productName + " done");
                }
            }
        } catch (Exception e) {
            ExtentReport.test.fail("Clicking on product " + productName + " failed");
        }
    }

    public void clickOnNavigationLink(String linkName){
        try {
            for(int i=0; i<this.navigationLinkList.size(); i++){
                if(linkName.equals(this.navigationLinkList.get(i).getText())){
                    this.navigationLinkList.get(i).click();
                    ExtentReport.test.pass("Clicking on navigation link " + linkName + " done");
                }
            }
        } catch (Exception e) {
            ExtentReport.test.fail("Clicking on navigation link " + linkName + " failed");
        }
    }

    public void clickOnNavigationDropdownLink(String linkName){
        try {
            for(int i=0; i<this.navigationDropdownLinkList.size(); i++){
                if(this.navigationDropdownLinkList.get(i).getText().contains(linkName)){
                    this.navigationDropdownLinkList.get(i).click();
                    ExtentReport.test.pass("Clicking on navigation dropdown link " + linkName + " done");
                }
            }
        } catch (Exception e) {
            ExtentReport.test.fail("Clicking on navigation dropdown link " + linkName + " failed");
        }
    }

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void navigationDisplayed(){
        try{
            Assert.assertTrue(logo.isDisplayed());
            Assert.assertTrue(searchInput.isDisplayed());
            Assert.assertTrue(searchSubmitButton.isDisplayed());
            Assert.assertTrue(shoppingBasketListButton.isDisplayed());
            Assert.assertTrue(changeCurrencyButton.isDisplayed());
            Assert.assertTrue(phoneContactButton.isDisplayed());
            Assert.assertTrue(phoneNumberSpan.isDisplayed());
            Assert.assertTrue(myAccountButton.isDisplayed());
            Assert.assertTrue(wishListButton.isDisplayed());
            Assert.assertTrue(shoppingBasketButton.isDisplayed());
            Assert.assertTrue(checkoutButton.isDisplayed());
            ExtentReport.test.pass("Checking visibility of navigation elements passed");
        } catch (Exception e) {
            ExtentReport.test.fail("Checking visibility of navigation elements failed");
        }
    }

    public void pageDisplayed(){
        try{
//          Assert.assertTrue(this.slideShow.isDisplayed());
            Assert.assertTrue(this.featuredHeader.isDisplayed());
            Assert.assertTrue(this.productList.get(0).isDisplayed());
            Assert.assertTrue(this.productDesc.get(0).isDisplayed());
            Assert.assertTrue(this.productAddToCart.get(0).isDisplayed());
            Assert.assertTrue(this.productAddToWishList.get(0).isDisplayed());
            Assert.assertTrue(this.productCompareProducts.get(0).isDisplayed());
            Assert.assertTrue(this.productPrice.get(0).isDisplayed());
            Assert.assertTrue(this.productTaxPrice.get(0).isDisplayed());
            Assert.assertTrue(this.featuredCompaniesSection.isDisplayed());
            //Assert.assertTrue(this.singleFeaturedCompany.get(0).isDisplayed());
            this.navigationDisplayed();
            ExtentReport.test.pass("Checking visibility of page elements passed");
        } catch (Exception e) {
            ExtentReport.test.fail("Checking visibility of page elements failed");
        }
    }
}
