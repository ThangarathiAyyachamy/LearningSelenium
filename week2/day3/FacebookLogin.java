package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//button[@title='Decline optional cookies']")).click();
      WebElement gmail = driver.findElement(By.id("email"));
      gmail.sendKeys("testleaf.2023@gmail.com");
      WebElement pass = driver.findElement(By.id("pass"));
      pass.sendKeys("Tuna@321");
      WebElement login = driver.findElement(By.name("login"));
      login.click();
      WebElement findAccount = driver.findElement(By.linkText("Find your account and log in."));
      findAccount.click();
      String errorPage = driver.getTitle();
      if(errorPage.contains(("can")))
    		  {
    	  System.out.println ("Error page verified successfully");
    		  }
      else
      {
    	  System.out.println("Unable to verify the error page");
      }
      driver.close();
      
      }
      
      
	}


