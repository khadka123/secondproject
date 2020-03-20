package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainMyClass {
	
	
	
	WebDriver driver;
	
	
public void ClickAccount() {
		
		driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]"));
		driver.findElement(By.id("si_popup_email")).sendKeys("java");
		driver.findElement(By.id("si_popup_passwd")).sendKeys("course");
	

}
}