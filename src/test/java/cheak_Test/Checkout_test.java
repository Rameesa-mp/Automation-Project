package cheak_Test;

import org.testng.annotations.Test;

import cheak_Base.Base_class;
import cheak_Page.Cart_page;
import cheak_Page.Checkout_page;
import cheak_Page.Login_page;
import cheak_Page.Product_page;

public class Checkout_test extends Base_class{
	
	@Test
	public void Checkout() throws InterruptedException
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
	
		Checkout_page chk=new Checkout_page(driver);
		chk.Pass_Information("medammal", "house", "tirur", "676105","9890989078");
		chk.Countinue_button();
		
	
		
	}
	
	
	

}
