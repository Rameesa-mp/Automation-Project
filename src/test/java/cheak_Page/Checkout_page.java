package cheak_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkout_page {
	WebDriver driver;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="address2")
	WebElement address2;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="postalCode")
	WebElement postalCode;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(id="basic-ShopBack: Get Cashback with every payment")
	WebElement cash;
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div[2]/button[2]/div")
	WebElement alerts ;
	
	@FindBy(name="billingAddress")
	WebElement bill ;
	
	@FindBy(xpath="//*[@id=\"checkout-pay-button\"]")
	WebElement pay ;
	
	@FindBy(xpath="/html/body/main/div/header/button[1]")
	WebElement back;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/header/div/div/div/div/div/div[2]/div/span/a")
	WebElement Home;
	
	

	public Checkout_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	
	
	public void Pass_Information(String add1,String add2,String cit,String post,String ph) throws InterruptedException
	{
		address.sendKeys(add1);
		address2.sendKeys(add2);
		city.sendKeys(cit);
		Select state=new Select(driver.findElement(By.name("zone")));
		state.selectByVisibleText("Kerala");;
		postalCode.sendKeys(post);
		phone.sendKeys(ph);
		Thread.sleep(5000);
	}
		
/*	public void payment(String cardn,String exp,String code) throws InterruptedException
	{
		
		cardnumber.sendKeys(cardn);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"expiry\"]"));
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		ele.sendKeys(exp);
		Scode.sendKeys(code);
		
	}
	*/
	
	public void Countinue_button() throws InterruptedException
	
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		pay.click();
		bill.click();
		Thread.sleep(5000);
		cash.click();
		Thread.sleep(5000);
		pay.click();
		Thread.sleep(5000);
		back.click();
		Thread.sleep(5000);
		alerts.click();
		Thread.sleep(8000);
		Home.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
