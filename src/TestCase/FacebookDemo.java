package TestCase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookDemo {
	
	@Test
	public void fbDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neel.kamal\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("hellomohuitjhsjh");
		
		driver.findElement(By.id("pass")).sendKeys("hellomohuitjhsjh");
		
		driver.findElement(By.id("u_0_q")).click();
		
		driver.quit();
		
	}

}
