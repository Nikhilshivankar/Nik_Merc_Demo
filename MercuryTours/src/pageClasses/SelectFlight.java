package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;

public class SelectFlight {

	WebDriver driver;
	public SelectFlight(WebDriver driver) {
		this.driver =driver;
		//PageFactory.initElements(driver,this);
	}
	
	
	public void selectFlights() {
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();	
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	}
}
