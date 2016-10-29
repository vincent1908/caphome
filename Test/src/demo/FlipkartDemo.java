package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FlipkartDemo {
	
	@Test	
	public void New() throws Exception{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		driver.findElement(By.id("webklipper-publisher-widget-container-content-expand-collapse")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("webklipper-publisher-widget-container-frame");
		driver.findElement(By.id("field_email_EMAIL")).sendKeys("test@gmail.com");
		
	}

}
