package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NavigationPage {

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=common/home']")
    private WebElement logo;

    @FindBy(id = "search")
    private WebElement searchInput;

    @FindBy(className = "input-group-btn")
    private WebElement searchSubmitButton;

    @FindBy(id = "cart")
    private WebElement shoppingBasketListButton;

    @FindBy(xpath = "//span[text()='Currency'']")
    private WebElement changeCurrencyButton;

    @FindBy(name = "EUR")
    private WebElement changeToEuroCurrencyButton;

    @FindBy(name = "GBP")
    private WebElement changeToPoundCurrencyButton;

    @FindBy(name = "USD")
    private WebElement changeToDollarCurrencyButton;

    @FindBy(className = "fa-phone")
    private WebElement phoneContactButton;

    @FindBy(xpath = "//span[text()='123456789']")
    private WebElement phoneNumberSpan;

    @FindBy(className = "fa-user")
    private WebElement myAccountButton;

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerDropDownButton;

    @FindBy(xpath = "//a[text()='Login']")
    private WebElement loginDropDownButton;

    @FindBy(className = "fa-heart")
    private WebElement wishListButton;

    @FindBy(className = "fa-shopping-cart")
    private WebElement shoppingBasketButton;

    @FindBy(className = "fa-share")
    private WebElement checkoutButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu pull-right']//p")
    private WebElement shoppingBasketEmptyInfo;


    public NavigationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void pageDisplayed(){
        Assert.assertTrue();
    }

}
