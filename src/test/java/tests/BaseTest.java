package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.DriverFactory;
import utils.ExtentReport;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.LocalDate;

public class BaseTest {
        protected WebDriver driver;
        @BeforeMethod
        public void setUpTest() throws IOException {
            driver = DriverFactory.getDriver();
            driver.manage().window().maximize();
            driver.get("https://opencart.abstracta.us/index.php?route=common/home");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @AfterMethod
        public void tearDown(ITestResult result){
           // driver.quit();
        }
    }

