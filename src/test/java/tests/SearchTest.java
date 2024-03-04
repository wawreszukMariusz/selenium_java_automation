package tests;

import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;
import utils.ExtentReport;
import utils.PropertiesLoader;

public class SearchTest extends BaseTest{

    HomePage homePage = new HomePage(driver);

    @BeforeMethod
    public void beforeTest(ITestResult result){
        ExtentReport.createTest(result.getMethod().getMethodName());

        homePage = new HomePage(driver);
        homePage.pageDisplayed();
        homePage.clickSearchInput();
    }
    @Test
    public void noResultsFoundSearchTest(){
        homePage.setSearchInput("test");
        homePage.clickSearchSubmitButton();

        SearchPage searchPage = new SearchPage(driver);
        searchPage.resultsNotFoundPageDisplayed("test");
    }

    @Test
    public void resultsFoundSearchTest(){
        homePage.setSearchInput("Mac");
        homePage.clickSearchSubmitButton();

        SearchPage searchPage = new SearchPage(driver);
        searchPage.resultsFoundPageDisplayed("Mac");
    }

    @Test
    public void resultsFoundOnSearchAgainOnSearchPageTest(){
        homePage.setSearchInput("Mac");
        homePage.clickSearchSubmitButton();

        SearchPage searchPage = new SearchPage(driver);
        searchPage.resultsFoundPageDisplayed("Mac");
        searchPage.clearResultsSearchInput();
        searchPage.setResultsSearchInput("Apple");
        searchPage.clickSearchButton();
        searchPage.resultsFoundPageDisplayed("Apple");
    }

    @Test
    public void noResultsFromSearchAgainOnSearchPageTest(){
        homePage.setSearchInput("Mac");
        homePage.clickSearchSubmitButton();

        SearchPage searchPage = new SearchPage(driver);
        searchPage.resultsFoundPageDisplayed("Mac");
        searchPage.clearResultsSearchInput();
        searchPage.setResultsSearchInput("test");
        searchPage.clickSearchButton();
        searchPage.resultsNotFoundPageDisplayed("test");
    }

}
