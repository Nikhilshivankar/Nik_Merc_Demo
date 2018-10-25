package pageClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

public class FlightFinder {

	public WebDriver driver;
	public FlightFinder(WebDriver driver) {
		
		this.driver=driver;
		//PageFactory.initElements(driver,this);
	}
	
	public void fun_FlightFinder() {
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		driver.findElement(By.xpath("//select[@name='passCount']")).click();
		driver.findElement(By.xpath("//select[@name='passCount']")).sendKeys("3");
		/*List <WebElement> list_fromPort = driver.findElements(By.xpath("//select[@name='fromPort']"));
		driver.findElement(By.xpath("//select[@name='fromMonth'] and contains")).click();
		List <WebElement> list_toPort = driver.findElements(By.xpath("//select[@name='fromPort']"));
		*/
		driver.findElements(By.xpath("//select[@name='toPort']")).get(5);
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		
	}
	
	
}
