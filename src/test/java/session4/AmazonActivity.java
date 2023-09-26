package session4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActivity {
	
	
	
	
	public static void main (String [] args)
	{
	try
    {   WebDriver driver = new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.get("https://www.amazon.in/");

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        //getting swearch box placeholder text
        String searchBox = search.getAttribute("placeholder");
        if(searchBox.equalsIgnoreCase("Search Amazon.in"))
        {
            System.out.println("Text Found --> " + searchBox);
        }
        else
        {
            System.out.println("No Text Found");
        }

        //checking search box
        search.sendKeys("laptop");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();

        List<WebElement> result = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span[1]"));

        for(int i=0; i<result.size(); i++)
        {
            if(result.get(i).getText().contains(" Laptop "))
            {
                System.out.println("Found Laptop in Search Result at position --> " + i);
                break;
            }
        }

        //Electronics
        WebElement electronics = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[9]"));
        actions.moveToElement(electronics).click(electronics).build().perform();
        
        if(driver.getCurrentUrl().contains("electronics"))
        {
            System.out.println("Found Electronics and navigated to it");
        }
        else
        {
            System.out.println("Not found Electronics");
        }
    }
    catch(Exception e)
    {
        System.out.println("EXCEPTION -->" + e);
    }

	}
}
 