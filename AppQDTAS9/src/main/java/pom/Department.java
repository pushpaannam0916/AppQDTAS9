package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




	public class Department {
		
//		   @FindBy(xpath="/html/body/app-root/app-department/div/main/app-sidenav/div/mat-nav-list/a[8]/span/span/mat-icon")
//		   private WebElement AddDepar;
		   
		   @FindBy(linkText="group")
		   private WebElement ADDDEPARTMENT;
		   
//		   @FindBy(name="deptName")
//		   private WebElement DEPARTMENT;
//		   
//		   @FindBy(xpath="//button[@type='text']")  
//		   private WebElement Text;
		   
//		   @FindBy(xpath="/html/body/app-root/app-department/div/div/div[1]/div/form/div/div[1]/div/input")
//		   private WebElement DEPARTMENTNAME;
		   
//		   @FindBy(linkText="Department Name")
//		   private WebElement DEPARTMENTNAME;
		   
//		   @FindBy(xpath="/html/body/app-root/app-department/div/div/div[2]/div/div/form/input")
//		   private WebElement SEARCH;
		   
		   @FindBy(linkText="Department Name")
		   private WebElement SEARCH;

		   
		   
		 public Department(WebDriver driver) 
		 {
			 PageFactory.initElements(driver, this);
			 
		 }
		 
		 public void Enterdepartment()
		 {
			 ADDDEPARTMENT.click();
		 }
		 

		 
//		 public void EnterDepartmentName(String Department)
//		 {
//			 DEPARTMENT.sendKeys(Department);
//		 }
		 
          
		 public void EnterSearch(String DepartmentName)
		 {
			 SEARCH.sendKeys(DepartmentName);
		 }
		 
		 

	    

		public void ClickonSearch(String data1) {
			// TODO Auto-generated method stub
			
		}
		
		   
	}
	
	
	

