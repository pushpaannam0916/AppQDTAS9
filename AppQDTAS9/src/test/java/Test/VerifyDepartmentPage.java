package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pom.Department;
import utility.base;
import utility.exceldataprovider;

public class VerifyDepartmentPage extends base {
	
	

	@Test
	
	public void AddDeparartment() throws IOException,InterruptedException
	{
	
	Department D1 = new Department(driver);
	exceldataprovider e = new exceldataprovider();
	
	
    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	Thread.sleep(5000);
    D1.Enterdepartment();
	
	
//	String data = e.getStringData("sheet1", 4, 0);
//	D1.EnterDepartmentName(data);
//	Thread.sleep(3000);   //POSITIVE CASE
    
    
//    String data = e.getStringData("sheet1", 4, 1);
//	D1.EnterDepartmentName(data);
//	Thread.sleep(3000);      // NEGATIVE CASE
//    
    
    
    JavascriptExecutor j = (JavascriptExecutor)driver;
    j.executeScript("window.scrollBy(0, 1000");
    Thread.sleep(2000);
    
    
    
    String data1 = e.getStringData("sheet1", 5, 0);
    D1.ClickonSearch(data1);
	Thread.sleep(2000);

	}
}
	

	