package com.Test;


//import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
		
	   @Test
		public void t_01()
		{
		    System.setProperty("webdriver.chrome.driver","F:\\languages setup\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); // Maximize the Window
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);// Load the page within timeout
			driver.get("http://localhost:8081/customer/login");   ///add the url of the site
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//Find user and set username
			WebElement txtbx_username=
					driver.findElement(By.id("email"));
			
			txtbx_username.sendKeys("email");
			
			//passsword is set
			driver.findElement(By.name("password")).sendKeys("password");
			
	
			
			//login button
			driver.findElement(By.xpath("/html/body/div[6]/div/div/div/form/div[3]/input"));
			
			String expected_title = "FoodBox General Store | Login";
			String actual_title=driver.getTitle();
			
			Assert.assertEquals(actual_title,expected_title);
			
		}
}
