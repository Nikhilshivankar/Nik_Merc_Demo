package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;

public class BrowserManager{

	public WebDriver driver;
	
	public BrowserManager(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver,this);
	}
	
	public WebDriver launchBrowser(){
		System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv7\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebDriver navigateToURL() {
		
		System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv7\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		return driver;
	}
	
}
