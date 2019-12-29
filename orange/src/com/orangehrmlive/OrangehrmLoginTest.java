package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ASDM\\chromedriver.exe");
		//opens the browser window
		ChromeDriver chrome = new ChromeDriver();
		
		chrome.get("https://opensource-demo.orangehrmlive.com");
		chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.name("Submit")).click();
		chrome.findElement(By.id("welcome")).click();
		Thread.sleep(1000);
		chrome.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
		
		
	}

}
