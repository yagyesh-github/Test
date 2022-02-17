package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTest {
  
	private WebDriver driver;
	SoftAssert soft = new SoftAssert();
	
	@Test
  public void t_01() {
		System.setProperty("webdriver.chrome.driver", "F:\\languages setup\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8081/customer/login");
		String title = driver.getTitle();
		AssertJUnit.assertEquals("FoodBox General Store | Login", title);
	}
	
	//@BeforeTest
	//public void beforeTest()
	//{
	//	driver = new ChromeDriver();
	//}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
}

