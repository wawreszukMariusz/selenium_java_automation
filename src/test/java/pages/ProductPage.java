package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//ul[@class='list-unstyled']/li/h2")
    private WebElement productPrice;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkProductPriceCurrency(String expectedCurrency) {
        compareElements(this.productPrice, "product price currency", expectedCurrency);
    }
}
