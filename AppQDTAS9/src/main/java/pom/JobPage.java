package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobPage {

	
	@FindBy(id="btn2")
	private WebElement JOBBUTTON;
	
	@FindBy(linkText="Job Title")
	private WebElement JOBTITLE;
	
//	@FindBy(xpath="//button=[@routerlink='/add-job-title']")
//	private WebElement ADDBUTTON;
	
	@FindBy(xpath="/html/body/app-root/app-job-title/div/main/div/div/div/div/form/div[1]/div[1]/button")
	private WebElement ADDBUTTON;
	
	@FindBy(id="jobName")
	private WebElement JOBTITLENAME;
	
	
	@FindBy(id="jobDescription")
	private WebElement JOBDESCRIPTION;
	
	@FindBy(xpath="/html/body/app-root/app-add-job-title/div/main/div/div/div/div/form/div/div[3]/button[2]")
	private WebElement SUBMIT;
	
	@FindBy(xpath="/html/body/app-root/app-add-job-title/div/main/div/div/div/div/form/div/div[3]/button[1]")
	private WebElement RESET;
	
//	@FindBy(id="myInput")
//	private WebElement SEARCH;
	
	
	
	
	
	public JobPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void JobTitle() {
		
//	public void ClickonJobButton()
//	{
//		JOBBUTTON.click();
//	}
	
//	public void ClickonJobTitle()
//	{
//		JOBTITLE.click();
//	}
	
//	public void ClickonADDBUTTON()
//	{
//		ADDBUTTON.click();
//	}
	
//	public void EnterTitleName(String TitleName)
//    {
//		JOBTITLENAME.sendKeys(TitleName);
//    }
//	
//	public void EnterDescription(String Description)
//    {
//   	  JOBDESCRIPTION.sendKeys(Description);
//    }
//}
	
	
	public void JobTitle() 
	{
		JOBBUTTON.click();
		JOBTITLE.click();
		ADDBUTTON.click();
		
        JOBTITLENAME.sendKeys("Tester");         //POSITIVE CASES
		JOBDESCRIPTION.sendKeys("Automated UI"); //POSITIVE CASES
		
		JOBTITLENAME.click();      //BLANK FIELD
		JOBDESCRIPTION.click();    //BLANK FIELD
		
//		JOBTITLENAME.sendKeys("Tester12");            //NEGATIVE CASES
//		JOBDESCRIPTION.sendKeys("Automated UI12");    //NEGATIVE CASES
		
		SUBMIT.click();
		RESET.click();
		
//		SEARCH.click();
		
		
		
	}


	public void ClickonJOBBUTTON() {
		// TODO Auto-generated method stub
		
	}


	public void ClickonADDBUTTON() {
		// TODO Auto-generated method stub
		
	}

	public void enterDetails(String jobTitleName2, String jobDescription2) {
		// TODO Auto-generated method stub
		
	}

	public void JobDescription() {
		// TODO Auto-generated method stub
		
	}

	public void JobTitleName() {
		// TODO Auto-generated method stub
		
	}

	public void ClickonSubmit() {
		// TODO Auto-generated method stub
		
	}

	public void ClickonReset() {
		// TODO Auto-generated method stub
		
	}

    public void ClickonSearch() {
		// TODO Auto-generated method stub
//		
	}
	
	
	



}
