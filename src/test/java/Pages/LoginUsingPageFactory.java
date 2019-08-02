package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginUsingPageFactory {
	WebDriver driver;
	public LoginUsingPageFactory(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.NAME, using= "userName")
	WebElement username; 
	@FindBy(how = How.NAME, using = "password")
	WebElement password;
	@FindBy(how = How.NAME, using = "login")
	WebElement SignIn;
	
	public void login(String UserName, String Password)
	{
		username.sendKeys(UserName);
		password.sendKeys(Password);
		SignIn.click();
	}

}
