package cheak_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base_class {
	
	public static WebDriver driver;
	public String Url ="https://cheak.com";
	
	@BeforeTest
	public void setup() throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	
	
	}
	
	
	
	

}
