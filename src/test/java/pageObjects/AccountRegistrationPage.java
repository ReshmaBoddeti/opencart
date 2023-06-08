package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	   public AccountRegistrationPage(WebDriver driver) {
		
		super(driver);

	}
	   
	   //Elements
	   
	   @FindBy(name="firstname")
	   WebElement txtFirstname;
	   
	   @FindBy(name="lastname")
	   WebElement txtLastname;
	   
	   @FindBy(name="email")
	   WebElement txtEmail;
	   
	   @FindBy(name="telephone")
	   WebElement txtTelephone;
	   
	   @FindBy(name="password")
	   WebElement txtPassword;
	   
	   @FindBy(name="confirm")
	   WebElement txtConfirmpassword;
	   
	   @FindBy(name="agree")
	   WebElement chkdPolicy;
	   
	   @FindBy(xpath="//input[@value='Continue']")
	   WebElement btnContinue;
	   
	   @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	   WebElement msgConfirmation;
	   
	   //Action Methods for each Web Element
	   
	   public void setFirstName(String fname)
	   {
		   txtFirstname.sendKeys(fname);
	   }
	   
	   public void setLastName(String lname)
	   {
		   txtLastname.sendKeys(lname);
	   }
	   
	   public void setEmail(String email)
	   {
		   txtEmail.sendKeys(email);
	   }
	   public void setTelephone(String telephone)
	   {
		   txtTelephone.sendKeys(telephone);
	   }
	   
	   public void setPassword(String password)
	   {
		   txtPassword.sendKeys(password);
	   }
	   public void setConfirmPassword(String password)
	   {
		   txtConfirmpassword.sendKeys(password);
	   }
	    
	   public void setPrivacyPolicy()
	   {
		   chkdPolicy.click();
	   }
	   
	   public void clickContinue()
	   {
		   btnContinue.click();
	   }
	   
	   public String getConfirmationMsg()
	   {
		   try
		   {
			   return(msgConfirmation.getText());
		   }
		   catch(Exception e)
		   {
			   return(e.getMessage());
		   }
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 //input[@name='firstname']
	 //input[@name='lastname']
	 //input[@name='email']
	 //input[@name='telephone']
	 //input[@name='password']
	 //input[@name='confirm']
	 //input[@name='agree']
	 //input[@value='Continue']

}
