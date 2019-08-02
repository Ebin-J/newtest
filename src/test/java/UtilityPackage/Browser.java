package UtilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	static WebDriver driver;
	public static WebDriver startBrowser(String BrowserName, String URL) {
		if (BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium 3.0\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
	}
}
