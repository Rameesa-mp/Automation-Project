package cheak_Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_page {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"section-header\"]/div[1]/div[2]/div/a")
	WebElement Home;
	
	@FindBy(xpath="//*[@id=\"section-header\"]/div[1]/div[1]/nav/ul/li[3]/a")
	WebElement BestSeller;
	
	@FindBy(xpath="//*[@id=\"shopify-section-collection-template\"]/section/div[3]/div[1]/div[2]/button[1]")
	WebElement Filter ;
	
	
	@FindBy(xpath="//*[@id=\"collection-filter-drawer\"]/div[2]/div/div[1]/div/div/ul/li[6]/button")
	WebElement size ;
	
	@FindBy(xpath="//*[@id=\"shopify-section-collection-template\"]/section/div[3]/div[1]/div[2]/button[2]")
	WebElement sort ;
	
	@FindBy(xpath="//*[@id=\"collection-sort-popover\"]/div/div/button[5]")
	WebElement price;
	
	@FindBy(xpath="//a[text()=\"Crew Tank\"]")
	WebElement prdct;
	
	@FindBy(xpath="//*[@id=\"product_form_9066892427481\"]/div[1]/div[1]/ul/li[2]/label")
	WebElement prdct_size;
	
	
	//button[text()=\"Apply\"]
	public Product_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	public void buttn_click() throws InterruptedException
	{
		Home.click();
		BestSeller.click();
	
		Filter.click();
		Thread.sleep(2000);
		size.click();
		
		Thread.sleep(2000);
		//Apply.click();
		
		sort.click();
		Thread.sleep(2000);
		price.click();
		
	}
	public void Select_product() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		prdct.click();
		Thread.sleep(2000);
		prdct_size.click();
		
	}
	
	
	
	
	
	

}
