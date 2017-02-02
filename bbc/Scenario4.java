package bbc;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Scenario4 {
	static WebDriver driver;
	static Wait<WebDriver> wait;

	 public static void main(String[] args)
	  {
		 driver = new FirefoxDriver();
		 wait = new WebDriverWait(driver, 30);
		 driver.get("http://www.bbc.co.uk/radio/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.id("categories")).click();
	 
	 List<WebElement> cat_menu= driver.findElements(By.id("categories-panel"));

	 for(WebElement element:cat_menu)
	 {

	String CatList=element.getAttribute("innerHTML");
	 
	 if(CatList.contentEquals("All Categories"))
	 {
	 element.click();
	 break;
	 }
	 }
	 
	 String Url = driver.getCurrentUrl();

	 if (Url.equals("http://www.bbc.co.uk/radio/programmes/genres")) 
	 {
	         System.out.println("Scenario4 Test passed” ");
	     } else {
	         System.out.println("Scenario4 Test Failed");
	     }
	 driver.quit();
	 }
}

