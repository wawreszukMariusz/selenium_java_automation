package pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.ExtentReport;
import utils.PropertiesLoader;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BasePage {

    public String randomEmail(){
        return "tester" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyHHmmss")) + "@tester.com";
    }

    public void clickElement(WebElement element, String elementName){
        try {
            element.click();
            ExtentReport.pass("Click on " + elementName + " passed");
        } catch (Exception | AssertionError e) {
            ExtentReport.fail("Click on " + elementName + " failed");
            throw e;
        }
    }

    public void searchAndClick(List<WebElement> elementList, String elementSearch){
        try {
            for(int i=0; i<elementList.size(); i++){
                if(elementSearch.equals(elementList.get(i).getText())){
                    elementList.get(i).click();
                    ExtentReport.pass("Clicking on product " + elementSearch + " passed");
                }
            }
        } catch (Exception e) {
            ExtentReport.fail("Clicking on product " + elementSearch + " failed");
        }
    }

    public void elementSendKeys(WebElement element, String elementName, String sendPhrase){
        try {
            element.sendKeys(sendPhrase);
            ExtentReport.pass("Sending keys to " + elementName + " passed");
        } catch (Exception | AssertionError e) {
            ExtentReport.fail("Sending keys to " + elementName + " failed");
            throw e;
        }
    }

    public void elementDisplayed(WebElement element, String elementName){
        try {
            Assert.assertTrue(element.isDisplayed());
            ExtentReport.pass("Checking display of " + elementName + " passed");
        } catch (AssertionError e) {
            ExtentReport.fail("Checking display of " + elementName + " failed");
            throw e;
        }
    }

    public void elementDisplayed(List<WebElement> listElement, int numberOfElements, String listElementName ) {
        try {
            Assert.assertEquals(listElement.size(), numberOfElements);
            ExtentReport.pass("Checking display of " + listElementName + " passed");
        } catch (AssertionError e) {
            ExtentReport.fail("Checking display of " + listElementName + " failed: " + e.getMessage());
            throw e;
        }
    }

    public void compareElements(WebElement element, String elementName,  String expectedString){
        try {
            Assert.assertTrue(element.getText().contains(expectedString));
            ExtentReport.pass("Checking " + elementName + " is equal to " + expectedString + "  passed");
        } catch (AssertionError e) {
            ExtentReport.fail("Checking " + elementName + " is equal to " + expectedString + "  failed");
        }
    }

    public void elementListNotEmpty(List<WebElement> elementList, String elementName){
        try {
            Assert.assertFalse(elementList.isEmpty());
            ExtentReport.pass("Checking " + elementName + " is not empty passed");
        } catch (AssertionError e) {
            ExtentReport.fail("Checking " + elementName + " is not empty failed");
        }
    }

    public void elementListIsEmpty(List<WebElement> elementList, String elementName){
        try {
            Assert.assertFalse(elementList.isEmpty());
            ExtentReport.pass("Checking " + elementName + " is empty done");
        } catch (AssertionError e) {
            ExtentReport.fail("Checking " + elementName + " is empty failed");
        }
    }

    public void clearElement(WebElement element, String elementName){
        try {
            element.clear();
            ExtentReport.pass("Clearing " + elementName + " passed");
        } catch (Exception e) {
            ExtentReport.fail("Clearing " + elementName + " failed");
        }
    }

    public void elementListNotDisplayed(List<WebElement> elementList, String elementListName){
        try {
            ExtentReport.pass("Checking not displaying of " + elementListName + " passed");
        } catch (Exception e) {
            ExtentReport.fail("Checking not displaying of " + elementListName + " failed");
        }
    }

}
