package demo;

import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDownBoxExp {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement countryDropDown = driver.findElement(By.name("country"));
		
		Select dd = new Select(countryDropDown);
		//dd.selectByVisibleText("TURKEY");
		//dd.selectByIndex(1);
		dd.selectByValue("68");
		
		
		
		
	}

}
