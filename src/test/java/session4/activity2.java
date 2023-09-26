package session4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		
		
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		
		List <WebElement> link1 = driver.findElements(By.tagName("a"));
		System.out.println(link1.size());
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		
		System.out.println(link.size());

	}

}
