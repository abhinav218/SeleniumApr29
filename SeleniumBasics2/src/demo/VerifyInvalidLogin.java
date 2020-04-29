package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyInvalidLogin {
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("superman.39242@rediffmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("pass12345");
		
		driver.findElement(By.id("loginbutton")).click();
		
		 String actualText = driver.findElement(By.cssSelector("globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();
		 String expectedText = "The email address that you've entered doesn't match any account. Sign up for an account.";
		 
		 if(actualText.equals(expectedText)) {
			 System.out.println("Test Case Passed");
		 }
		 else {
			 System.out.println("Test Case Failed");
			
		}
		   driver.close();		
	}

}
