package bank;

import java.io.File;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class Demo {
 
       public static void main(String[] args) throws Exception {
              String exTitle = "Welcome: Mercury Tours";
              //System.setProperty("webdriver.chrome.driver",
             //              "D://Users//gamirtha//Downloads//chromedriver.exe");
              WebDriver driver = new ChromeDriver();
          //     WebDriver driver = new FirefoxDriver();

              driver.manage().window().maximize();
              Thread.sleep(5000);
              driver.get("http://newtours.demoaut.com/");
              String title = driver.getTitle();
              System.out.println(title);
              if (title.contentEquals(exTitle)) {
                     System.out.println("Pass");
 
              } else {
                     System.out.println("Fail");
              }
              Thread.sleep(3000);
 
              // Login Scenario
 
              driver.findElement(By.name("userName")).sendKeys("gamirtha");
              driver.findElement(By.name("password")).sendKeys("Pass@1234");
              driver.findElement(By.name("login")).click();
              ;
 
              Thread.sleep(3000);
 
              System.out.println("login sucess");
 
              // select to destination
 
              WebElement element = driver.findElement(By.name("toPort"));
              Select se = new Select(element);
              se.selectByIndex(2);
              Thread.sleep(3000);
 
              // select return date
 
              WebElement element1 = driver.findElement(By.name("toMonth"));
              Select se1 = new Select(element1);
              se1.selectByIndex(3);
 
              Thread.sleep(3000);
 
              driver.findElement(By.name("findFlights")).click();
 
              // change return path
 
              driver.findElement(By.name("inFlight")).click();
 
              Thread.sleep(3000);
 
              // Logic 1
 
              String ss = driver
                           .findElement(
                                         By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[3]/font"))
                           .getText();
 
              System.out.println(ss);
             
             // driver.findElement(By.xpath("//input/value[contains(text(),7:10]")).click();
             
              Thread.sleep(3000);
 
 
              // String sColValue = "9.17";
              //
              // //First loop will find the 'ClOCK TWER HOTEL' in the first column
              // for (int i=1;i<=3;i++){
              // String sValue = null;
              // sValue =
              // driver.findElement(By.xpath(".//*[@id='post-2924']/div/table/tbody/tr[1]/th["+i+"]")).getText();
 
              driver.findElement(By.name("reserveFlights")).click();
 
              // enter passenger details
 
              driver.findElement(By.name("passFirst0")).sendKeys("fdsfd");
 
              driver.findElement(By.name("passLast0")).sendKeys("dfdfs");
 
              driver.findElement(By.name("creditnumber")).sendKeys("1234");
 
              driver.findElement(By.name("buyFlights")).click();
 
              Thread.sleep(3000);
 
              // Screenshot of booked ticket
 
              File scrFile = ((TakesScreenshot) driver)
                           .getScreenshotAs(OutputType.FILE);
 
              FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
 
              String bookCnf = driver.getTitle();
 
              System.out.println(bookCnf);
 
              // driver.findElement(By.xpath("//img[@src="))
 
              Thread.sleep(3000);
              driver.close();
 
       }
 
}
