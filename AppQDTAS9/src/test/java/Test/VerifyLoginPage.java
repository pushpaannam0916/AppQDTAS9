package Test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.interactions.Action;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


import Pom.loginPage;
import utility.base;
import utility.exceldataprovider;

public class VerifyLoginPage extends base {
	@Test
	public void loginpage() throws IOException, InterruptedException {

		loginPage lp = new loginPage(driver);
		
		exceldataprovider e = new exceldataprovider(); 
	    e.getData();
		
		  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		  String EmailId = e.getStringData("Sheet1", 0, 0); 
		  lp.EnterEmailID(EmailId);
		  
		  String PassWord = e.getStringData("Sheet1", 1, 0);
		  lp.EnterPassword(PassWord); 
		  Thread.sleep(1000);
		  
		  lp.ClickonSubmit();
		  Thread.sleep(2000);   
		  
		
	}
	
	
	
	
	
	
	
	
	
}
