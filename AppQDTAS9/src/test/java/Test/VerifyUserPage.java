package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Pom.AddUserPage;
import utility.base;
import utility.exceldataprovider;

public class VerifyUserPage extends base{
	@Test
	public void adduser() throws IOException, InterruptedException {
		
		AddUserPage user1 = new AddUserPage(driver);
		//AddUserPage user = new AddUserPage(driver);
		exceldataprovider e = new exceldataprovider();
		e.getData();
	
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		Thread.sleep(2000);
		user1.AddUser();
		
		user1.ClickonAddButton();
		Thread.sleep(2000);
//		
		String data = e.getStringData("sheet2", 0, 0);
		user1.EnterUserName(data);
		Thread.sleep(1000);
		
		String data1 = e.getStringData("sheet2", 1, 0);
		user1.EnterEmail(data1);
		Thread.sleep(1000);         //[POSITIVE CASE]
		
//		String data1 = e.getStringData("sheet2", 1, 2);
//		user1.EnterEmail(data1);
//		Thread.sleep(1000);         //[NEGATIVE CASE]
		
		
		
		String data2 = e.getStringData("sheet2", 2, 0);
		user1.Enterfirstname(data2);
		Thread.sleep(1000);           //[positive case]
		
//		String data2 = e.getStringData("sheet2", 2, 2);
//		user1.Enterfirstname(data2);
//		Thread.sleep(1000);           //[Negative case]
//		
//		
//		
		String data3 = e.getStringData("sheet2", 3, 0);
		user1.Entermiddlename(data3);
		Thread.sleep(1000);
		
		String data4 = e.getStringData("sheet2", 4, 0);
		user1.Enterlastname(data4);
		Thread.sleep(1000);          //[positive case]
//		
////		String data4 = e.getStringData("sheet2", 4, 2);
////		user1.Enterlastname(data4);
////		Thread.sleep(1000);          //[Negative case]
//		
//		
//		
		double data5 = e.getNumericData("sheet2", 5, 0);
		user1.Enterdataofbirth(data5);
		Thread.sleep(1000);
		
		String data6 = e.getStringData("sheet2", 6, 0);
		user1.EnterPassword(data6);
		Thread.sleep(1000);
		
		String data7 = e.getStringData("sheet2", 7, 0);
		user1.Enterconfirmpassword(data7);
//		Thread.sleep(1000);
////		
		String data8 = e.getStringData("sheet2", 8, 0);
		user1.EnterGender(data8);
		Thread.sleep(1000);
		
		double data9 = e.getNumericData("sheet2", 9, 0);
     	user1.EnterPhonenumber(data9);
     	Thread.sleep(1000);             //[positive case]
		
//		double data9 = e.getNumericData("sheet2", 9, 2);
//     	user1.EnterPhonenumber(data9);
//     	Thread.sleep(1000);            //[Negative case]
     	
    	
//      String department = e.getStringData("sheet2", 10, 0);
//      Add.enterDetails(department);
     	
        String data10 = e.getStringData("sheet2", 10, 0);
		user1.Enterdepartment(data10);
		Thread.sleep(1000);
//		
		String data11 = e.getStringData("sheet2", 11, 0);
		user1.Enterrole(data11);
		Thread.sleep(1000);
		
		String data12 = e.getStringData("sheet2", 12, 0);
		user1.EnterJobcategoryid(data12);
		Thread.sleep(1000);
//		
		String data13 = e.getStringData("sheet2", 13, 0);
		user1.EnteremploymentStatusId(data13);
		Thread.sleep(1000);
		
		String data14 = e.getStringData("sheet2", 14, 0);
		user1.EnterjobId(data14);
		Thread.sleep(1000);
		
//		
		String data15 = e.getStringData("sheet2", 15, 0);
		user1.Enteraddress(data15);
		Thread.sleep(1000);          //[Positive case]
		
//    
//		user1.Enteraddress();
//		Thread.sleep(3000);           //[Negative case]
		
		String data16 = e.getStringData("sheet2", 16, 0);
		user1.EntersubRole(data16);
		Thread.sleep(1000);           //[Positive case]
		
//		String data16 = e.getStringData("sheet2", 16, 2);
//		user1.EntersubRole(data16);
//		Thread.sleep(1000);           //[Negative case]
//		
	
		user1.ClickonSubmit();
		Thread.sleep(3000); 
	
        user1.ClickonReset();
        Thread.sleep(1000);
        
      JavascriptExecutor j =(JavascriptExecutor)driver;
      j.executeScript("window.scrollBy(0,1000)");
      Thread.sleep(2000);
//        
//      double data18 = e.getNumericData("sheet2", 18, 0);
//      user1.EnterSearch(data18);
//      Thread.sleep(1000);           //37
      
     
      
//      String data18 = e.getStringData("sheet2", 18, 1);
//	  user1.EnterSearch(data18);
//	  Thread.sleep(1000);            // pushlakshmi
     
      
      
      
//      String data18 = e.getStringData("sheet2", 18, 2);
//	  user1.EnterSearch(data18);
//	  Thread.sleep(1000);            // Lakshmi annam appikatla
	  
//	  user1.ClickonUsername();
//      Thread.sleep(1000);
      
      
      
//      String data18 = e.getStringData("sheet2", 18, 2); 
//      user1.EnterSearchName(data18);
//      Thread.sleep(1000);            // lakshmi annam appikatla by inspecting Name
	  
	   double data18 = e.getNumericData("sheet2", 18, 3);
	   user1.EnterSearch(data18);
	   Thread.sleep(2000);             // SEARCH BY PHONE NO 
	   
	   user1.ClickonUsername();
	   Thread.sleep(2000);
//	   
//	   user1.Clickonname();
//	   Thread.sleep(2000);
	   
//	   user1.ClickonEnabled();
//	   Thread.sleep(1000);
//   
//	   user1.ClickonNo();
//	   Thread.sleep(1000);
	   
	   
	   
//	   user1.ClickonEXTC();
//       Thread.sleep(1000);
      

	   
       user1.ClickonEdit();       // after clicking on extc the profile page opens where edit works
	   Thread.sleep(1000);
//	   
	   user1.ClickOnSelect();
	   Thread.sleep(2000);
	   
	      JavascriptExecutor j1 =(JavascriptExecutor)driver;
	      j.executeScript("window.scrollBy(0,1000)");
	      Thread.sleep(2000);
	   
	   
//	     user1.ClickOnGender();
//		 Thread.sleep(1000);
	   
	   Actions act = new Actions(driver);    //2 3  
	   for(int i=1;i<=3;i++) 
	   {                                                            //ARROW DOWN METHOD FOR SELECT FIRST NAME
	   act.sendKeys(Keys.ARROW_DOWN).build().perform();
	   Thread.sleep(1000);
	   }
	   
        act.sendKeys(Keys.ENTER).build().perform();               // Drop down method for  click on first name
        
        String data21 = e.getStringData("sheet2", 21, 0);
 	   user1.EnterFirstName1(data21);
 	   Thread.sleep(1000);
 	   
 	  user1.ClickonSubmit1();
	   Thread.sleep(2000);
	
	   
	   
   
	   
	   
	   
		
//		 user1.ClickonDelete();
//       Thread.sleep(1000);
//       
//       user1.ClickonYes();
//       Thread.sleep(1000);
		
		

		
		
	}


	

}

