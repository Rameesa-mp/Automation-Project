package cheak_Test;

import org.testng.annotations.Test;

import cheak_Base.Base_class;
import cheak_Page.Cart_page;
import cheak_Page.Login_page;
import cheak_Page.Product_page;

public class Cart_Test extends Base_class {
@Test
	public void Cart() throws InterruptedException
	{
		Login_page lp=new Login_page(driver);
		lp.bttn_click();
		lp.SetValues("mpr2354@gmail.com", "beevi1234");
		lp.button_click();
		
		Product_page prdct=new Product_page(driver);
		prdct.buttn_click();
		
		prdct.Select_product();
		
	
		Cart_page cart=new Cart_page(driver);
		cart.buttn_click();
		cart.checkout();
	
	
	
	}
	
}



