package bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Abcd {

	public static void main(String[] args) throws Exception {
        String exTitle = "Checking Title";

		 WebDriver driver = new FirefoxDriver();

         driver.manage().window().maximize();
         Thread.sleep(5000);
         driver.get("http://abcd-24.netau.net/");
         String title = driver.getTitle();
         System.out.println(title);
         if (title.contentEquals(exTitle)) {
                System.out.println("Pass");

         } else {
                System.out.println("Fail");
         }
         Thread.sleep(3000);
         driver.findElement(By.xpath("html/body/p[1]/a")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("html/body/p[2]/a")).click();

         Thread.sleep(3000);

         driver.close();
         
	}

}
