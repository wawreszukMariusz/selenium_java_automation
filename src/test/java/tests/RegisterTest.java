package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import utils.PropertiesLoader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegisterTest extends BaseTest{

    String email;
    @BeforeMethod
    public void beforeTest(){
        HomePage homePage = new HomePage(driver);
        homePage.pageDisplayed();
        homePage.myAccountButton.click();
        homePage.registerDropDownButton.click();

        email = "tester" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyHHmmss")) + "@tester.com";
    }

    @Test
    public void registerTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.pageDisplayed();
        registerPage.fillRegisterForm(email);
        registerPage.successRegistrationPageDisplayed();
    }

    @Test
    public void sendEmptyRegisterFormTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.pageDisplayed();
        registerPage.submitButton.click();
        registerPage.checkEmptyRegisterFormAlerts();
    }

    @Test
    public void fillRegisterFormWithExistingEmail(){
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.pageDisplayed();
        registerPage.fillRegisterForm(PropertiesLoader.loadProperty("email"));
        registerPage.submitButton.click();

        Assert.assertTrue(registerPage.existingEmailAlert.isDisplayed());
    }

}
