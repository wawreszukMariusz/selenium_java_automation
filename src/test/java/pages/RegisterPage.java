package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class RegisterPage {

    @FindBy(id = "input-firstname")
    public WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    public WebElement lastNameInput;

    @FindBy(id = "input-email")
    public WebElement emailInput;

    @FindBy(id = "input-telephone")
    public WebElement phoneInput;

    @FindBy(id = "input-password")
    public WebElement passwordInput;

    @FindBy(id = "input-confirm")
    public WebElement confirmPasswordInput;

    @FindBy(xpath = "//input[@value='0' and @type='radio']")
    public WebElement newsletterNoRadio;

    @FindBy(xpath = "//input[@value='1' and @type='radio']")
    public WebElement newsletterYesRadio;

    @FindBy(name = "agree")
    public WebElement privacyPolicyCheckBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[text()='Success']")
    public WebElement successBreadcrumb;

    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']")
    public WebElement accountHeader;

    @FindBy(xpath = "//div[text()=' Warning: You must agree to the Privacy Policy!']")
    public WebElement emptyPrivacyPolicyAlert;

    @FindBy(xpath = "//div[text()=' Warning: E-Mail Address is already registered!']")
    public WebElement existingEmailAlert;

    @FindBy(xpath = "//input[@id='input-firstname']/../div[@class='text-danger']")
    public WebElement firstNameInputAlert;

    @FindBy(xpath = "//input[@id='input-lastname']/../div[@class='text-danger']")
    public WebElement lastNameInputAlert;

    @FindBy(xpath = "//input[@id='input-email']/../div[@class='text-danger']")
    public WebElement emailInputAlert;

    @FindBy(xpath = "//input[@id='input-telephone']/../div[@class='text-danger']")
    public WebElement phoneInputAlert;

    @FindBy(xpath = "//input[@id='input-password']/../div[@class='text-danger']")
    public WebElement passwordInputAlert;

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void pageDisplayed(){
        Assert.assertTrue(this.firstNameInput.isDisplayed());
        Assert.assertTrue(this.lastNameInput.isDisplayed());
        Assert.assertTrue(this.emailInput.isDisplayed());
        Assert.assertTrue(this.phoneInput.isDisplayed());
        Assert.assertTrue(this.passwordInput.isDisplayed());
        Assert.assertTrue(this.confirmPasswordInput.isDisplayed());
        Assert.assertTrue(this.newsletterNoRadio.isDisplayed());
        //Assert.assertTrue(this.newsletterYesRadio.isDisplayed());
        Assert.assertTrue(this.privacyPolicyCheckBox.isDisplayed());
        Assert.assertTrue(this.submitButton.isDisplayed());
    }

    public void successRegistrationPageDisplayed(){
        Assert.assertTrue(this.successBreadcrumb.isDisplayed());
        Assert.assertTrue(this.continueButton.isDisplayed());
        Assert.assertTrue(this.accountHeader.isDisplayed());
    }

    public void fillRegisterForm(String email){
        this.firstNameInput.sendKeys("Mariusz");
        this.lastNameInput.sendKeys("Testowy");
        this.emailInput.sendKeys(email);
        this.phoneInput.sendKeys("+48123123123");
        this.passwordInput.sendKeys("Pass123@");
        this.confirmPasswordInput.sendKeys("Pass123@");
        //this.newsletterYesRadio.click();
        this.privacyPolicyCheckBox.click();
        this.submitButton.click();
    }

    public void checkEmptyRegisterFormAlerts(){
        Assert.assertTrue(this.emptyPrivacyPolicyAlert.isDisplayed());
        Assert.assertTrue(this.firstNameInputAlert.isDisplayed());
        Assert.assertTrue(this.lastNameInputAlert.isDisplayed());
        Assert.assertTrue(this.emailInputAlert.isDisplayed());
        Assert.assertTrue(this.phoneInputAlert.isDisplayed());
        Assert.assertTrue(this.passwordInputAlert.isDisplayed());
    }
}
