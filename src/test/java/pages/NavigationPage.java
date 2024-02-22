package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NavigationPage {

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=common/home']")
    public WebElement logo;

    @FindBy(id = "search")
    public WebElement searchInput;

    @FindBy(className = "input-group-btn")
    public WebElement searchSubmitButton;

    @FindBy(id = "cart")
    public WebElement shoppingBasketListButton;

    @FindBy(xpath = "//span[text()='Currency']")
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


    public NavigationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void pageDisplayed(){
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
    }

}
