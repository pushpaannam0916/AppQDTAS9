package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	@FindBy(id="email")//Annotation
	private WebElement Email;//Encapsulation
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div[3]/form/div[2]/div/mat-icon")
	private WebElement VISIBILITYIMAGE;
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div[3]/form/button")
	private WebElement submit;
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div[3]/div/a[1]/i")
	private WebElement INSTAGRAM;
	
	public loginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterEmailID(String emailid) 
	{
		Email.sendKeys(emailid);
	}
	
	public void EnterPassword(String passWord) 
	{
		Password.sendKeys(passWord);
	}
	
	public void ClickonVisibilityImage()
	{
		VISIBILITYIMAGE.click();
	}
	
	public void ClickonSubmit() 
	{
		submit.click();
	}
	
	public void ClickonInstagram()
	{
		INSTAGRAM.click();
	}

	


}//	













