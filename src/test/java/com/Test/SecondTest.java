package com.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SecondTest {
		
		SoftAssert soft = new SoftAssert();
		 WebDriver driver;
		
		  @Test
			public void Launch()
			{
			    System.setProperty("webdriver.chrome.driver","F:\\languages setup\\chromedriver\\chromedriver.exe");
			    driver = new ChromeDriver();
			    try {
			    Thread.sleep(3000);}
			    catch(InterruptedException e){
			    	e.printStackTrace();
			    
			    }
			}
		  @Test(dependsOnMethods="Launch")
				public void FoodBox()
				{
					driver.get("http://localhost:8081/customer/login");
					soft.assertEquals("FoodBox General Store | Login", driver.getTitle());
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				@Test(dependsOnMethods="FoodBox")
				public void Login()
				{
					driver.findElement(By.id("email")).sendKeys("sample@xyz.com");
					driver.findElement(By.name("password")).sendKeys("dfsdfdfdfdf");
					driver.findElement(By.xpath("/html/body/div[6]/div/div/div/form/div[3]/input"));
					//driver.findElement(By.name("login")).click();
					soft.assertAll();
					
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}   
		
	
}

