package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[text()='Forgotten Password']")
    private WebElement forgottenPasswordLink;

    @FindBy(className = "alert-danger")
    private WebElement incorrectLoginDataAlert;

    @FindBy(className = "alert-success")
    private WebElement sentEmailAlert;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setEmailInput(String email) {
        elementSendKeys(this.emailInput, "email input", email);
    }

    public void setPasswordInput(String password) {
        elementSendKeys(this.passwordInput, "password input", password);
    }

    public void clickSubmitButton() {
        clickElement(this.submitButton, "submit button");
    }

    public void clickForgottenPasswordLink() {
        clickElement(this.forgottenPasswordLink, "forgotten password link");
    }

    public void sentEmailAlertDisplayed() {
        elementDisplayed(this.sentEmailAlert, "sent email alert");
    }

    public void incorrectLoginDataAlertDisplayed() {
        elementDisplayed(this.incorrectLoginDataAlert, "incorrect login data alert");
    }

    public void emailInputDisplayed() {
        elementDisplayed(this.emailInput, "email input");
    }

    public void passwordInputDisplayed() {
        elementDisplayed(this.passwordInput, "password input");
    }

    public void submitButtonDisplayed() {
        elementDisplayed(this.submitButton, "submit button");
    }

    public void forgottenPasswordLinkDisplayed() {
        elementDisplayed(this.emailInput, "forgotten password link");
    }

    public void pageDisplayed() {
        this.emailInputDisplayed();
        this.passwordInputDisplayed();
        this.submitButtonDisplayed();
        this.forgottenPasswordLinkDisplayed();
    }
}
