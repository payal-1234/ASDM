package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTestTest {
	ChromeDriver chrome;
  @Test(priority=1)
  public void openbrowser() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Very Imp\\chromedriver.exe");
	  chrome = new ChromeDriver();
	  chrome.get("https://opensource-demo.orangehrmlive.com");
  }
  @Test(priority=2)
  public void logintest() {
	  chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.id("btnLogin")).click();
  }
  @Test(priority=3)
  public void admintest() throws InterruptedException {
	  Thread.sleep(2000);
	  chrome.findElement(By.linkText("Admin")).click();
		WebElement userdd = chrome.findElement(By.id("searchSystemUser_userType"));
		
		Select userType = new Select(userdd);
		userType.selectByIndex(2);
		
  }
  @Test(priority=4)
  public void admin() {
//	  WebElement ad = chrome.findElement(By.linkText("Admin"));
//	  if(ad.isDisplayed())
//	  {
//		  System.out.println("Admin Element is present");
//	  }
	  String a="Admin";
	  String b= chrome.findElement(By.linkText("Admin")).getText();
	  
	 
	  //String b1 = b.getText();
	  
	  if(a.equals(b))
	  { 
		 System.out.println("All functions are present");
	  }
  }
  @Test(priority=5)
  public void pimtest() throws InterruptedException {
	  chrome.findElement(By.linkText("PIM")).click();
	  WebElement userdd1 = chrome.findElement(By.id("empsearch_job_title"));
		
		Select userType1 = new Select(userdd1);
		userType1.selectByIndex(4);
		Thread.sleep(2000);
  }
  @Test(priority=6)
  public void logout() throws InterruptedException {
	  chrome.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
  }
  @Test(priority=7)
  public void closebrowser() {
	 chrome.close();
  }
  
}
