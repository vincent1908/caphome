package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfigReader {

	/**
	 * @throws Exception
	 * 
	 */
	static Properties pro;

	public ConfigReader() {

		// TODO Auto-generated constructor stub
		try {
			// Specify the file location I used . operation here because
			// we have object repository inside project directory only
			File src = new File(
					"/Users/Gregoryvincent/git/caphome/POMExample/src/objectRepository/Object_Repo.properties");
			//
			// Create FileInputStream object
			FileInputStream fis = new FileInputStream(src);
			// Create Properties class object to read properties file
			pro = new Properties();
			// Load file so we can use into our script
			pro.load(fis);
			System.out.println("Property class loaded");
		} catch (Exception e) {

			System.out.println("Exception is : " + e.getMessage());
		}

	}

	public String getUserName() {
		String uName = pro.getProperty("userName");
		return uName;
	}
	
	public String getPassWord() {
		String pWord = pro.getProperty("passWord");
		return pWord;
	}

	// public static void main(String[] args) throws Exception {

	// // Open FirefoxBrowser
	// WebDriver driver=new FirefoxDriver();
	//
	// // Maximize window
	// driver.manage().window().maximize();

	// File src=new
	// File("/Users/Gregoryvincent/git/caphome/POMExample/Object_Repo.properties");
	//
	// // Create FileInputStream object
	// FileInputStream fis=new FileInputStream(src);
	//
	// // Create Properties class object to read properties file
	// Properties pro=new Properties();
	//
	// // Load file so we can use into our script
	// pro.load(fis);
	//
	// System.out.println("Property class loaded");
	//
	//
	// System.out.println(pro.getProperty("userName"));
	//
	// }
}
