package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestReport {

    @Test
    public void testReport() throws IOException {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("src/test/reports/report.html");

        final File CONF = new File("src/test/resources/spark-config.json");
        spark.loadJSONConfig(CONF);


//        spark.config().setTheme(Theme.DARK);
//        spark.config().setDocumentTitle("MyReport");
//        spark.config().setReportName("MyReportTestName");
        extent.attachReporter(spark);

        ExtentTest test = extent.createTest("Login tests");
        test.pass("Login test pass");
        test.fail("Login test failed");


        ExtentTest test1 = extent.createTest("Login tests");
        test1.pass("Logi2n test pass");
        test1.fail("Log2in test failed");

        extent.flush();
    }

}
