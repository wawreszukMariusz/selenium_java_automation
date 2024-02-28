package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ExtentReport {

    private ExtentReport(){}
    private static ExtentReports extent;

    public static ExtentTest test;

    public static void initReports(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("src/test/reports/report.html");

        final File CONF = new File("src/test/resources/spark-config.json");
        try {
            spark.loadJSONConfig(CONF);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        extent.attachReporter(spark);
    }

    public static void flushReports(){
        extent.flush();
    }

    public static void createTest(String testCaseName){
        test = extent.createTest(testCaseName);
    }


}
