package expedia.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserExpedia extends expediaMain{
	
	
		
@BeforeMethod

 public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe\\");
	driver = new ChromeDriver();
	driver.get("https://www.expedia.com/Flights");
	driver.manage().window().maximize();
	
}
	
	@Test
	public void bookingFlightsAndCars() {
		flightAndCars();
		
		
	}
	
	
	

		
	
	
}	

