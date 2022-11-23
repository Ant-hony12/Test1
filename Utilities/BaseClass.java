package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	
    public static WebDriver getDriver() {
        if(driver==null) {

            switch(PropertiesFiles.getProperty("browser")) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case"chrome-headless":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case"firefox-headless":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
            case "edge":
                if(!System.getProperty("os.name").toLowerCase().contains("windows")) {
                    throw new WebDriverException("Your os does not support edge"); 
                }
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "safari":
                if(!System.getProperty("os.name").toLowerCase().contains("mac")) {
                    throw new WebDriverException("Your os does not support safari"); 
                }
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
            }

            driver.get(PropertiesFiles.getProperty("urlHRM"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            PageInitializer.initialize();
        }
        return driver;

    }
    public static void tearDown() {
        if(driver!=null) {
            driver.close();
            driver.quit();
        }
	
	
	
	
    }
    
}
