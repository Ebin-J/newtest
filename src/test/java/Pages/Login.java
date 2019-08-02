package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By username = By.name("userName");
	By password = By.name("password");
	By signin = By.name("login");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void LoginUser(String UserName, String Password)
	{
		driver.findElement(username).sendKeys(UserName);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(signin).click();
		
	}

}
