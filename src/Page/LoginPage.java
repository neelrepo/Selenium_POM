package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public WebElement loginButton()
	{
		WebElement lb=driver.findElement(By.xpath(".//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]"));
		return lb;
	}
	
	public WebElement enterUserName()
	{
		WebElement e=driver.findElement(By.id("username"));
		return e;
	}

	
	public WebElement enterPassword()
	{
		WebElement p=driver.findElement(By.id("password"));
		return p;
	}
	
	public WebElement clickLogin()
	{
		WebElement l=driver.findElement(By.className("primary"));
		return l;
	}
	
}
