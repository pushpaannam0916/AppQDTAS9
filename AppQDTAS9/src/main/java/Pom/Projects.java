package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Projects {

	  // @FindBy(xpath="/html/body/app-root/app-projects/div/main/app-sidenav/div/mat-nav-list/a[6]/span/span/mat-icon")
	  // private WebElement ADDPROJECTS;
	   
	   @FindBy(linkText="assessment")
	   private WebElement PROJECTS;
	   
	   @FindBy(id="projectName")
	   private WebElement PROJECTNAME;
	   
	   @FindBy(id="client")
	   private WebElement CLIENT;
	   
	   @FindBy(id="description")
	   private WebElement DESCRIPTION;
	   
//	   @FindBy(xpath= "/html/body/app-root/app-projects/div/main/div/div/div[1]/div/form/div/div[2]/div[2]/ng-multiselect-dropdown/div/div[1]/span")
//	   private WebElement TEAMS;
//	   
//	   @FindBy( xpath="//select[@name='TEAMS']")
//	   private WebElement TEAMS;
//	   
//	   
//	   
//	   @FindBy(xpath="/html/body/app-root/app-projects/div/main/div/div/div[1]/div/form/div/div[3]/div[1]/ng-multiselect-dropdown/div/div[1]/span")
//	   private WebElement SELECTMANAGERS;
	   
	   @FindBy(id="status")
	   private  WebElement STATUS;
	   
	   @FindBy(id="type")
	   private WebElement TYPE;
	   
//	   @FindBy(xpath="//button[@type='submit']")  
//	   private WebElement Submit;
	   
//	   @FindBy(linkText="Submit")  
//	   private WebElement SUBMIT;
	   
	   @FindBy(id="sub")
	   private WebElement SUBMIT;
	   
	   
	   
//	    @FindBy(xpath="//button[@type='reset']")  
//	   private WebElement   Reset;
	   
//	   @FindBy(xpath="//button")  
//	   private WebElement   Reset;
	   
	   @FindBy(xpath="/html/body/app-root/app-projects/div/main/div/div/div[1]/div/form/div/div[4]/div[1]/button[1]")  
	   private WebElement RESET;
	   
       @FindBy(id="myInput")
       private WebElement SEARCHBAR;
       
//       @FindBy(xpath="/html/body/app-root/app-projects/div/main/div/div/div[2]/div/form/div[1]/table/thead/tr/th[1]")
//       private WebElement SEARCHBAR;
       
//       @FindBy(linkText="View")
//       private WebElement VIEWBUTTON;
       
       @FindBy(xpath="/html/body/app-root/app-projects/div/main/div/div/div[2]/div/form/div[1]/table/tbody/tr[1]/td[3]/div/button[1]/span[2]")
	   private WebElement VIEWBUTTON;
       
       @FindBy(xpath="/html/body/div/div[2]/div/mat-dialog-container/div/div/app-managerandteamdetails/div[3]/mat-dialog-actions/button/span[2]")
       private WebElement CLOSEBUTTON;
       
       @FindBy(xpath="/html/body/app-root/app-projects/div/main/div/div/div[2]/div/form/div[1]/table/tbody/tr[1]/td[3]/div/button[2]/span[2]")
       private WebElement ADDBUTTON;
       
       @FindBy(xpath="/html/body/app-root/app-teams-form-component/div/main/div/div/div/form/div[1]/div[8]/label/input")
       private WebElement LAKSHMIAPPIKATLA;  //click on check box     // working
       
       
//       @FindBy(linkText="checkbox")
//       private WebElement ADMINUSER;  // not working
       
//       @FindBy(xpath="/html/body/app-root/app-teams-form-component/div/main/div/div/div/form/div[1]/label")
//       private WebElement SELECTALL;   // click on selectall  //working
       
//       @FindBy(xpath="/html/body/app-root/app-teams-form-component/div/main/div/div/div/form/div[1]/div[13]/label")
//       private WebElement ABVSTD;       //click on abvstd     //working
//       
       @FindBy(id="sub")
	   private WebElement SUBMIT1;
       
       @FindBy(xpath="/html/body/app-root/app-teams-form-component/div/main/div/div/div/form/div[2]/div/button[1]")  
	   private WebElement RESET1;
//       
       
       
	   
	   public Projects(WebDriver driver)
		{
		   
		                                             
			PageFactory.initElements(driver, this);
		}
		
		
	   public void  Enterprojects()
	    {
		        PROJECTS.click();
	    }
	
	   public void  EnterprojectName(String projectName)
    {
	        PROJECTNAME.sendKeys( projectName);
    }
  
	   public void Enterclient(String client)
	{
		        CLIENT.sendKeys(client);
    }
    
       public void Enterdescripition(String descripition)
     {
	       DESCRIPTION.sendKeys(descripition);
     }

    
//	  public void Enterteams()
//    {
//	        TEAMS.click();
//     }
//
//   
//    
//	   
//    public void Enterselectmanagers(String selectmanagers)
//    {
//	        SELECTMANAGERS.sendKeys(selectmanagers);
//     }

    
    
      public void Enterstatus(String status)
      {
	        STATUS.sendKeys(status);
       }                                   // +VE CASE
       
//       public void ClickonStatus()
//       {
//   	      STATUS.click();                  // _ve case  if status  is blank 
//       }
       
       
       
       

   
    
      public void Entertype(String type)
      {
	        TYPE.sendKeys(type);
      }         // when we take +ve case type as 'String value automation'

    
//    public void Entertype(double type)
//    {
//	        TYPE.sendKeys("5678");
//    }             // when we take -ve case type as 'integers value 5678'
     
    public void ClickonSubmit() 
	{
		SUBMIT.click();
	}

	
    
    public void ClickonReset()
    {
	      RESET.click();
    }
  
     public void EnterSearchBar(String Search)
     {
    	 SEARCHBAR.sendKeys(Search);
     }
     
     public void ClickonView()
     {
	      VIEWBUTTON.click();
     } 
     
     public void Clickonclose()
     {
    	 CLOSEBUTTON.click();
     }
     
     public void ClickonAdd()
     {
    	 ADDBUTTON.click();
     }
     
     public void Clickonlakshmiappikatla()
     {
    	 LAKSHMIAPPIKATLA.click();
     }
     
//     public void Clickonabvstd()
//     {
//    	 ABVSTD.click();
//     }
     
     
//     
//     public void ClickonSelectAll()
//     {
//    	 SELECTALL.click();
//     }
     
//     public void Clockonadminuser()
//     {
//    	 ADMINUSER.click();
//     }
//     
     public void ClickonSubmit1() 
 	{
 		SUBMIT1.click();
 	}

 	
     
     public void ClickonReset1()
     {
 	      RESET1.click();
     }
     
    




	public void addprojects() {
		// TODO Auto-generated method stub
		
	}




	public void EnterSubmitButton() {
		// TODO Auto-generated method stub
		
	}




	public void EnterResetButton() {
		// TODO Auto-generated method stub
		
	}


	public void Clickonadminuser() {
		// TODO Auto-generated method stub
		
	}


//	public void Entertype(String data6) {
//		// TODO Auto-generated method stub
//		
//	}


//	public void Enterstatus(String data3) {
//		// TODO Auto-generated method stub
//		
//	}
	

	
	}


