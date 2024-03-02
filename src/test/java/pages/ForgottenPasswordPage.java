package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ExtentReport;

public class ForgottenPasswordPage {
    @FindBy(id = "input-email")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement continueButton;

    @FindBy(className = "alert")
    public WebElement incorrectEmailAlert;

    public ForgottenPasswordPage(WebDriver driver){
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

    public void clickContinueButton(){
        try {
            this.continueButton.click();
            Assert.assertTrue(this.continueButton.isDisplayed());
            ExtentReport.pass("Clicking on continue button done");
        } catch (Exception e) {
            ExtentReport.fail("Clicking on continue button failed");
        }
    }

    public void incorrectEmailAlertDisplayed(){
        try {
            Assert.assertTrue(this.incorrectEmailAlert.isDisplayed());
            ExtentReport.pass("Checking display of incorrect email alert done");
        } catch (Exception e) {
            ExtentReport.fail("Checking display of incorrect email alert failed");
        }
    }
}
