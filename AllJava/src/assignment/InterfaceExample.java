package assignment;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InterfaceExample {

	static WebDriver driver;
	
	public static void main(String[] args) {
	
	 driver = new FirefoxDriver();
		
	 driver = new ChromeDriver();
		
		driver.quit();
		
		driver.quit();
		
		InterfaceExample i1 = new InterfaceExample();
		
		i1.switchToFrame(1);
		
		
		
	}
	
	public void switchToFrame(int frame){
		try {
			driver.switchTo().frame(frame);
			System.out.println("Navigated to frame with id " + frame);
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with id " + frame
					+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to navigate to frame with id " + frame
					+ e.getStackTrace());
		}
		
		
		
		
	}
		
		
	}
	
	
	
	
