package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task {

     //@FindBy(xpath="/html/body/app-root/app-tasks/div/main/app-sidenav/div/mat-nav-list/a[7]/span/span/mat-icon")
     // private WebElement TASKS;
     
      @FindBy(linkText="task")
      private WebElement ADDTASKS;
      
      @FindBy(id="name")
      private WebElement NAME;
      
//     @FindBy(linkText="name")
//     private WebElement NAME;
      
       @FindBy(id="dueDate")
       private WebElement DUEDATE;
      
       @FindBy(id="description")
       private WebElement DESCRIPTION;
       
//      @FindBy(xpath="/html/body/app-root/app-tasks/div/main/div/div[1]/div/form/div/div[2]/div[1]/input")
//      private WebElement DESCRIPTION;  (This is also working)
       
//       @FindBy(xpath="/html/body/app-root/app-tasks/div/main/div/div[1]/div/form/div/div[2]/div[2]/select")
//       private WebElement ASSIGNEE;
       
       @FindBy(name="assignee")
       private WebElement ASSIGNEE;
       
       @FindBy(id="empId")
       private WebElement ASSIGNEDTO;
       
      @FindBy(id="sub")
       private WebElement SUBMIT;
      
      
       
//      @FindBy(xpath="/html/body/app-root/app-tasks/div/main/div/div[1]/div/form/div/div[4]/div/button[2]")  
//      private WebElement SUBMIT;
       
      //@FindBy(linkText="Submit")
      //private WebElement SUBMIT;
        
//        @FindBy(linkText="Reset")
//        private WebElement RESET;
      
         @FindBy(xpath="/html/body/app-root/app-tasks/div/main/div/div[1]/div/form/div/div[4]/div/button[1]")
         private WebElement RESET;
         
         
        @FindBy(id="userIdInput")
        private WebElement USERID;
        
        
        @FindBy(xpath="/html/body/app-root/app-tasks/div/main/div/div[2]/button")
        private WebElement FETCHBUTTON;
        
//       @FindBy(linkText="Fetch Tasks")
//       private WebElement FETCHBUTTON;
        
        @FindBy(xpath="/html/body/app-root/app-tasks/div/app-header/mat-toolbar/mat-toolbar-row/div/button/img")
        private WebElement IMAGEICON;
        
        @FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/button[2]/span")
        private WebElement LOGOUT;
        
      
        
        
    public Task (WebDriver driver)
	{
	    PageFactory.initElements(driver, this);
	}
     
     public void Entertasks()
     {
    	 ADDTASKS.click(); 
     }
     
     public void  EnterTaskName(String Name)
     {
 	        NAME.sendKeys(Name);
     }
     
     public void  EnterDueDate(double date)
     {
 	        DUEDATE.sendKeys( "16-11-1993");
 	       
     }
     
     public void EnterDescription(String Desc)
     {
    	  DESCRIPTION.sendKeys(Desc);
     }
     
     public void EnterAssignee(String Assignee)
     {
    	 ASSIGNEE.sendKeys(Assignee);
     }
     
//     public void ClickonAssignee()
//   {
//   	 ASSIGNEE.click();
//   }
     
     public void EnterAssignedTo(String AssignedTo)
     {
    	 ASSIGNEDTO.sendKeys(AssignedTo);
    	 
     }
     
     public void ClickonSubmit() 
 	 {
 		SUBMIT.click();
 	 }

 	
     
      public void ClickonReset()
      {
 	      RESET.click();
      } 
   
    
     
     public void EnterUserID(double UserID) 
     {
 		USERID.sendKeys("8");
 	}
     
     public void ClickonFetchTasks()
     {
	      FETCHBUTTON.click();
     }
     
     public void ClickOnImage()
     {
    	 IMAGEICON.click();
     }
      
     public void ClickOnLogout()
     {
    	 LOGOUT.click();
     }

	
	}
    
     
    

