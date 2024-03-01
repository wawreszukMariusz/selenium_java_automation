package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.DriverFactory;
import utils.ExtentReport;
import utils.PropertiesLoader;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;


public class BaseTest {
        protected WebDriver driver;
        @BeforeSuite
        public void beforeSuite(){
            ExtentReport.initReports();
        }

        @BeforeMethod
        public void setUpTest()   {
            try {
                driver = DriverFactory.getDriver();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            driver.manage().window().maximize();
            driver.get(PropertiesLoader.loadProperty("base.url"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @AfterSuite
        public void afterSuite(){
            ExtentReport.flushReports();
        }

        @AfterMethod
        public void tearDown(){
           //driver.quit();
        }
    }

