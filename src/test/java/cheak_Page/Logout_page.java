package cheak_Page;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout_page {

	WebDriver driver;
	WebDriver Wait;
	@FindBy(xpath="//*[@id=\"section-header\"]/div[1]/div[3]/a[1]")
	WebElement acct ;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	WebElement logout;
	

	public Logout_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}

	public void Logout() throws InterruptedException
	{
		
		acct.click();
		/*Thread.sleep(60000);
		WebElement logout = driver.findElement(By.id("//a[text()=\"Logout\"]"));           
		Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(2));  
		wait.until(ExpectedConditions.elementToBeClickable(logout));*/
		
	}
	
	public void Bug_Analysis() throws IOException {
		
		//FullScreen Screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\automation\\selenium\\eclipse\\com.luminar.cheak\\Bug_report\\Accont.png"));
		//Single element Screenshot
		WebElement btn=driver.findElement(By.xpath("//a[text()=\"Logout\"]"));
		File button=btn.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(button,new File("C:\\automation\\selenium\\eclipse\\com.luminar.cheak\\Bug_report\\Logout.png"));
	}
	
	
	
	
	
	
}
