package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    public List<WebElement> productDescList;

    @FindBy(className = "fa-shopping-cart")
    public List<WebElement> productAddToCartList;

    @FindBy(className = "fa-heart")
    public List<WebElement> productAddToWishList;

    @FindBy(className = "fa-exchange")
    public List<WebElement> productCompareProductsList;

    @FindBy(className = "price")
    public List<WebElement> productPriceList;

    @FindBy(className = "price-tax")
    public List<WebElement> productTaxPriceList;

    @FindBy(className = "carousel0")
    public WebElement featuredCompaniesSection;

    @FindBy(xpath = "//div[@id='carousel0']/div/div")
    public List<WebElement> singleFeaturedCompanyList;

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

    public void clickMyAccountButton() {
        clickElement(this.myAccountButton, "my account button");
    }

    public void clickRegisterDropDownButton() {
        clickElement(this.registerDropDownButton, "register dropdown button");
    }

    public void clickLoginDropDownButton() {
        clickElement(this.loginDropDownButton, "login dropdown button");
    }

    public void clickSearchInput() {
        clickElement(this.searchInput, "search input");
    }

    public void setSearchInput(String searchPhrase) {
        elementSendKeys(searchInput, "search input", searchPhrase);
    }

    public void clickSearchSubmitButton() {
        clickElement(this.searchSubmitButton, "search submit button");
    }

    public void clickChangeCurrencyButton() {
        clickElement(this.changeCurrencyButton, "change currency button");
    }

    public void clickChangeToEuroCurrencyButton() {
        clickElement(this.changeToEuroCurrencyButton, "change to euro currency button");
    }

    public void clickChangeToPoundCurrencyButton() {
        clickElement(this.changeToPoundCurrencyButton, "change to pound currency button");
    }

    public void checkProductPriceCurrency(String expectedCurrency) {
        compareElements(this.productPriceList.get(0), "product price list", expectedCurrency);
    }

    public void logoDisplayed() {
        elementDisplayed(this.logo, "logo");
    }

    public void searchInputDisplayed() {
        elementDisplayed(this.searchInput, "search input");
    }

    public void searchSubmitButtonDisplayed() {
        elementDisplayed(this.searchSubmitButton, "search submit button");
    }

    public void shoppingBasketListButtonDisplayed() {
        elementDisplayed(this.shoppingBasketListButton, "shopping basket list button");
    }

    public void changeCurrencyButtonDisplayed() {
        elementDisplayed(this.changeCurrencyButton, "change currency button");
    }

    public void phoneContactButtonDisplayed() {
        elementDisplayed(this.phoneContactButton, "phone contact button");
    }

    public void phoneNumberSpanDisplayed() {
        elementDisplayed(this.phoneNumberSpan, "phone number span");
    }

    public void myAccountButtonDisplayed() {
        elementDisplayed(this.myAccountButton, "my account button");
    }

    public void wishListButtonDisplayed() {
        elementDisplayed(this.wishListButton, "wish list button");
    }

    public void shoppingBasketButtonDisplayed() {
        elementDisplayed(this.shoppingBasketButton, "shopping basket button");
    }

    public void featuredHeaderDisplayed() {
        elementDisplayed(this.featuredHeader, "featured header");
    }


    public void productListDisplayed() {
        elementDisplayed(this.productList.get(0), "product list");
    }

    public void productDescListDisplayed() {
        elementDisplayed(this.productDescList.get(0), "product desc list");
    }

    public void productAddToCartListDisplayed() {
        elementDisplayed(this.productAddToCartList.get(0), "product add to cart list");
    }

    public void productAddToWishListDisplayed() {
        elementDisplayed(this.productAddToWishList.get(0), "product add to wish list");
    }

    public void productCompareProductsListDisplayed() {
        elementDisplayed(this.productCompareProductsList.get(0), "product compare products list");
    }

    public void productPriceListDisplayed() {
        elementDisplayed(this.productPriceList.get(0), "product price list");
    }

    public void productTaxPriceListDisplayed() {
        elementDisplayed(this.productTaxPriceList.get(0), "product tax price list");
    }

    public void featuredCompaniesSectionDisplayed() {
        elementDisplayed(this.featuredCompaniesSection, "featured companies section");
    }

    public void checkoutButtonDisplayed() {
        elementDisplayed(this.checkoutButton, "my account button");
    }

    public void clickOnProduct(String productName) {
        searchAndClick(this.productNameList, productName);
    }

    public void clickOnNavigationLink(String linkName) {
        searchAndClick(this.navigationLinkList, linkName);
    }

    public void clickOnNavigationDropdownLink(String linkName) {
        searchAndClick(this.navigationDropdownLinkList, linkName);
    }
    

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigationDisplayed() {
        this.logoDisplayed();
        this.searchInputDisplayed();
        this.searchSubmitButtonDisplayed();
        this.shoppingBasketButtonDisplayed();
        this.changeCurrencyButtonDisplayed();
        this.phoneContactButtonDisplayed();
        this.phoneNumberSpanDisplayed();
        this.myAccountButtonDisplayed();
        this.wishListButtonDisplayed();
        this.shoppingBasketButtonDisplayed();
        this.checkoutButtonDisplayed();
    }

    public void pageDisplayed() {
        this.featuredHeaderDisplayed();
        this.productListDisplayed();
        this.productDescListDisplayed();
        this.productAddToCartListDisplayed();
        this.productAddToWishListDisplayed();
        this.productPriceListDisplayed();
        this.productTaxPriceListDisplayed();
        this.featuredCompaniesSectionDisplayed();
        this.navigationDisplayed();
    }
}
