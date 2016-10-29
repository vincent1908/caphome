package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumFrmaework extends BaseTest {
	

	@Test
	public void htmlElements() throws Exception {
		openBrow();
		// link
		// driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div/a")).click();
		// textarea
		driver.findElement(By.xpath(".//*[@id='vfb-10']")).clear();
		driver.findElement(By.xpath(".//*[@id='vfb-10']")).sendKeys("hsdghdgsgd");
		Thread.sleep(2000);
		// text
		driver.findElement(By.xpath(".//*[@id='vfb-9']")).clear();
		driver.findElement(By.xpath(".//*[@id='vfb-9']")).sendKeys("ddssd");
		Thread.sleep(2000);

		//checkbox
		driver.findElement(By.xpath(".//*[@id='vfb-6-0']")).click();
		
		//radiobutton
		driver.findElement(By.xpath(".//*[@id='vfb-7-1']")).click();

		//date 
		driver.findElement(By.xpath(".//*[@id='vfb-8']")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[7]/a")).click();
		Thread.sleep(5000);
		
		//url
		http://www.google.com
			driver.findElement(By.xpath(".//*[@id='vfb-11']")).clear();

			driver.findElement(By.xpath(".//*[@id='vfb-11']")).sendKeys("ddssd");
		driver.findElement(By.xpath(".//*[@id='vfb-9']")).sendKeys("ddssd");


		//drpdown
		
	WebElement we= 	driver.findElement(By.xpath(".//*[@id='vfb-12']"));
	Select s = new Select(we);
	s.selectByVisibleText("Option 3");
	Thread.sleep(5000);

	//Verification
	driver.findElement(By.xpath(".//*[@id='vfb-3']")).sendKeys("19");
	driver.findElement(By.xpath(".//*[@id='vfb-4']")).click();

		closeBrow();
	}

}
