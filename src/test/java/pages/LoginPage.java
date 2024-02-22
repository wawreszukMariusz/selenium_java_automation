package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    @FindBy(id = "input-email")
    public WebElement emailInput;

    @FindBy(id = "input-password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[text()='Forgotten Password']")
    public WebElement forgottenPasswordLink;

    @FindBy(className = "alert-danger")
    public WebElement incorrectLoginDataAlert;

    @FindBy(className = "alert-success")
    public WebElement sentPasswordRememberingEmailAlert;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void pageDisplayed(){
        Assert.assertTrue(this.emailInput.isDisplayed());
        Assert.assertTrue(this.passwordInput.isDisplayed());
        Assert.assertTrue(this.submitButton.isDisplayed());
        Assert.assertTrue(this.forgottenPasswordLink.isDisplayed());
    }
}
