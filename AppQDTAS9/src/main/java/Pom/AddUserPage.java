package Pom;

import java.security.PrivateKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {
	
	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[1]/button")
	private WebElement adduserbutton;
	
	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[1]/button")
	private WebElement  ADDBUTTON;
	
	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[2]/div/form/div/div[1]/div[1]/input")
	private WebElement Username;
	
	@FindBy(id="email")
	private WebElement emaiL;
	
	@FindBy(id="firstname")
	private WebElement Firstname;
	
	@FindBy(id="middlename")
	private WebElement Middlename;
	
	@FindBy(id="lastname")
	private WebElement Lastname;
	
	@FindBy(id="dob")
	private WebElement Birthdate;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="confirm_password")
	private WebElement Confirmpassword;
	
	@FindBy(name="gender")
	private WebElement Gender;
	
	@FindBy(id="phoneNumber")
    private WebElement PHONENUMBER;
	
	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[2]/div/form/div/div[6]/div[1]/select")
	private WebElement Department;
	
	@FindBy(name="role")
	private WebElement Role;
	
	@FindBy(name="jobCategoryId")
	private WebElement Jobcategoryid;
	
	@FindBy(name="employmentStatusId")
	private WebElement Employmentstatusid;
	
	@FindBy(name="jobId")
	private WebElement Jobid;
	
	@FindBy(id="address")
	private WebElement ADDRESS;     //[Positive case]
	
	
//	@FindBy(linkText="Please enter address")
//	private WebElement ADDRESS;     //[Negative case]
//	
	@FindBy(name="subRole")  
	private WebElement SUBROLE;
	
	
	//@FindBy(linkText="Submit")
	//private WebElement SUBMIT;
	
	//@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[2]/div/form/div/div[10]/div/button[2]")
    //private WebElement SUB;
	
	@FindBy(id="sub")
	private WebElement SUBMIT;
	
	
//	@FindBy(linkText="Reset")
//	private WebElement RESET;
	
	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[2]/div/form/div/div[10]/div[1]/button[1]")
	private WebElement RESET;
	
//	
//	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[3]/div/div/form/input")
//	private WebElement SEARCH;     // xpath for User ID ,UserName and PHONENUMBER     (NAME IS NOT ACCEPTING THIS XPATH)
	
	@FindBy(id="myInput")
	private WebElement SEARCH;
	
	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[3]/div/div/form/div[1]/table/thead/tr/th[2]/div/div[1]")
	private WebElement USERNAMEOPTION;
	
	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[3]/div/div/form/div[1]/table/thead/tr/th[3]/div/div[1]")
	private WebElement NAMEOPTION;    //XPATH FOR NAME
	
	
	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[3]/div/div/form/div[1]/table/tbody/tr[2]/td[7]/p/mat-slide-toggle/div/label")
	private WebElement ENABLED;
	
//	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/div/div/app-dialogbox/div[2]/button[1]/span[4]")
//	private WebElement NO;
	
	@FindBy(linkText="No")
	private WebElement NO;
	
	
	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[3]/div/div/form/div[1]/table/tbody/tr/td[5]")
	private WebElement EXTC;
	
//	@FindBy(linkText=" EXTC ")
//	private WebElement EXTCBUTTON;

	 
	
//	@FindBy(xpath="/html/body/app-root/app-user-details/div/main/div/div/div/div[2]/form/div/div[7]/div/button")
//	private WebElement EDITOPTION;          //after clicking on EXTC THE PROFILE PAGE OPENS THERE EDIT
	
//	@FindBy(id="edit")
//	private WebElement EDITOPTION;   //  In action edit
	
	
//	@FindBy(id="select-field")
//	private WebElement SELECT;
	

	
//	@FindBy(id="select-field")
//	private WebElement GENDEROPTION;
	
//	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/div/div/app-edit-user/div/div/div/form/div[1]/div/div/label")
//	private WebElement GENDEROPTION;

//	
//	@FindBy(id="firstname")
//	private WebElement FIRSTNAME;
	
//	@FindBy(xpath="/html/body/div[1]/div[2]/div/mat-dialog-container/div/div/app-edit-user/div/div/div/form/div[3]/button")
//	private WebElement SUBMIT1;
	
//	@FindBy(xpath="//button[@type='submit']")  
//	private WebElement SUBMIT1;
//	
//	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[3]/div/div/form/div[1]/table/tbody/tr[1]/td[8]/div/i[2]")
//	private WebElement DELETE;
	
	

	
	
//	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[3]/div/div/form/div[1]/table/tbody/tr[10]/td[8]")
//	private WebElement DELETEBUTTON;
	 

	public AddUserPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddUser() 
	{
		adduserbutton.click();
	}
	public void AddButton()
	{
		ADDBUTTON.click();
		
	}
	public void EnterUserName(String UserName) 
	{
		Username.sendKeys(UserName);
	}
	public void EnterEmail(String EmaiL) 
	{
		emaiL.sendKeys(EmaiL);
	}
	public void Enterfirstname(String FirstName) 
	{
		Firstname.sendKeys(FirstName);
	}
	public void Entermiddlename(String MiddleName) 
	{
		Middlename.sendKeys(MiddleName);
	}
	public void Enterlastname(String LastName) 
	{
		Lastname.sendKeys(LastName);
	}
	
	public void Enterdataofbirth(double date) 
	{
		Birthdate.sendKeys("28-11-2023");
	}

	public void EnterPassword(String PASSWORD) 
	{
		Password.sendKeys(PASSWORD);
	}
	
	public void Enterconfirmpassword(String password) 
	{
		Confirmpassword.sendKeys(password);
	}
	
	public void EnterGender(String GENDER) 
	{
		Gender.sendKeys(GENDER);
	}
	
	public void EnterPhonenumber(double Phone) 
    {
		PHONENUMBER.sendKeys("8688173236");
	}
	
	public void Enterdepartment(String DePartment) 
	{
		Department.sendKeys(DePartment);
	}
	
