package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import managers.BrowserManager;
import pageClasses.HomePage;

public class Test_Login {
	WebDriver driver;
	BrowserManager browsermanager;
	HomePage homePage;
	
	
	@Test(groups = "testLogin" )
	public void test_login() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	
	@Test(groups = "testLogin" )
	public void test_login1() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	
	@Test(groups = "testLogin" )
	public void test_login2() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("shivanand","mercury");
		driver.close();
	}
	
	@Test(groups = "testLogin" )
	public void test_login3() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}


	@Test(groups = "testLogin" )
	public void test_login4() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "testLogin" )
	public void test_login5() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "regression" )
	public void test_login6() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "regression" )
	public void test_login7() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "regression" )
	public void test_login8() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "regression" )
	public void test_login9() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "smoke" )
	public void test_login10() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "smoke" )
	public void test_login11() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "smoke" )
	public void test_login12() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "smoke" )
	public void test_login13() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "golden TC" )
	public void test_login14() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "golden TC" )
	public void test_login15() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "golden TC" )
	public void test_login16() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "golden TC" )
	public void test_login17() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "golden TC" )
	public void test_login18() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
	@Test(groups = "golden TC" )
	public void test_login19() {
		
		browsermanager = new BrowserManager(driver);	
	
		driver = browsermanager.navigateToURL();
		
		homePage = new HomePage(driver);
		homePage.fun_login("mercury","mercury");
		driver.close();
	}
}
