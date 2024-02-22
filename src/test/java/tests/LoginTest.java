package tests;

import org.apache.poi.ss.formula.functions.Na;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import utils.DriverFactory;

import java.time.Duration;

public class LoginTest extends BaseTest{

    @BeforeMethod
    public void beforeTest(){
        HomePage homePage = new HomePage(driver);
        homePage.pageDisplayed();
        homePage.myAccountButton.click();
        homePage.loginDropDownButton.click();
    }

    @Test
    public void properLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailInput.sendKeys("pifyusomla@gufum.com");
        loginPage.passwordInput.sendKeys("Pass123@");
        loginPage.submitButton.click();

        AccountPage accountPage = new AccountPage(driver);
        accountPage.pageDisplayed();
    }

    @Test
    public void incorrectLoginDataTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailInput.sendKeys("test@test.com");
        loginPage.passwordInput.sendKeys("test");
        loginPage.submitButton.click();
        loginPage.incorrectLoginDataAlert.isDisplayed();
    }

    @Test
    public void incorrectEmailTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailInput.sendKeys("test");
        loginPage.passwordInput.sendKeys("test");
        loginPage.submitButton.click();
        loginPage.incorrectLoginDataAlert.isDisplayed();
    }

    @Test
    public void sendingEmptyFormTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailInput.sendKeys("");
        loginPage.passwordInput.sendKeys("");
        loginPage.submitButton.click();
        Assert.assertTrue(loginPage.incorrectLoginDataAlert.isDisplayed());
    }

    @Test
    public void properRememberingForgottenPasswordTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.forgottenPasswordLink.click();

        ForgottenPasswordPage forgottenPasswordPage = new ForgottenPasswordPage(driver);
        forgottenPasswordPage.emailInput.sendKeys("pifyusomla@gufum.com");
        forgottenPasswordPage.continueButton.click();

        loginPage.pageDisplayed();
        Assert.assertTrue(loginPage.sentPasswordRememberingEmailAlert.isDisplayed());
    }

    @Test
    public void wrongRememberingForgottenPasswordTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.forgottenPasswordLink.click();

        ForgottenPasswordPage forgottenPasswordPage = new ForgottenPasswordPage(driver);
        forgottenPasswordPage.emailInput.sendKeys("test@test.pl");
        forgottenPasswordPage.continueButton.click();
        Assert.assertTrue(forgottenPasswordPage.incorrectEmailAlert.isDisplayed());
    }

}