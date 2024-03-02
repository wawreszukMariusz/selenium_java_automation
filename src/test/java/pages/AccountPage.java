package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccountPage {

    @FindBy(xpath = "//div[@id='content']/h2[text()='My Account']")
    private WebElement myAccountHeader;

    public AccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void pageDisplayed(){
        Assert.assertTrue(myAccountHeader.isDisplayed());
    }


}
