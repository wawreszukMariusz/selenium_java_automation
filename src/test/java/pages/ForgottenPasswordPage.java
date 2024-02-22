package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


}
