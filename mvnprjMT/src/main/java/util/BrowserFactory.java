package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
		
	static WebDriver driver;
	
    public static WebDriver startBrowser() {
    	
        System.setProperty("webdriver.chrome.driver",  "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        
        return driver;
        }
	}
