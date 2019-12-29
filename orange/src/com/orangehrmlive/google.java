package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\ASDM\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	  
	       driver.manage().window().maximize();
	  
	       driver.get("https://accounts.google.com/SignUp");
	  
	       driver.findElement(By.id("firstName")).sendKeys("ashish");
	       driver.findElement(By.id("lastName")).sendKeys("group015");
	       driver.findElement(By.id("username")).sendKeys("saurabh");
	       driver.findElement(By.name("Passwd")).sendKeys("DemoPassword");
	       driver.findElement(By.name("ConfirmPasswd")).sendKeys("DemoPassword");
	       driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span/span")).click();
	   
	 }

	}
