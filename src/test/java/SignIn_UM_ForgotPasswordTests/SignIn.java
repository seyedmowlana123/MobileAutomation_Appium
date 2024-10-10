package SignIn_UM_ForgotPasswordTests;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SignIn_UM_ForgotPasswordPage;
import Resources.BaseTest;
import Resources.GlobalConstants;

public class SignIn extends BaseTest{

	//Verify the invalid login
	@Test(priority=0)
	public void inValidSignIn()
	{
		SignIn_UM_ForgotPasswordPage signIn = new SignIn_UM_ForgotPasswordPage(driver);
		signIn.inValidSignIn();
//		assertEquals(signIn.getErrorMessageText(), GlobalConstants.signInFailed,"Assert Fails");
//		signIn.clickOkButton();
	}
	//Verify the successful login
	//@Test(priority=1)
	public void validSignIn()
	{
		SignIn_UM_ForgotPasswordPage signIn = new SignIn_UM_ForgotPasswordPage(driver);
		signIn.validSignIn(nwmUsername, nwmPassword);
	}
	
	//@AfterTest
	public void closeApp()
	{
		driver.quit();
		//iOSdriver.quit();
	}
}