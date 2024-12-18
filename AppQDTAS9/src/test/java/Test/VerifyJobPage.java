package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pom.JobPage;
import utility.base;
import utility.exceldataprovider;

public class VerifyJobPage extends base {
 
	
	@Test
	
	public void JOB() throws IOException,InterruptedException
	{
		
	JobPage J = new JobPage(driver);
	exceldataprovider e = new exceldataprovider();
	e.getData();
	
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	Thread.sleep(5000);
	
	J.ClickonJOBBUTTON();
	Thread.sleep(3000);
	
	J.JobTitle();
	Thread.sleep(3000);
	
	J.ClickonADDBUTTON();
	Thread.sleep(3000);
	
//	String JobTitleName = e.getStringData("Sheet4", 0, 0);
//	J.JobTitleName();
//	Thread.sleep(3000);
//	                       mine
//	String JobDescription = e.getStringData("Sheet4", 1, 0);
//	J.JobDescription();
//	Thread.sleep(3000);

	
	String JobTitleName = e.getStringData("Sheet4", 0, 0);
	Thread.sleep(3000);       // POSITIVE CASE
	
//	String JobTitleName = e.getStringData("Sheet4", 0, 1);
//	Thread.sleep(3000);       //NEGATIVE CASE
	
	
	
	String JobDescription = e.getStringData("Sheet4", 1, 0);
	Thread.sleep(3000);       //POSITIVE CASE
	
	
//	String JobDescription = e.getStringData("Sheet4", 1, 1);
//	Thread.sleep(3000);       //NEGATIVECASE
	
	
	J.enterDetails(JobTitleName, JobDescription);
	
	J.ClickonSubmit();
	Thread.sleep(3000); 
	
	J.ClickonReset();
	Thread.sleep(3000); 
	
	 JavascriptExecutor   j  =  (JavascriptExecutor)driver;
     j.executeScript("window.scrollBy(0,1000)");
     Thread.sleep(3000);
     
//     String data4 = e.getStringData("sheet4", 2, 0);
//     j.EnterSearch(data4);
//     Thread.sleep(1000); 
//	
	
	
	
	}
	
}