//	public void enterDetails(String department) {
//	
//	 selectFromDropdown(Department, department);
//	}
//	
//	public void selectFromDropdown(WebElement dropdown, String value_to_select) {
//		Select objSelect =new Select(dropdown);
//		objSelect.selectByVisibleText(value_to_select);
//	}
	
	public void Enterrole(String ROLE) 
	{
		Role.sendKeys(ROLE);
	}
	public void EnterJobcategoryid(String JobcategoryId) 
	{
		Jobcategoryid.sendKeys(JobcategoryId);
	}
	public void EnteremploymentStatusId(String EmploymentStatusId) 
	{
		Employmentstatusid.sendKeys(EmploymentStatusId);
	}
	public void EnterjobId(String JobId) 
	{
		Jobid.sendKeys(JobId);
	}
	public void Enteraddress(String Address) 
	{
		ADDRESS.sendKeys(Address);   //POSITIVE CASE 
		
	}
	
//	 public void ClickonAddress() 
//		{
//			ADDRESS.click();        // NEGATIVE CASE  WITH BLANK
//		}
	
	
	
	public void EntersubRole(String subrole) 
	{
		
		SUBROLE.sendKeys(subrole);
		
	}
	
	
	 public void ClickonSubmit() 
		{
			SUBMIT.click();
		}

	
     public void ClickonReset()
     {
    	 RESET.click();
     }
     
//    
//     public void EnterSearch(double Search)
//    {
//   	 SEARCH.sendKeys("37");   // by id
//    }
     
     
     
//    public void EnterSearch(String Search)
//     {
//    	 SEARCH.sendKeys(Search);   // by username and name
//   }
    
    public void EnterSearch(double Search)
  {
  	SEARCH.sendKeys("8688173236");    //by ph number
  }
    
     
//     public void ClickonUsername()
//     {
//    	 USERNAMEOPTION.click();     //CLICK ON TOP OF USERNSME HEADING
//     }
//    
     
//     public void ClickonName()
//   {
//  	     NAMEOPTION.click();    //CLICK ON TOP OF Name heading
//   }
     
     public void ClickonEnabled()
     {
    	ENABLED.click();
     }
     
     public void ClickOnNo()
     {
    	 
    	NO.click();
     }
     
     
//    public void ClickonEXTC()
//    {
//    	EXTC.click();
//    }
     
     
    
    
     
//     public void ClickonEdit()
//     {
//    	 EDITOPTION.click();        // in profile page edit option works after clicking on extc
//     }
//     
//     public void ClickOnSelect()
//     {
//    	 SELECT.click();
//     }
     
     
     
//     public void ClickonGender()
//  {
//  	 GENDEROPTION.click();
//  }
//     
//     public void EnterSelectGender(String SelectGender) 
//	{
//	SELECTGENDER.sendKeys(SelectGender);
//	}
     
     
     
//     public void EnterGender1(String Gender) 
// 	{
// 		GENDEROPTION.sendKeys(Gender);
// 	}
    
     
//     public void EnterFirstName(String FirstName)
//     {
//    	 FIRSTNAME.sendKeys(FirstName);
//    	 
//     }
//     
//     
//     public void ClickonSubmit1()
//     {
//    	 SUBMIT1.click();
//     }
//     
//          
//
//     
//    
//     
//     public void ClickonDelete ()
//     {
//    	 DELETE.click();
//     }
//     
     
     
     
     


//	public void EnterGender1(String data8) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void EnterSubmitButton() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void EnterResetButton() {
//		// TODO Auto-generated method stub
//		
//	}

//	public void EnterPhonenumber(String data9) {
//		// TODO Auto-generated method stub
//		
//	}

	public void ClickonAddButton() {
		// TODO Auto-generated method stub
		
	}

//	public void EnterSearch(String data18) {
//		// TODO Auto-generated method stub
//		
//	}

	public void Enteraddress() {
		// TODO Auto-generated method stub
		
	}

	public void Clickonname() {
		// TODO Auto-generated method stub
		
	}

	public void ClickOnGender() {
		// TODO Auto-generated method stub
		
	}

	public void EnterPhonenumber1(double data9) {
		// TODO Auto-generated method stub
		
	}

	public void EnterSearchName(String data18) {
		// TODO Auto-generated method stub
		
	}

	public void ClickonYes() {
		// TODO Auto-generated method stub
		
	}

	public void ClickonNo() {
		// TODO Auto-generated method stub
		
	}

//	public void EnterSearch(String data18) {
//		// TODO Auto-generated method stub
//		
//	}

	

	

	
}
	
	

	
	

