package expedia.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class expediaMain {

	WebDriver driver;
	
		
	public void flightAndCars() {
		WebElement element = driver.findElement(By.xpath("//*[@id='tab-flightCar-tab-flp-fc']/span[1]"));
		element.click();
		WebElement element2 =driver.findElement(By.xpath("//*[@id='flight-type-one-way-label-flp']"));
		element2.click();
		driver.findElement(By.xpath("//*[@id='flight-origin-flp']")).clear();
		driver.findElement(By.xpath("//*[@id='flight-origin-flp']")).sendKeys("DfW Dallas");
		
		driver.findElement(By.xpath("//*[@id='flight-destination-flp']")).clear();
		driver.findElement(By.xpath("//*[@id='flight-destination-flp']")).sendKeys("kathmandu");
		
		driver.findElement(By.xpath("//*[@id='package-fc-departing-hp-package']")).clear();
		driver.findElement(By.xpath("//*[@id='package-fc-departing-hp-package']")).sendKeys("03/17/2020");
		
		driver.findElement(By.xpath("//*[@id='package-fc-returning-hp-package']")).clear();
		driver.findElement(By.xpath("//*[@id='package-fc-returning-hp-package']")).sendKeys("04/17/2020");
		
		driver.findElement(By.xpath("//*[@id='traveler-selector-hp-package-fc']/div/ul/li/button")).click();
		
		driver.findElement(By.xpath("//*[@id='search-button-flp-fc']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
					

		
		
		
		
		
		
	}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

