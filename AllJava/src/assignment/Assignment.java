package assignment;

import java.util.LinkedList;
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

public class Assignment {

	WebDriver driver;
	String url = "http://live.guru99.com/";

	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void verifyMobileSorting() throws Exception {
		// 1.Goto http://live.guru99.com/
		driver.get(url);
		// 2.Verify title of the page
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertTrue(title.contains("Home page"));
		// 3.Click on 'MOBILE' menu
		driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']")).click();
		// 4.Verify title of the page
		String title1 = driver.getTitle();
		System.out.println("page title1 is : " + title1);
		Assert.assertTrue(title1.contains("Mobile"));
		// 5.In the list of all mobiles, select 'SORT BY' dropdown as 'name'.
		
		WebElement name_dropdown = driver.findElement(By.xpath("//select[@title='Sort By']"));
		Select name = new Select(name_dropdown);
		name.selectByValue("http://live.guru99.com/index.php/mobile.html?dir=asc&order=name");
		
		// 6.Verify all products are sorted by name
		List<WebElement> allProduct = new LinkedList<>(driver.findElements(By.xpath("//h2[@class='product-name']/a")));
		LinkedList<String> productName = new LinkedList<String>();
		for (int i = 0; i < allProduct.size(); i++) {
			System.out.println(allProduct.get(i).getText());
		}
		boolean result = checkAlphabeticalOrder(productName);
		System.out.println(result);

		// 7.In the list of all mobiles, select 'SORT BY' dropdown as 'price'.
		
		WebElement price_dropdown = driver.findElement(
				By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
		Select price = new Select(price_dropdown);
		price.selectByValue("http://live.guru99.com/index.php/mobile.html?dir=asc&order=price");
		
		
		// 8.Verify all products are sorted by price
		List<WebElement> allProductNew = new LinkedList<>(
				driver.findElements(By.xpath("//div[@class='price-box']/span")));
		LinkedList<String> productPrice = new LinkedList<String>();
		for (int i = 0; i < allProductNew.size(); i++) {
			System.out.println(allProductNew.get(i).getText());
		}
		boolean resultPrice = checkAlphabeticalOrderPrice(productPrice);
		System.out.println(resultPrice);
	}

	public boolean checkAlphabeticalOrder(LinkedList<String> productName) {
		String prev = ""; // empty string
		for (final String cur : productName) {
			if (cur.compareToIgnoreCase(prev) < 0) {
				return false;
			}
			prev = cur;
		}
		return true;
	}

	public boolean checkAlphabeticalOrderPrice(LinkedList<String> productPrice) {
		String prev = ""; // empty string
		for (final String cur : productPrice) {
			if (cur.compareToIgnoreCase(prev) < 0) {
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
