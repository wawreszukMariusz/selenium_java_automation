package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ExtentReport;

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

    public void setFirstNameInput(String firstName){
        try {
            this.firstNameInput.sendKeys(firstName);
            ExtentReport.pass("Send keys to firstname input passed");
        } catch (AssertionError e) {
            ExtentReport.fail("Send keys to firstname input failed");
        }
    }

    public void setLastNameInput(String lastName){
        try {
            this.lastNameInput.sendKeys(lastName);
            ExtentReport.pass("Send keys to lastname input passed");
        } catch (AssertionError e) {
            ExtentReport.fail("Send keys to lastname input failed");
        }
    }

    public void setEmailInput(String email){
        try {
            this.emailInput.sendKeys(email);
            ExtentReport.pass("Send keys to email input passed");
        } catch (AssertionError e) {
            ExtentReport.fail("Send keys to email input failed");
        }
    }

    public void setPhoneInput(String phone){
        try {
            this.phoneInput.sendKeys(phone);
            ExtentReport.pass("Send keys to phone input passed");
        } catch (AssertionError e) {
            ExtentReport.fail("Send keys to phone input failed");
        }
    }

    public void setPasswordInput(String password){
        try {
            this.passwordInput.sendKeys(password);
            ExtentReport.pass("Send keys to password input passed");
        } catch (Exception e) {
            ExtentReport.fail("Send keys to password input failed");
        }
    }

    public void setConfirmPasswordInput(String password){
        try {
            this.confirmPasswordInput.sendKeys(password);
            ExtentReport.pass("Send keys to confirm password input passed");
        } catch (Exception e) {
            ExtentReport.fail("Send keys to confirm password input failed");
        }
    }

    public void clickPrivacyPolicyCheckbox(){
        try {
            this.privacyPolicyCheckBox.click();
            ExtentReport.pass("Clicking on privacy policy checkbox done");
        } catch (Exception e) {
            ExtentReport.fail("Clicking on privacy policy checkbox failed");
        }
    }

    public void clickSubmitButton(){
        try {
            this.submitButton.click();
            ExtentReport.pass("Clicking on submit button done");
        } catch (Exception e) {
            ExtentReport.fail("Clicking on submit button failed");
        }
    }

    public void existingEmailAlertDisplayed(){
        try {
            Assert.assertTrue(this.existingEmailAlert.isDisplayed());
            ExtentReport.pass("Checking display of existing email alert done");
        } catch (Exception e) {
            ExtentReport.fail("Checking display of existing email alert failed");
        }
    }

    public void pageDisplayed(){
        try {
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
            ExtentReport.pass("Checking visibility of page elements passed");
        } catch (Exception e) {
            ExtentReport.pass("Checking visibility of page elements failed");
        }
    }

    public void successRegistrationPageDisplayed(){
        try {
            Assert.assertTrue(this.successBreadcrumb.isDisplayed());
            Assert.assertTrue(this.continueButton.isDisplayed());
            Assert.assertTrue(this.accountHeader.isDisplayed());
            ExtentReport.pass("Checking visibility of success registration page elements passed");
        } catch (Exception e) {
            ExtentReport.pass("Checking visibility of success registration page elements failed");
        }
    }

    public void fillRegisterForm(String email){
        this.setFirstNameInput("Mariusz");
        this.setLastNameInput("Testowy");
        this.setEmailInput(email);
        this.setPhoneInput("+48123123123");
        this.setPasswordInput("Pass123@");
        this.setConfirmPasswordInput("Pass123@");
        this.clickPrivacyPolicyCheckbox();
        this.clickSubmitButton();
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
