package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage {

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=common/home']")
    private WebElement homePageLink;

    public NavigationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
