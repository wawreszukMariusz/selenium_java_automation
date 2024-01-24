package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class DriverFactory {
    public static WebDriver getDriver() throws IOException {
        String name = PropertiesLoader.loadProperty("browser.name");

        if(name.equals("firefox")) {
            return new FirefoxDriver();
        }
        else if (name.equals("edge")) {
            return new EdgeDriver();
        }
        else  {
            return new ChromeDriver();
        }
    }

}