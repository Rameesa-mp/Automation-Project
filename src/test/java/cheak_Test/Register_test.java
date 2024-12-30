package cheak_Test;

import org.testng.annotations.Test;
import cheak_Base.Base_class;
import cheak_Page.Register_page;
import cheak_util.Excelutils;

public class Register_test extends Base_class

{
@Test

public void Register_Account() throws InterruptedException {
		
		Register_page Rp=new Register_page(driver);
		Rp.buttn_click();
		
		String xl="C:\\automation\\selenium\\cheak_Register.xlsx";
		String sheet="sheet1";
		int rowCount=Excelutils.getRowCount(xl, sheet);
		System.out.println(rowCount);
		
		for (int i=1;i<=rowCount;i++)
		{
			int cellCount=Excelutils.getCellCount(xl, sheet, i);
			
		for(int j=0;j<cellCount;j+=4) 
		{
			String FsName=Excelutils.getCellValue(xl, sheet, i, j);
			System.out.println("FirstName :"+FsName);
				  
			String LsName=Excelutils.getCellValue(xl, sheet, i, j+1);
			System.out.println("LastName :"+LsName);
				
			String email =Excelutils.getCellValue(xl, sheet, i, j+2);
			System.out.println("Email-id :"+email);
			
			String Password=Excelutils.getCellValue(xl, sheet, i, j+3);
			System.out.println("Password :"+Password);
			
			Rp.SetValues(FsName, LsName, email, Password);
			
			Thread.sleep(1000);
			
			Rp.Register();
			
			Thread.sleep(1000);
			
			driver.get("https://cheak.com/account/register");
		}
     }		
	}
	
	
	
	
	
	

}
