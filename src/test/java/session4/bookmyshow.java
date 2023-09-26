package session4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bookmyshow {

	public static void main(String[] args) {
		WebDriver driver ;
		
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.chrome.driver","D:\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe" );
		 ChromeOptions option = new ChromeOptions();
		 option.setBinary("D:\\Software\\Chrome\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		driver=new ChromeDriver(option);
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		
	}

}
