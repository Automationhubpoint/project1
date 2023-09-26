package session4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity1 {
	
	
	
	public static void main(String [] args)
	{
		
		
		WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		WebElement searchbox =driver.findElement(By.name("q")) ;
		searchbox.sendKeys("amazon");
		searchbox.sendKeys(Keys.RETURN);
		WebElement ele =driver.findElement(By.xpath("//span[text()='Amazon.in']"));
		if(ele.isDisplayed())
		{
			System.out.print("Element is  visible");
		}
		else 
			System.out.println("Element not visible");
		
		driver.quit();
		
		
	}

}
