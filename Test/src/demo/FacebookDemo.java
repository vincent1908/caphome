package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookDemo {

	WebDriver driver;

	@BeforeMethod
	public void init() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}

	@Test(enabled = false)
	public void loginTest() throws Exception {

		// Accessing the textbox using WebElement
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("viacomtest1@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Qwerty@789");
		Thread.sleep(2000);
		// Accessing the Button using WebElement
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();

	}

	@Test
	public void linkTest() throws Exception {
		Thread.sleep(5000);
		// Accessing the Link using WebElement
		driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		driver.navigate().back();
		// Accessing the Checkbox using WebElement
		// Accessing the Radio button using WebElement
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).click();
		// Accessing the dropdown using WebElement
		WebElement element = driver.findElement(By.id("day"));
		Select se = new Select(element);
		se.selectByValue("19");
		System.out.println("......");
		
		WebElement element1 = driver.findElement(By.id("month"));
		Select se1 = new Select(element1);
		se1.selectByValue("8");
		System.out.println("......");
		
		WebElement element2 = driver.findElement(By.id("year"));
		Select se2 = new Select(element2);
		se2.selectByValue("1984");
		System.out.println("......");
		
		
	}

	@AfterMethod
	public void tearDown() {
		driver.close();

	}

}
