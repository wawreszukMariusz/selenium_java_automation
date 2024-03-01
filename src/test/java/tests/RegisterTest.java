package tests;

import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import utils.ExtentReport;
import utils.PropertiesLoader;

public class RegisterTest extends BaseTest{

    String email;
    @BeforeMethod
    public void beforeTest(ITestResult result){
        ExtentReport.createTest(result.getMethod().getMethodName());
        
        HomePage homePage = new HomePage(driver);
        homePage.pageDisplayed();
        homePage.clickMyAccountButton();
        homePage.clickRegisterDropDownButton();

        email = "tester" + homePage.dateNow() + "@tester.com";
    }

    @Test
    public void properRegisterTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.pageDisplayed();
        registerPage.fillRegisterForm(email);
        registerPage.successRegistrationPageDisplayed();
    }

    @Test
    public void sendEmptyRegisterFormTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.pageDisplayed();
        registerPage.clickSubmitButton();
        registerPage.checkEmptyRegisterFormAlerts();
    }

    @Test
    public void fillRegisterFormWithExistingEmail(){
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.pageDisplayed();
        registerPage.fillRegisterForm(PropertiesLoader.loadProperty("email"));
        registerPage.clickSubmitButton();
        registerPage.existingEmailAlertDisplayed();
    }
}
