package Mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyBrowserClass extends mainMyClass{
	
	
	@BeforeMethod
	
	public void launchBrowser() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.get("http://www.edureka.co");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
		
	@Test
		public void loginForsearchCourse() {
		ClickAccount();
		
		
		
	}
	
	
	
	
	
	

}
