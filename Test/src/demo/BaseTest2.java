package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest2 {
	WebDriver driver;
	//String url;

	public void openBrow() throws Exception {
		driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("http://www.practiceselenium.com/");

	}

	public void closeBrow() {
		driver.close();
	}

}
