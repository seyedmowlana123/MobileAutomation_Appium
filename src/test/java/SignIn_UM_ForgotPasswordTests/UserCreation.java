package SignIn_UM_ForgotPasswordTests;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SignIn_UM_ForgotPasswordPage;
import Resources.BaseTest;

public class UserCreation extends BaseTest{

	@Test(priority=0)
	public void createAccountCancel()
	{
		SignIn_UM_ForgotPasswordPage userCreation = new SignIn_UM_ForgotPasswordPage(driver);

		userCreation.clickSignUp();
		assertTrue(userCreation.verifyCreateAccount(), "Create Account screen NOT loaded");
		userCreation.clickReqCancelButton();
	}
	
	@Test(priority=1)
	public void requestAccessCancel()
	{
		SignIn_UM_ForgotPasswordPage userCreation = new SignIn_UM_ForgotPasswordPage(driver);

		userCreation.clickSignUp();
		assertTrue(userCreation.verifyCreateAccount(), "Create Account screen NOT loaded");
		userCreation.clickReqLinkButton();
		assertTrue(userCreation.verifyRequestAccess(), "Request Access screen NOT loaded");
		userCreation.clickRequestAccessCancelButton();
		assertTrue(userCreation.verifyCreateAccount(), "Create Account screen NOT loaded");
		userCreation.clickReqCancelButton();
		assertTrue(userCreation.verifySignIn(), "Home Page NOT loaded");
	}
	
	@Test(priority=2)
	public void requestSignUp()
	{
		SignIn_UM_ForgotPasswordPage userCreation = new SignIn_UM_ForgotPasswordPage(driver);
		
		userCreation.clickSignUp();
		assertTrue(userCreation.verifyCreateAccount(), "Create Account screen NOT loaded");
		userCreation.clickReqLinkButton();
		assertTrue(userCreation.verifyRequestAccess(), "Request Access screen NOT loaded");
		userCreation.typeRequestEmail();
		userCreation.clickSendMeLinkButton();
		assertTrue(userCreation.verifySignIn(), "Home Page NOT loaded");
	}
}
