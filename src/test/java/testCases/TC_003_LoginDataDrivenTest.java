package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utilities.DataProviders;
import pageObjects.*;

public class TC_003_LoginDataDrivenTest extends BaseClass
{
	@Test(dataProvider="LoginData" , dataProviderClass=DataProviders.class)
	public void test_loginDDT(String email,String pwd,String exp_value)
	{
		logger.info("Starting TC_003_DataDrivenLoginTest");
		
		try
		{
			
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExists();
				
		if(exp_value.equals("Valid"))   //comes from excel sheet last column
		{
			if(targetPage==true)        //comes from MyAccountPage whether the header is Displayed or not(boolean value)
			{
				macc.clickLogout();
				Assert.assertTrue(true);
								
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp_value.equals("Invalid"))
		{
			if(targetPage==true)
			{
				macc.clickLogout();
				Assert.assertTrue(false);
								
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	catch(Exception e)
	{
		Assert.fail();
		logger.info("Finished TC_003_LoginDataDrivenTest....");
	}
  }
}
