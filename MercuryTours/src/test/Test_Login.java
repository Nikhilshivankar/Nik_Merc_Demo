package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import managers.BrowserManager;
import pageClasses.HomePage;

public class Test_Login {
	WebDriver driver;
	BrowserManager browsermanager;
	HomePage homePage;
	
	
	@Test
	public void test_login() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
	}
	
	@Test
	public void test_login1() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
	}
	
	@Test
	public void test_login2() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
	}
}
