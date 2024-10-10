package SignIn_UM_ForgotPasswordTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
//import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SignIn_UM_ForgotPasswordPage;
import Resources.BasePage;
import Resources.BaseTest;
import Resources.GlobalConstants;


public class ForgotPassword extends BaseTest{
	
	@Test(priority=0)
	public void clickForgotPasswordLink() throws InterruptedException
	{
		SignIn_UM_ForgotPasswordPage forgotPassword = new SignIn_UM_ForgotPasswordPage(driver);
		forgotPassword.clickForgotPassword();
		assertEquals(forgotPassword.getForgotPasswordHeading(), GlobalConstants.resetPasswordHeading,
				"Forgot Password Heading doesn't match");
		forgotPassword.typeEmail();
		forgotPassword.clickForgotPasswordHeading();
		forgotPassword.clickResetButton();
		forgotPassword.clickPopupOkButton();
		assertTrue(forgotPassword.verifySignIn(), "Home Page NOT Loaded");
		forgotPassword.forgotPassDeepLink();
		forgotPassword.typePassConfPass();
		forgotPassword.clickNextButton();
		assertTrue(forgotPassword.verifyWMHomePage(), "Work Market Home Page NOT Loaded");

	}
	
	@AfterTest
	public void closeApp()
	{
		driver.quit();
	}

}
