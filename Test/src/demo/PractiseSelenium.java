package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class PractiseSelenium extends BaseTest2{
	
	@Test
	public void firstTest() throws Exception{
		openBrow();

		// current url
		//driver.findElement(By.xpath("..")).clear();
		Thread.sleep(10000);
		String currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);
		
		//get title
		
		String curTitle = driver.getTitle();
		System.out.println(curTitle);
		
		
		// get text of image
		
String ddd = 		driver.findElement(By.xpath(".//*[@id='wsb-element-00000000-0000-0000-0000-000450914873']/div/div/a/img")).getText();
System.out.println(ddd);
if (ddd==null){
	System.out.println("...");
}else
	System.out.println("!!!");
Dimension aa = driver.findElement(By.xpath(".//*[@id='wsb-element-00000000-0000-0000-0000-000450914873']/div/div/a/img")).getSize();
		System.out.println(aa);
closeBrow();
		
		
	}

}
