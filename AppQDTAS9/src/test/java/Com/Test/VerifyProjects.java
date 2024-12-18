package Com.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.Projects;

import utility.base;
import utility.exceldataprovider;

public class VerifyProjects extends base {
	
@Test
      public void addprojects() throws IOException, InterruptedException 
	{
		
	
      Projects P1 = new Projects(driver);
	  exceldataprovider e= new exceldataprovider();
	  e.getData();
	  
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	  Thread.sleep(1000);
	  P1.Enterprojects();
	  

		String data = e.getStringData("sheet3", 0, 0);
		P1.EnterprojectName(data);
		Thread.sleep(1000);    //[Positive case]
		
	  
//	    String data = e.getStringData("sheet3", 0, 2);
//		P1.EnterprojectName(data);
//		Thread.sleep(2000);     //[Negative case]
		
		
		
		String data1 = e.getStringData("sheet3", 1, 0);
		P1.Enterclient(data1);
		Thread.sleep(2000);    //[Positive case]
		
//		String data1 = e.getStringData("sheet3", 1, 2);
//		P1.Enterclient(data1);
//		Thread.sleep(2000);       //[Negative case]
		
		
		
		String data3 = e.getStringData("sheet3", 3, 0);
		P1.Enterstatus(data3);
		Thread.sleep(2000);
		
		
		
		String data2 = e.getStringData("sheet3", 2, 0);
		P1.Enterdescripition(data2);
		Thread.sleep(2000);          //[Positive case]
		

//        String data2 = e.getStringData("sheet3", 2, 2);
//		P1.Enterdescripition(data2);
//		Thread.sleep(2000);         //[Negative case]
		
		
		
		
//		
//		//String data = e.getStringData("sheet3", 3, 0);
//		//Thread.sleep(3000);
//		P1.Enterteams();
//		
//		
//		WebElement S = driver.findElement(By.xpath("/html/body/app-root/app-projects/div/main/div/div/div[1]/div/form/div/div[2]/div[2]/ng-multiselect-dropdown/div/div[2]"));
//		Select s = new Select(S);
//		s.selectByIndex(0);
//		Thread.sleep(2000);
//		
//		String data = e.getStringData("sheet3", 4, 0);
//		P1.Enterselectmanagers(data);
//		Thread.sleep(1000);
		
		String data5= e.getStringData("sheet3", 3, 0);
		P1.Enterstatus(data5);
		Thread.sleep(2000);      // [positive case]
		
//		P1.Enterstatus(data3);
//		Thread.sleep(1000);
		
		String data6 = e.getStringData("sheet3", 4, 0);
		P1.Entertype(data6);
		Thread.sleep(2000);         //[Positive case]
		
//		double data6 = e.getNumericData("sheet3", 4, 2);
//		P1.Entertype(data6);
//		Thread.sleep(2000);         //[Negative case]
		
		
		
		P1.ClickonSubmit();
		Thread.sleep(2000); 
		
	    P1.ClickonReset();
		Thread.sleep(2000);
		
		JavascriptExecutor j  =  (JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        
//        String data7 = e.getStringData("sheet3", 5, 0);
//		P1.EnterSearchBar(data7);
//		Thread.sleep(2000);         //[Search client name 'INDIA']
//		
		 String data7 = e.getStringData("sheet3", 5, 2);
		 P1.EnterSearchBar(data7);
		 Thread.sleep(2000);        //[Search project name 'AMAZON']
			
//		 String data7 = e.getStringData("sheet3", 5, 3);
//		 P1.EnterSearchBar(data7);
//		 Thread.sleep(2000);        //[Search Status 'COMPLETED']
		
		P1.ClickonView();
		Thread.sleep(1000); 
		
		P1.Clickonclose();
		Thread.sleep(1000); 
		
		P1.ClickonAdd();
		Thread.sleep(1000); 
		
		
		
		P1.Clickonlakshmiappikatla();
		Thread.sleep(1000);
		
//		P1.Clickonadminuser();
//		Thread.sleep(2000); 
//		
//		P1.ClickonSelectAll();
//		Thread.sleep(2000);
		
//		P1.Clickonabvstd();
//		Thread.sleep(1000);
		
		JavascriptExecutor  j1  =  (JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        
        P1.Clickonadminuser();
		Thread.sleep(1000); 
		
		P1.ClickonSubmit1();
		Thread.sleep(1000); 
	
	    P1.ClickonReset1();
		Thread.sleep(1000);
		
		
        
        
		
		
		
	  
	  
}
	
}
