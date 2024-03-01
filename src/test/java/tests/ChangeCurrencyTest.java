package tests;

import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.RegisterPage;
import utils.ExtentReport;

public class ChangeCurrencyTest extends BaseTest{

    HomePage homePage;
    @BeforeMethod
    public void beforeTest(ITestResult result){
        ExtentReport.createTest(result.getMethod().getMethodName());

        homePage = new HomePage(driver);
        homePage.pageDisplayed();
    }

    @Test
    public void changeCurrencyToEuroTest() throws InterruptedException {
        homePage.clickChangeCurrencyButton();
        homePage.clickChangeToEuroCurrencyButton();
        homePage.checkProductPriceCurrency("€");
    }

    @Test
    public void changeCurrencyToPoundTest() throws InterruptedException {
        homePage.clickChangeCurrencyButton();
        homePage.clickChangeToPoundCurrencyButton();
        homePage.checkProductPriceCurrency("£");
    }

    @Test
    public void changeCurrencyToEuroOnProductPageTest() throws InterruptedException {
        homePage.clickOnProduct("MacBook");
        homePage.clickChangeCurrencyButton();
        homePage.clickChangeToEuroCurrencyButton();

        ProductPage productPage = new ProductPage(driver);
        productPage.checkProductPriceCurrency("€");
    }

    @Test
    public void changeCurrencyToPoundOnProductPageTest() throws InterruptedException {
        homePage.clickOnProduct("MacBook");
        homePage.clickChangeCurrencyButton();
        homePage.clickChangeToPoundCurrencyButton();

        ProductPage productPage = new ProductPage(driver);
        productPage.checkProductPriceCurrency("£");
    }


    @Test
    public void changeCurrencyToPoundOnSubpage() throws InterruptedException {
        homePage.clickOnNavigationLink("Desktops");
        homePage.clickOnNavigationDropdownLink("Mac");
        homePage.clickChangeCurrencyButton();
        homePage.clickChangeToPoundCurrencyButton();
        homePage.checkProductPriceCurrency("£");
    }

    @Test
    public void changeCurrencyToEuroOnSubpage() throws InterruptedException {
        homePage.clickOnNavigationLink("Desktops");
        homePage.clickOnNavigationDropdownLink("Mac");
        homePage.clickChangeCurrencyButton();
        homePage.clickChangeToEuroCurrencyButton();
        homePage.checkProductPriceCurrency("€");
    }

}
