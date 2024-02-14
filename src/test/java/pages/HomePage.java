package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    @FindBy(id = "slideshow0")
    private WebElement slideShow;

    @FindBy(className = "swiper-button-next")
    private WebElement slideShowNextButton;

    @FindBy(className = "swiper-button-prev")
    private WebElement slideShowPrevButton;

    @FindBy(xpath = "//h3[text()='Featured']")
    private WebElement featuredHeader;

    @FindBy(className = "product-layout")
    private List<WebElement> productList;

    @FindBy(className = "caption")
    private List<WebElement> productDesc;

    @FindBy(className = "fa fa-shopping-cart")
    private List<WebElement> productAddToCart;

    @FindBy(className = "fa fa-heart")
    private List<WebElement> productAddToWishList;

    @FindBy(className = "fa fa-exchange")
    private List<WebElement> productCompareProducts;

    @FindBy(className = "price")
    private List<WebElement> productPrice;

    @FindBy(className = "price-tax")
    private List<WebElement> productTaxPrice;

    @FindBy(className = "carousel0")
    private WebElement featuredCompaniesSection;

    @FindBy(xpath = "//div[@id='carousel0']/div/div")
    private List<WebElement> singleFeaturedCompany;


    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
