package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ExtentReport;

public class RegisterPage extends BasePage{

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement phoneInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//input[@value='0' and @type='radio']")
    private WebElement newsletterNoRadio;

    @FindBy(xpath = "//input[@value='1' and @type='radio']")
    private WebElement newsletterYesRadio;

    @FindBy(name = "agree")
    private WebElement privacyPolicyCheckBox;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[text()='Success']")
    private WebElement successBreadcrumb;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']")
    private WebElement accountHeader;

    @FindBy(xpath = "//div[text()=' Warning: You must agree to the Privacy Policy!']")
    private WebElement emptyPrivacyPolicyAlert;

    @FindBy(xpath = "//div[text()=' Warning: E-Mail Address is already registered!']")
    private WebElement existingEmailAlert;

    @FindBy(xpath = "//input[@id='input-firstname']/../div[@class='text-danger']")
    private WebElement firstNameInputAlert;

    @FindBy(xpath = "//input[@id='input-lastname']/../div[@class='text-danger']")
    private WebElement lastNameInputAlert;

    @FindBy(xpath = "//input[@id='input-email']/../div[@class='text-danger']")
    private WebElement emailInputAlert;

    @FindBy(xpath = "//input[@id='input-telephone']/../div[@class='text-danger']")
    private WebElement phoneInputAlert;

    @FindBy(xpath = "//input[@id='input-password']/../div[@class='text-danger']")
    private WebElement passwordInputAlert;

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setFirstNameInput(String firstName){
        elementSendKeys(this.firstNameInput, "first name input", firstName);
    }

    public void setLastNameInput(String lastName){
        elementSendKeys(this.lastNameInput, "last name input", lastName);
    }

    public void setEmailInput(String email){
        elementSendKeys(this.emailInput, "email input", email);
    }

    public void setPhoneInput(String phone){
        elementSendKeys(this.phoneInput, "phone input", phone);
    }

    public void setPasswordInput(String password){
        elementSendKeys(this.passwordInput, "password input", password);
    }

    public void setConfirmPasswordInput(String password){
        elementSendKeys(this.confirmPasswordInput, "confirm password input", password);
    }

    public void clickPrivacyPolicyCheckbox(){
        clickElement(this.privacyPolicyCheckBox, "privacy policy checkbox");
    }

    public void clickSubmitButton(){
        clickElement(this.submitButton, "submit button");
    }

    public void firstNameInputDisplayed(){
        elementDisplayed(this.firstNameInput, "first name input");
    }

    public void lastNameInputDisplayed(){
        elementDisplayed(this.lastNameInput, "last name input");
    }

    public void emailInputDisplayed(){
        elementDisplayed(this.emailInput, "email input");
    }

    public void phoneInputDisplayed(){
        elementDisplayed(this.phoneInput, "phone input");
    }

    public void passwordInputDisplayed(){
        elementDisplayed(this.passwordInput, "password input");
    }

    public void confirmPasswordInputDisplayed(){
        elementDisplayed(this.confirmPasswordInput, "confirm password input");
    }

    public void newsletterNoRadioDisplayed(){
        elementDisplayed(this.newsletterNoRadio, "newsletter no radio");
    }

    public void privacyPolicyCheckBoxDisplayed(){
        elementDisplayed(this.privacyPolicyCheckBox, "privacy policy checkbox");
    }

    public void submitButtonDisplayed(){
        elementDisplayed(this.submitButton, "submit button");
    }

    public void successBreadcrumbDisplayed(){
        elementDisplayed(this.successBreadcrumb, "success breadcrumb");
    }

    public void continueButtonDisplayed(){
        elementDisplayed(this.continueButton, "continue button");
    }

    public void accountHeaderDisplayed(){
        elementDisplayed(this.accountHeader, "account header");
    }

    public void emptyPrivacyPolicyAlertDisplayed(){
        elementDisplayed(this.emptyPrivacyPolicyAlert, "empty privacy policy alert");
    }

    public void firstNameInputAlertDisplayed(){
        elementDisplayed(this.firstNameInputAlert, "first name input alert");
    }

    public void lastNameInputAlertDisplayed(){
        elementDisplayed(this.lastNameInputAlert, "last name input alert");
    }

    public void emailInputAlertDisplayed(){
        elementDisplayed(this.emailInputAlert, "email input alert");
    }

    public void phoneInputAlertDisplayed(){
        elementDisplayed(this.phoneInputAlert, "phone input alert");
    }

    public void passwordInputAlertDisplayed(){
        elementDisplayed(this.passwordInputAlert, "password input alert");
    }

    public void existingEmailAlertDisplayed(){
        elementDisplayed(this.existingEmailAlert, "existing email alert");
    }

    public void pageDisplayed() {
        this.firstNameInputDisplayed();
        this.lastNameInputDisplayed();
        this.emailInputDisplayed();
        this.phoneInputDisplayed();
        this.passwordInputDisplayed();
        this.newsletterNoRadioDisplayed();
        this.privacyPolicyCheckBoxDisplayed();
        this.submitButtonDisplayed();
    }

    public void successRegistrationPageDisplayed(){
            this.successBreadcrumbDisplayed();
            this.continueButtonDisplayed();
            this.accountHeaderDisplayed();
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
        this.emptyPrivacyPolicyAlertDisplayed();
        this.firstNameInputAlertDisplayed();
        this.lastNameInputAlertDisplayed();
        this.emailInputAlertDisplayed();
        this.phoneInputAlertDisplayed();
        this.passwordInputAlertDisplayed();
    }
}
