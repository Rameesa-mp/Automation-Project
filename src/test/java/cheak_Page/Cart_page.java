package cheak_Page;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
	
	WebDriver driver;
	@FindBy(xpath="//span[text()=\"Add To Cart\"]")
	WebElement addcart ;
	
	@FindBy(xpath="//button[contains(text(),\"Checkout\")]")
	WebElement checkout ;
	

	public Cart_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void buttn_click() throws InterruptedException
	{
		
		addcart.click();
		Thread.sleep(2000);
		
	}
	public void checkout() throws InterruptedException {
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//WebElement ele=driver.findElement(By.xpath("/button[contains(text(),\\\"Checkout\\\")]"));
		//js.executeScript("arguments[0].scrollIntoView(true);",ele);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(4000);
		checkout.click();
	}
	
}
