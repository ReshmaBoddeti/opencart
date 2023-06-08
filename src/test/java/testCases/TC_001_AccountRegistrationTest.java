package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass
{
	//ActualTestMethod
		@Test(groups= {"Regression" , "Master"})              //step 8 (Grouping test)
		public void test_Account_Registration() throws InterruptedException
		{
			logger.info("Starting TC_001_AccountRegistrationTest");
			logger.debug("Generating Debug logs....");
		
		    try
		  {
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on MyAccount link");
			
			hp.clickRegister();   //opens Registration Page
			logger.info("Clicked on Register link");
			
			AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
			
			logger.info("Providing Customer Details....");
			
			regpage.setFirstName(randomeString().toUpperCase());
			
			regpage.setLastName(randomeString().toUpperCase());
			
			regpage.setEmail(randomeString()+"@gmail.com");
			
			regpage.setTelephone(randomeNumber());

			String pwd=randomeAlphaNumeric();
			regpage.setPassword(pwd);
			
			regpage.setConfirmPassword(pwd);
			
			regpage.setPrivacyPolicy();
			regpage.clickContinue();
			logger.info("Clicked on Continue button");
			Thread.sleep(2000);
			
			String conmsg=regpage.getConfirmationMsg();
			if(conmsg.equals("Your Account Has Been Created!"))
			{
				logger.info("Test Passed!!!");
				AssertJUnit.assertTrue(true);
			}
			else
			{
				logger.error("Test Failed!!");
				AssertJUnit.assertTrue(false);
			}
			AssertJUnit.assertEquals(conmsg,"Your Account Has Been Created!");
		  }
		    catch(Exception e)
		    {
		    	AssertJUnit.fail();
		    }
		    
		    
		    logger.info("Finished TC_001_AccountRegistrationTest");
		    
		}

}
