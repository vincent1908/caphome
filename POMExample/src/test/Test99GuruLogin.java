package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Guru99HomePage;
import pages.Guru99Login;
import utility.ConfigReader;
import utility.ConfigWriter;

public class Test99GuruLogin {

	WebDriver driver;
	Guru99Login objLogin;
	Guru99HomePage objHomePage;
	
	
	@BeforeTest
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
	}

	/**
	 * This test case will login in http://demo.guru99.com/V4/
	 * Verify login page title as guru99 bank
	 * Login to application
	 * Verify the home page using Dashboard message
	 */
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct(){
		ConfigReader con = new ConfigReader();
		//ConfigWriter con1 = new ConfigWriter();
		//con1.setPassWord();
		//con1.setUserName();
		System.out.println("----------------");

		//Create Login Page object
	objLogin = new Guru99Login(driver);
	//Verify login page title
	String loginPageTitle = objLogin.getLoginTitle();
	Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
	//login to application
	objLogin.loginToGuru99(con.getUserName(),con.getPassWord());
	// go the next page
	objHomePage = new Guru99HomePage(driver);

	
	//Verify home page
	//Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	driver.close();
	}
	
}
