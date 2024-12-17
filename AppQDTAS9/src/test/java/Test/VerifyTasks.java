package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Pom.Task;
import utility.base;
import utility.exceldataprovider;

public class VerifyTasks extends base {

	 @Test
      public void ADDTASKS() throws IOException, InterruptedException
      {  
       
        Task T1 = new Task(driver);
        exceldataprovider e= new exceldataprovider();
        e.getData();
  	  
  	    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
  	    Thread.sleep(1000);
  	    T1.Entertasks();
  	    
 	    
  	    String data6 = e.getStringData("sheet3", 6, 0);
		T1.EnterTaskName(data6);
		Thread.sleep(1000);          //[Positive case]
  	    
//  	    String data6 = e.getStringData("sheet3", 6, 1);
//		T1.EnterTaskName(data6);
//		Thread.sleep(1000);          //[Negative case]
		
		
		
		String data8 = e.getStringData("sheet3", 8, 0);
		T1.EnterDescription(data8);
		Thread.sleep(1000);          //[Positive case]
		
//		String data8 = e.getStringData("sheet3", 8, 1);
//		T1.EnterDescription(data8);
//		Thread.sleep(1000);            //[Negative case]
		
		
//		
		String data9 = e.getStringData("sheet3", 9, 0);
		T1.EnterAssignee(data9);
		Thread.sleep(1000);           //[Positive case]
		
		
		
//		String data9 = e.getStringData("sheet3", 9, 1);
//		T1.EnterAssignee(data9);
//		Thread.sleep(1000);          
//		
		
	
		
		double data7 = e.getNumericData("sheet3", 7, 0);
		T1.EnterDueDate(data7);
		Thread.sleep(1000);
		
		String data10 = e.getStringData("sheet3", 10, 0);
		T1.EnterAssignedTo(data10);
		Thread.sleep(1000);
		
		T1.ClickonSubmit();
		Thread.sleep(1000); 
		
		T1.ClickonReset();
		Thread.sleep(1000);
		
//		JavascriptExecutor j  =  (JavascriptExecutor)driver;
//        j.executeScript("window.scrollBy(0,1000)");
//        Thread.sleep(2000);
//		
//        double data11 = e.getNumericData("sheet3", 11, 0);
//     	T1.EnterUserID(data11);
//     	Thread.sleep(1000);
//     	
//     	JavascriptExecutor j1  =  (JavascriptExecutor)driver;
//        j.executeScript("window.scrollBy(0,1000)");
//        Thread.sleep(2000);
//     	
//     	T1.ClickonFetchTasks();
//		Thread.sleep(1000); 
		
		T1.ClickOnImage();
		//Thread.sleep(1000);
		
		T1.ClickOnLogout();
		Thread.sleep(1000);
     	
     	
		

      }
}





