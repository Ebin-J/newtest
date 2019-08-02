package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	WebDriver driver;
	  
  @Test
  public void upload() throws AWTException{
	  Robot robo = new Robot();
	  robo.delay(1000);
	  //@FindBy(how=How.NAME, using = "resumeupload")
	  //WebElement Upload;
	  //Upload.click();
	  driver.findElement(By.name("resumeupload")).click();	  
	  String path ="C:\\Users\\Training_C2d.02.11\\Desktop\\Ebin\\Data.xlsx"; 
	  StringSelection sel = new StringSelection(path);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	  robo.keyPress(KeyEvent.VK_CONTROL);
	  robo.keyPress(KeyEvent.VK_V);
	  robo.keyRelease(KeyEvent.VK_CONTROL);
	  robo.keyRelease(KeyEvent.VK_V);
	  robo.keyPress(KeyEvent.VK_ENTER);
	  robo.keyRelease(KeyEvent.VK_ENTER);
	  
	  
  }
  
  @BeforeTest
  public void file() throws AWTException{
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("file:///C:/Users/Training_C2d.02.11/Desktop/Ebin/FileUpload.html");
	  driver.manage().window().maximize();
  }
  
}
