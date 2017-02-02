package bbc;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario2 {
	static WebDriver driver;
	static Wait<WebDriver> wait;

	 public static void main(String[] args)
	  {
		 driver = new FirefoxDriver();
		 wait = new WebDriverWait(driver, 30);
		 driver.get("http://www.bbc.co.uk/radio/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.id("categories")).click();
		 
		 boolean CatDisplayed=driver.findElement(By.id("categories-panel")).isDisplayed();
		 boolean SchDisplayed=driver.findElement(By.id("schedules-panel")).isDisplayed();
		 boolean StaDisplayed=driver.findElement(By.id("stations-panel")).isDisplayed();

		 if(CatDisplayed)
		 {
			 if(SchDisplayed || StaDisplayed)
		 	{
			 System.out.println(" Scenario2 Test Failed");
		 	}
		 
		 	else
		 		
		    {
			 System.out.println("Scenario2 Test Passed");
		    } }
		 
		 	else
		 	{
		 	System.out.println(" Scenario2 Test Failed");
		 	}
		 			 
		 driver.quit();
	  }
}
