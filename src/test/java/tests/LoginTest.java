package tests;

import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utils.ExtentReport;
import utils.PropertiesLoader;

public class LoginTest extends BaseTest{

    @BeforeMethod
    public void beforeTest(ITestResult result){
        ExtentReport.createTest(result.getMethod().getMethodName());

        HomePage homePage = new HomePage(driver);
        homePage.pageDisplayed();
        homePage.clickMyAccountButton();
        homePage.clickLoginDropDownButton();
    }

    @Test
    public void properLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailInput(PropertiesLoader.loadProperty("email"));
        loginPage.setPasswordInput("Pass123@");
        loginPage.clickSubmitButton();

        AccountPage accountPage = new AccountPage(driver);
        accountPage.pageDisplayed();
    }

    @Test
    public void incorrectLoginDataTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailInput("test@test.com");
        loginPage.setPasswordInput("test");
        loginPage.clickSubmitButton();
        loginPage.incorrectLoginDataAlertDisplayed();
    }

    @Test
    public void incorrectEmailTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailInput("test");
        loginPage.setPasswordInput("test");
        loginPage.clickSubmitButton();
        loginPage.incorrectLoginDataAlertDisplayed();
    }

    @Test
    public void sendingEmptyFormTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSubmitButton();
        loginPage.incorrectLoginDataAlertDisplayed();
    }

    @Test
    public void properRememberingForgottenPasswordTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickForgottenPasswordLink();

        ForgottenPasswordPage forgottenPasswordPage = new ForgottenPasswordPage(driver);
        forgottenPasswordPage.setEmailInput("pifyusomla@gufum.com");
        forgottenPasswordPage.clickContinueButton();

        loginPage.pageDisplayed();
        loginPage.sentEmailAlertDisplayed();
    }

    @Test
    public void wrongRememberingForgottenPasswordTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickForgottenPasswordLink();
        ForgottenPasswordPage forgottenPasswordPage = new ForgottenPasswordPage(driver);
        forgottenPasswordPage.setEmailInput("test@test.pl");
        forgottenPasswordPage.clickContinueButton();
        forgottenPasswordPage.incorrectEmailAlertDisplayed();
    }

}
