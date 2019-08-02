package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestMeWindowHandle {
	WebDriver driver;
	public TestMeWindowHandle(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.NAME, using= "//span[contains(text(),'AboutUs')]")
	WebElement aboutus; 
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Offices')]")
	WebElement ouroffice;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Chennai')]")
	WebElement Chennai;
	
	public void ChennaiOffice()
	{
		/*username.sendKeys(UserName);
		password.sendKeys(Password);
		SignIn.click();*/
		aboutus.click();
		ouroffice.click();
		Chennai.click();	
		
	}
}
