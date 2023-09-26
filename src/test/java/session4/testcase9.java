package session4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testcase9 {

	public static void main(String[] args) {
		WebDriver driver ;
		
		// TODO Auto-generated method stub
		    driver = new ChromeDriver();
		 
//	 String s  = new  String () ;
//	 StringBuilder s1  = new   	 StringBuilder () ;
//	 StringBuffer s2  =  new StringBuffer() ;	 
		    
		    
	        driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			
			driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
			
			
			driver.get("https://crio-qkart-frontend-qa.vercel.app/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
			 
			String  BASEURL = driver.getCurrentUrl();
			
			
			WebElement  privacypolicy = driver.findElement(By.xpath("//a[normalize-space()='Privacy policy']"));
			
			
			privacypolicy.click();
			
			
			
			
			//04 - Switch to the newly opened tab i.e Privacy policy 
	
//			   // Get the handles of all open windows or tabs
			   Set<String> windowHandles = driver.getWindowHandles();
			
			            // Switch to the newly opened tab (assuming there are only two tabs/windows)
			   driver.switchTo().window(windowHandles.toArray(new String[windowHandles.size()])[1]);
			//Switch to privacy policy 
//			           
			   
//			            // 05 - Check if the privacy policy content is available on the newly opened tab
			//
			           WebElement privacy_policy =driver.findElement(By.xpath("//h2[text()='Privacy Policy']"));
			
			           boolean status = privacy_policy.getText().equals("Privacy Policy");
			           
			           
			            if (!status) {
			            	System.out.println("Failure  # privacy policy");
			            }
			            windowHandles = driver.getWindowHandles(); 
			              System.out.println(windowHandles);
			            
			            
			//
//			           // 06 - Move back to the original tab (with QKart home page opened)
			           driver.switchTo().window(windowHandles.toArray(new String[windowHandles.size()])[0]);
			           // back to base window 
			 
//			           //07 - Click on the “Terms Of Service” page link in the footer
			//
			           driver.findElement(By.linkText("Terms of Service")).click();
			//
//			           // 08 - Verify that the url of the current tab does not change
			//
			           status = driver.getCurrentUrl().equals(BASEURL);
			       if (!status) {
		            	System.out.println("Failure  # erms of Service ");
			       }
			            
			//
			           // 09 - Switch to the newly opened tab
			           windowHandles = driver.getWindowHandles(); 
			           driver.switchTo().window(windowHandles.toArray(new String[windowHandles.size()])[2]);
			           
			           
//			            
			           System.out.println(windowHandles);
			          
			           
			           String url =driver.getCurrentUrl();
			           System.out.println(url);
			//
//			           // 10 - Check if the about us content is displayed on the newly opened tab
			//
//			           WebElement Terms_of_Service  =driver.findElement(By.xpath("//h2[text()='Terms of Service']"));
			//
//			           status = Terms_of_Service.getText().equals("Terms of Service");
//			            if (!status) {
//			            logStatus("Step Failure", "Verification is failing for Terms of Service content is available on the newly opened tab ",
//			                    status ? "PASS" : "FAIL");
//			                    return false;
//			            }
//			            
//			            // 11 - Close all the newly opened tabs and switch focus back to the original tab
			//
//			            for (String handle : windowHandles) {
//			                if (!handle.equals(driver.getWindowHandle())) {
//			                    driver.close();
//			                }else{
//			                   driver.switchTo().parentFrame();
//			                }
//			            }
			
			
			
			
			
			
			
			
			
		
	}

}

 