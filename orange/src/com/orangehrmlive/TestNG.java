package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG {
	ChromeDriver chrome;
	@DataProvider(name="credentials")
	public Object[][] dataSet()
	{
		return new Object[][]
				{
					{"Ad","admin"},
					{"linda.anderson","linda.anderson"},
					{"Adminas","asasd"}
				};
	}
  @BeforeTest
  public void verifyTest(String un,String pwd) throws Exception {
	  System.setProperty("webdriver.chrome.driver","Z:\\group009_ASDM\\chromedriver.exe");
		chrome = new ChromeDriver();
		chrome.get("https://opensource-demo.orangehrmlive.com");
		
		chrome.findElement(By.name("txtUsername")).sendKeys(un);
		chrome.findElement(By.name("txtPassword")).sendKeys(pwd);
		chrome.findElement(By.id("btnLogin")).click();
		
		try {
			WebElement error =chrome.findElement(By.id("spanMessage"));
			boolean err = error.isDisplayed();
			
			if(err)
			{
				System.out.println("Invalid credentials");
			}
		}
		catch(Exception e)
		{
			chrome.findElement(By.id("Welcome")).click();
			Thread.sleep(3000);
			chrome.findElement(By.id("logout")).click();
		}
		chrome.close();
  }
  
 
}
