package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BasePage {

    @FindBy(xpath = "//div[@id='content']/h2[text()='My Account']")
    private WebElement myAccountHeader;

    public AccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void myAccountHeaderDisplayed() {
        elementDisplayed(myAccountHeader, "my account header");
    }

    public void pageDisplayed() {
        this.myAccountHeaderDisplayed();
    }


}
