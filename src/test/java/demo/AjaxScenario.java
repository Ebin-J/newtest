package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class AjaxScenario {
	WebDriver driver;
  @Test(priority =1)
  public void Ajax() {
	  By container = By.cssSelector(".demo-container");
	  WebDriverWait wait = new WebDriverWait(driver, 5);
	  wait.until(ExpectedConditions.presenceOfElementLocated(container));
	  WebElement noDatesTextElement = driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
	  String textBeforeAjax = noDatesTextElement.getText().trim();
	  driver.findElement(By.linkText("1")).click();
	  By loader = By.className("raDiv");
	  wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
	  WebElement SlectedDatesTextElement = driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
	  wait.until(ExpectedConditions.visibilityOf(SlectedDatesTextElement));
	  String textAfterAjax = noDatesTextElement.getText().trim();
	  System.out.println(textBeforeAjax);
	  System.out.println(textAfterAjax);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
