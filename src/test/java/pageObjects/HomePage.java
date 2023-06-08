package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
   
	//constructor
	public HomePage(WebDriver driver) {
		 
		super(driver);

	}

	//Elements
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(linkText = "Register")
	WebElement lnkRegister;
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	//Action Methods
	public void clickMyAccount()   //MyAccount link added
	{
		lnkMyaccount.click();
	}
	
	public void clickRegister()   //Register link added
	{
		lnkRegister.click();
	}
	
	public void clickLogin()    //Login link added
	{
		lnkLogin.click();
	}
	
}
