package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	WebDriver driver;

	public void openBrow() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");

	}

	public void closeBrow() {
		driver.close();
	}

}
