package utils;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.*;
import org.testng.annotations.BeforeTest;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Listeners implements ITestListener, ISuiteListener {

    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        ExtentReport.test.pass(result.getMethod().getMethodName() + " is passed");
    }

    public void onTestFailure(ITestResult result) {
        ExtentReport.test.fail(result.getMethod().getMethodName() + " is failed");
        //attach screenshot
    }

    public void onTestSkipped(ITestResult result) {
        ExtentReport.test.skip(result.getMethod().getMethodName() + " is skipped");
    }

    public void onStart(ISuite suite) {
        ExtentReport.initReports();
    }

    public void onFinish(ITestContext context) {
        ExtentReport.flushReports();
    }

}
