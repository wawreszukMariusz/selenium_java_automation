package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ExtentReport;

public class LoginPage {

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

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setEmailInput(String email){
        try {
            this.emailInput.sendKeys(email);
            ExtentReport.pass("Send keys to email input passed");
        } catch (Exception e) {
            ExtentReport.fail("Send keys to email input failed");
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

    public void clickSubmitButton(){
        try {
            this.submitButton.click();
            ExtentReport.pass("Clicking on submit button done");
        } catch (Exception e) {
            ExtentReport.fail("Clicking on submit button failed");
        }
    }

    public void sentEmailAlertDisplayed(){
        try {
            Assert.assertTrue(this.sentEmailAlert.isDisplayed());
            ExtentReport.pass("Checking display of sent email alert done");
        } catch (Exception e) {
            ExtentReport.fail("Checking display of sent email alert failed");
        }
    }

    public void incorrectLoginDataAlertDisplayed(){
        try {
            Assert.assertTrue(this.incorrectLoginDataAlert.isDisplayed());
            ExtentReport.pass("Checking display of incorrect login data alert done");
        } catch (Exception e) {
            ExtentReport.fail("Checking display of incorrect login data alert failed");
        }
    }
    public void clickForgottenPasswordLink(){
        try {
            this.forgottenPasswordLink.click();
            ExtentReport.pass("Clicking on forgotten password link done");
        } catch (Exception e) {
            ExtentReport.fail("Clicking on forgotten password link failed");
        }
    }
    public void pageDisplayed(){
        try {
            Assert.assertTrue(this.emailInput.isDisplayed());
            Assert.assertTrue(this.passwordInput.isDisplayed());
            Assert.assertTrue(this.submitButton.isDisplayed());
            Assert.assertTrue(this.forgottenPasswordLink.isDisplayed());
            ExtentReport.pass("Checking visibility of page elements passed");
        } catch (Exception e) {
            ExtentReport.fail("Checking visibility of page elements failed");
        }
    }
}
