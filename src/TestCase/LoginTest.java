package TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.Common;
import Page.LoginPage;

public class LoginTest extends Common{
	
	@Test
	public void myLogin()
	{
		LoginPage loginobj=new LoginPage(driver);
//		loginobj.enterUserName().sendKeys("mohit");
//		
//		loginobj.enterPassword().sendKeys("hello11");
//		loginobj.clickLogin().click();
		loginobj.loginButton().click();
	}
	

}
