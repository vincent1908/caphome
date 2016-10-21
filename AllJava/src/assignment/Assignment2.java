package assignment;

import java.util.LinkedList;
//import java.awt.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment2 {

	WebDriver driver;
	String url = "http://live.guru99.com/";

	@BeforeTest
	public void beforeMethod() {
		driver = new FirefoxDriver();

		// driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	@Test
	public void verifyMobileSorting() throws Exception {

		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertTrue(title.contains("Home page"));

		driver.findElement(By.xpath(".//*[@id='nav']/ol/li[1]/a")).click();
		String title1 = driver.getTitle();
		System.out.println("page title1 is : " + title1);
		Assert.assertTrue(title1.contains("Mobile"));

		WebElement name_dropdown = driver.findElement(
				By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
		Select name = new Select(name_dropdown);
		name.selectByValue("http://live.guru99.com/index.php/mobile.html?dir=asc&order=name");

		// create an LinkedList instead of arraylist because it preserves
		// insertion order and store the products (web elements) into the
		// linkedlist
		List<WebElement> allProduct = new LinkedList<>(driver.findElements(By.xpath("//h2[@class='product-name']/a")));

		// create another linked list of type string to store image title
		LinkedList<String> productName = new LinkedList<String>();

		// loop through all the elements of the product_webelement list get it
		// title and store it into the product_names list
		for (int i = 0; i < allProduct.size(); i++) {
			// just displaying the product names
			System.out.println(allProduct.get(i).getText());
			productName.add(allProduct.get(i).getText());

		}

		// nd the list to chkalphabetical_order method to check if the elements
		// in the list are in alphabetical order

		boolean result = checkAlphabeticalOrder(productName);

		// print the result

		System.out.println(result);

		// you need to add one more method

		// alphabetical order checking
		/*
		 * private boolean chkalphabetical_order(LinkedList<String> li) { String
		 * prev=""; // empty string for (final String cur: pn) { if
		 * (cur.compareTo(prev) < 0) { return false; } prev=cur; } return true;
		 * }
		 */
		/*
		 * // put all products in list
		 * 
		 * List<WebElement> allProduct = driver .findElements(By.xpath(
		 * "//ul[@class='products-grid products-grid--max-4-col first last odd']/li"
		 * )); int allProductCount = allProduct.size();
		 * System.out.println(allProductCount);
		 * 
		 * // store product name in a list
		 * 
		 * List<WebElement> allProductName = driver.findElements( By.xpath(
		 * ".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li/div/h2/a"
		 * )); System.out.println(allProductName.size()); for (WebElement
		 * phoneName : allProductName) {
		 * System.out.println(phoneName.getText()); }
		 */
		/*
		 * // sort products by price WebElement price_dropdown =
		 * driver.findElement( By.xpath(
		 * ".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"
		 * )); Select price = new Select(price_dropdown); price.selectByValue(
		 * "http://live.guru99.com/index.php/mobile.html?dir=asc&order=price");
		 * 
		 * // store product price in a list
		 * 
		 * List<WebElement> allProductPrice = driver.findElements(
		 * By.xpath("//span[@class='price']"));
		 * System.out.println(allProductPrice.size()); for (WebElement
		 * phonePrice : allProductPrice) {
		 * System.out.println(phonePrice.getText()); }
		 */

	}

	public boolean checkAlphabeticalOrder(LinkedList<String> productName) {
		String prev = ""; // empty string
		for (final String cur : productName) {
			if (cur.compareTo(prev) < 0) {
				return false;
			}
			prev = cur;
		}
		return true;
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
