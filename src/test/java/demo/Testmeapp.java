package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testmeapp {
	WebDriver driver;
  @Test
  public void fMoveToElement() {
	  /*WebElement aboutus = driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"));
	  WebElement Offices = driver.findElement(By.xpath("//span[contains(text(),'Offices')]"));
	  WebElement Chennai = driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"));*/
	  Actions act = new Actions(driver);
	  WebDriverWait wait = new WebDriverWait(driver, 50);
	  /*act.moveToElement(aboutus).click().build().perform();
	  wait.until(ExpectedConditions.elementToBeClickable(aboutus));
	  act.moveToElement(Offices).click().build().perform();
	  wait.until(ExpectedConditions.elementToBeClickable(Offices));
	  act.moveToElement(Chennai).click().build().perform();*/
	  WebElement search = driver.findElement(By.id("myInput"));
	  wait.until(ExpectedConditions.elementToBeClickable(search));
	  
	  act.sendKeys("b").pause(3000).sendKeys("a").pause(3000).sendKeys("g").pause(3000).build().perform();
	  /*search.sendKeys("b");
	  search.sendKeys("a");
	  search.sendKeys("g");*/
	  /*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  WebElement find = driver.findElement(By.xpath("//input[@type= 'submit']"));
	  wait.until(ExpectedConditions.elementToBeClickable(find));
	  act.moveToElement(find).click().build().perform();
	  String text = driver.findElement(By.xpath("//h4[contains(text(),'Hand bag')]")).getText();
	  Assert.assertTrue(text.contains("Hand Bag")); */	  
  }

@org.testng.annotations.BeforeTest
public void BeforeTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
}