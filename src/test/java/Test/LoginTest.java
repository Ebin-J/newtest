package Test;

import org.testng.annotations.Test;
//import Pages.Login;
//import Pages.LoginUsingPageFactory;
import Pages.TestMeWindowHandle;
import UtilityPackage.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
	WebDriver driver;
  @Test
  public void test() {
	  WebDriver driver= Browser.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp");
	  new PageFactory();
	/*Login log = new Login(driver);
	  log.LoginUser("tutorial", "tutorial");*/
	  /*LoginUsingPageFactory log = new LoginUsingPageFactory(driver);
	  log.login("tutorial", "tutorial");*/
	  /*LoginUsingPageFactory log = PageFactory.initElements(driver, LoginUsingPageFactory.class);
	  log.login("tutorial", "tutorial");*/
	  TestMeWindowHandle log = PageFactory.initElements(driver, TestMeWindowHandle.class);
	  log.ChennaiOffice();
  }
}