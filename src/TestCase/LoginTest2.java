package TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.Common;
import Page.LoginPage;

public class LoginTest2 extends Common{
	
	@Test
	public void myLogin()
	{
		LoginPage loginobj=new LoginPage(driver);
		loginobj.enterUserName();
		loginobj.enterPassword();
		loginobj.clickLogin();
	}

}
