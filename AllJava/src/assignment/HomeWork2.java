package assignment;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("labelling and stamping");
		
		driver.findElement(By.xpath("//input[@class='vh79eN']")).click();
		
		List<WebElement> a= driver.findElements(By.xpath("//div[@class='gd-row browse-grid-row']/div/div/div/div/a]"));
		
		LinkedList<String> b = new LinkedList();
		
		System.out.println(b.size());
	}

}
