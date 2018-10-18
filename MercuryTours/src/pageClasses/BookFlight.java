package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;

public class BookFlight {

	WebDriver driver;
	public BookFlight(WebDriver driver) {
		this.driver =driver;
	//	PageFactory.initElements(driver,this);
	}
	
	public void securePurchase() {
		
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Nikhil");
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Shivankar");
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("1234567891230");
		
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
	}
}
