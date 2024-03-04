package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ExtentReport;

public class ForgottenPasswordPage extends BasePage {
    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement continueButton;

    @FindBy(className = "alert")
    private WebElement incorrectEmailAlert;

    public ForgottenPasswordPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setEmailInput(String email){
        elementSendKeys(this.emailInput, "email input", email);
    }

    public void clickContinueButton(){
        clickElement(this.continueButton, "continue button");
    }

    public void incorrectEmailAlertDisplayed(){
        elementDisplayed(this.incorrectEmailAlert, "incorrect email alert");
    }
}
