package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	
	public WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void fun_login(String strUserName, String strPassWord) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(strUserName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(strPassWord);
		driver.findElement(By.xpath("//input[@name='password']")).submit();
	}

	
}
