package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class New {
	WebDriver driver;
  @Test
  public void Login() {
	  String ExpectedResults = "Find a Flight: Mercury Tours:";
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("login")).click();
	  WebDriverWait wait = new  WebDriverWait(driver,30);
	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  wait.until(ExpectedConditions.titleIs("Find a Flight: Mercury Tours:"));
	  //Actions act = new Actions (driver); 
	  //act.d
	  Assert.assertEquals(ExpectedResults,driver.getTitle());
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demoaut.com");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
	  //System.out.println("After Class");
  }

}