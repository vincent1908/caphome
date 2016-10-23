package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookDemo {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		// Accessing the textbox using WebElement
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("viacomtest1@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Qwerty@789");
		Thread.sleep(2000);
		// Accessing the Button using WebElement
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		// Accessing the Link using WebElement
		driver.findElement(By.xpath(".//*[@id='pagelet_welcome_box']/ul/li[1]/div/a")).click();
		// Accessing the Checkbox using WebElement
		// Accessing the Radio button using WebElement
		//Accessing the dropdown using WebElement
		
		driver.close();

	}

}
