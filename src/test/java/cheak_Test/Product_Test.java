package cheak_Test;

import org.testng.annotations.Test;

import cheak_Base.Base_class;
import cheak_Page.Login_page;
import cheak_Page.Product_page;

public class Product_Test extends Base_class{
@Test
	public void Product() throws InterruptedException {
		
		Login_page lp=new Login_page(driver);
		lp.bttn_click();
		lp.SetValues("mpr2354@gmail.com", "beevi1234");
		lp.button_click();
		Product_page prdct=new Product_page(driver);
		prdct.buttn_click();
		Thread.sleep(2000);
		prdct.Select_product();
		Thread.sleep(2000);
		
	}
	
	
}
