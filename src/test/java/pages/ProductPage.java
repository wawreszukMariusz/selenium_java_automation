package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ExtentReport;

public class ProductPage{

    @FindBy(xpath = "//ul[@class='list-unstyled']/li/h2")
    public WebElement productPrice;

    public void checkProductPriceCurrency(String expectedCurrency){
        try {
            Assert.assertTrue(this.productPrice.getText().contains(expectedCurrency));
            ExtentReport.pass("Checking product price currency change to " + expectedCurrency + "  done");
        } catch (AssertionError e) {
            ExtentReport.fail("Checking product price currency change to " + expectedCurrency + "  failed");
        }
    }

    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


}
