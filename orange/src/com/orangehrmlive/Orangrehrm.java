package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orangrehrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Very Imp\\chromedriver.exe");
		//opens the browser window
		ChromeDriver chrome = new ChromeDriver();
		//Enters thru url
		chrome.get("https://opensource-demo.orangehrmlive.com");
		//Locates the username field and pass the data
		chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		chrome.findElement(By.linkText("Admin")).click();
		WebElement userdd = chrome.findElement(By.id("searchSystemUser_userType"));
		
		Select userType = new Select(userdd);
		userType.selectByIndex(2);
		Thread.sleep(4000);
		chrome.findElement(By.linkText("Leave")).click();
		WebElement userd1 = chrome.findElement(By.id("leaveList_cmbSubunit"));
		Select userType1 = new Select(userd1);
		userType1.selectByIndex(1);
		
		chrome.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();

	}

}
