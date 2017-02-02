package bbc;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario1 
{

		static WebDriver driver;
		  static Wait<WebDriver> wait;

		 public static void main(String[] args)
		  {
		 driver = new FirefoxDriver();
		 wait = new WebDriverWait(driver, 30);
		 driver.get("http://www.bbc.co.uk/radio/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.id("categories")).click();
		 

		 boolean isDisplayed=driver.findElement(By.id("categories-panel")).isDisplayed();

		 if(isDisplayed)
		 {
	     driver.findElement(By.id("categories")).click();
		 
		 boolean isShown=driver.findElement(By.id("categories-panel")).isDisplayed();

		 if(isShown)
		 {
			 System.out.println(" Scenario1 Test Failed");
		 }
		 
		 }
		 else
		 {
			 System.out.println("Scenario1 Test Passed");
		 }
		 
		driver.quit();
		  }
		 }

