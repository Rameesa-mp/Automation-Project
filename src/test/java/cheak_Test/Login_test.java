package cheak_Test;

import org.testng.annotations.Test;
import cheak_Base.Base_class;
import cheak_Page.Login_page;
import cheak_util.Excelutils;

public class Login_test extends Base_class{
	@Test
	
public void verifyLoginWithValidcred() throws InterruptedException {
		
		Login_page lp=new Login_page(driver);
		lp.bttn_click();
		
		String xl="C:\\automation\\selenium\\Cheak_Login.xlsx";
		String sheet="sheet1";
		int rowCount=Excelutils.getRowCount(xl, sheet);
		System.out.println(rowCount);
		
	
	for (int i=1;i<=rowCount;i++) {
		
		int cellCount=Excelutils.getCellCount(xl, sheet, i);
		System.out.println("cell count:"+cellCount);
		
		for(int j=0;j<cellCount;j+=2) {
			
			String userName=Excelutils.getCellValue(xl, sheet, i, j);
			System.out.println("Username :"+userName);
			  
			String pswd=Excelutils.getCellValue(xl, sheet, i, j+1);
			System.out.println("Password :"+pswd);
			
			lp.SetValues(userName, pswd);
	
			lp.button_click();
		
			Thread.sleep(1000);

			String actualurl="https://cheak.com/account";
			String expctdurl="https://cheak.com/account";
			if(actualurl.equals(expctdurl)) 
			{
				System.out.println("URL Logged in successfull");
				break;
			}
			else {
				System.out.println("URL Log in fail");
				driver.get("https://cheak.com/account/login");
			}	
		
		
		}
		
}
	
	
	}
	
	}
