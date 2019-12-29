package com.orangehrmlive;



import java.util.Iterator; 
import java.util.Set; 
import java.util.concurrent.TimeUnit; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

 
public class Flipcart { 
 
 public static void main(String args[]) throws InterruptedException { 
	 System.setProperty("webdriver.chrome.driver", "D:\\ASDM\\chromedriver.exe");
  WebDriver driver = new ChromeDriver(); 

  driver.get("http://www.flipkart.com"); 
   
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
   
  try { 
   
  
   if(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed()) { 
    
   driver.findElement(By.xpath("(//button)[2]")).click(); 
   
           } 
   
  }catch(Throwable t) { 
   
   System.out.println("Lightbox not displayed"); 
   
  } 
   
   
  driver.manage().window().maximize(); 
   
  driver.findElement(By.name("q")).sendKeys("eye mask"); 
   
  driver.findElement(By.xpath("//button[@type='submit']")).click(); 
   
 
  //driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click(); 
   
  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]\r\n")).click(); 
  

  Set<String> windows = driver.getWindowHandles(); 
   
  Iterator<String> itr = windows.iterator(); 
   
  String mainWindow = itr.next(); 
   
  String childWindow = itr.next(); 
   
  driver.switchTo().window(childWindow); 
  
 // try { 
    
   
  // if(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed()) { 
    
       driver.findElement(By.xpath("(//button)[2]")).click(); 
   
    //  } 
   
  //}catch(Throwable t) { 
   
   System.out.println("Lightbox not displayed"); 
   
 // }*/
   
  if(driver.getTitle().contains("Acer Aspire")) { 
   
   driver.findElement(By.xpath("(//button)[2]")).click(); 
  
  } 
  
  System.out.println("Item added to bag	 sucessfully"); 
  
 } 
 
 
} 