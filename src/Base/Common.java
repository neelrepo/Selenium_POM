package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Common {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void befMet()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neel.kamal\\Desktop\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://twitter.com/");
		//driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void aftMet()
	{
		driver.quit();
	}

}
