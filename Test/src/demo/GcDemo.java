package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class GcDemo {

	public static void main(String[] args) {
		// Example1
		WebDriver driver = new FirefoxDriver();
		driver.get("dhdgd");
		driver.findElement(By.xpath(",,,")).click();
		driver.findElement(By.xpath("fgf")).click();
		driver.navigate().back();

		//// ----------------------------//////
		// Example2
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("dhdgd");
		driver1.findElement(By.xpath(",,,")).click();
		driver1.findElement(By.xpath("fgf")).click();
		driver1.findElement(By.xpath("fghgff")).click();

	}

}
