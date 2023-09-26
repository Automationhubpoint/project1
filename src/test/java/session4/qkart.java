package session4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		
		
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		 
		String  URL = driver.getCurrentUrl();
		
		
		
		
		WebElement ele = driver.findElement(By.xpath("//input[@name='search']"));
		
		ele.sendKeys( "hello");
		
		Thread.sleep(10000);
		
		
		
//		System.out.println(URL);
//		
//		
//		WebElement  privacypolicy = driver.findElement(By.xpath("//a[normalize-space()='Privacy policy']"));
//		
//		
//		privacypolicy.click();
//		
//		
//	    URL = driver.getCurrentUrl();    
//		
//		System.out.println( URL);
//
//		Set<String> handles = driver.getWindowHandles();
//		
//		System.out.println(handles);
//		
//        driver.switchTo().window(handles.toArray(new String[handles.size()])[1]);
//        
//        driver.close();
//        
//        System.out.println(handles);
//        
//        driver.switchTo().window(handles.toArray(new String[handles.size()])[0]);
//        
//        privacypolicy.click();
//        
//        
//        handles =driver.getWindowHandles();
//        
//        System.out.println(handles);
//        
//    
//        URL= driver.getCurrentUrl() ;
//        System.out.println( URL);
//        
        
        driver.quit();
        
        
        
        

	}

}
