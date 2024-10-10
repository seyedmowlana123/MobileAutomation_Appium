package Pages;

import Resources.BasePage;
import Resources.GlobalConstants;
import PageLocators.SignIn_UM_ForgotPasswordLocators;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class SignIn_UM_ForgotPasswordPage extends BasePage{
	
	public SignIn_UM_ForgotPasswordPage(AppiumDriver driver)
	{
		super(driver);
		SignIn_UM_ForgotPasswordLocators.locatorsForiOS_Android();
	}
	//--------------Sign In----------------------
	public void inValidSignIn()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.userName);
		clearSignInFields();
		type(SignIn_UM_ForgotPasswordLocators.userName, "Test@a.c");
		type(SignIn_UM_ForgotPasswordLocators.password, "1234");
		click(SignIn_UM_ForgotPasswordLocators.submit);
	}
	
	public void validSignIn(String UserName, String Password)
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.userName);
		clearSignInFields();
		type(SignIn_UM_ForgotPasswordLocators.userName, UserName);
		//click(SignIn_UM_ForgotPasswordLocators.passwordIcon);
		type(SignIn_UM_ForgotPasswordLocators.password, Password);
		//threadSleep(5000);
		click(SignIn_UM_ForgotPasswordLocators.submit);
	}
	
	public void clearSignInFields()
	{
		clear(SignIn_UM_ForgotPasswordLocators.userName);
		clear(SignIn_UM_ForgotPasswordLocators.password);
	}
	
	public boolean verifyErrorMessage()
	{
		isElementPresent(SignIn_UM_ForgotPasswordLocators.signInFailHeading);
		return(isElementPresent(SignIn_UM_ForgotPasswordLocators.signInFailHeading));
	}
	
	public String getErrorMessageText()
	{
		isElementPresent(SignIn_UM_ForgotPasswordLocators.signInFailHeading);
		return(getText(SignIn_UM_ForgotPasswordLocators.signInFailHeading));
	}
	
	public void clickOkButton()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.okButton);
		click(SignIn_UM_ForgotPasswordLocators.okButton);
	}
	
	//----------Forgot Password------------------------------
	public void clickForgotPassword()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.forgotPasswordLink);
		click(SignIn_UM_ForgotPasswordLocators.forgotPasswordLink);
	}
	
	public String getForgotPasswordHeading()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.resetPasswordHeading);
		return(getText(SignIn_UM_ForgotPasswordLocators.resetPasswordHeading));
	}
	
	public void clearEmail()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.resetPasswordHeading);
		clear(SignIn_UM_ForgotPasswordLocators.resetEmail);
	}
	
	public void typeEmail()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.resetEmail);
		click(SignIn_UM_ForgotPasswordLocators.resetEmail);
		type(SignIn_UM_ForgotPasswordLocators.resetEmail, "tes@ab.com");
	}
	
	public void clickForgotPasswordHeading()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.resetPasswordHeading);
		click(SignIn_UM_ForgotPasswordLocators.resetPasswordHeading);
	}
	
	public void clickResetButton()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.resetButton);
		click(SignIn_UM_ForgotPasswordLocators.resetButton);
	}
	
	public boolean verifySignIn()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.signInTab);
		return(isElementPresent(SignIn_UM_ForgotPasswordLocators.signInTab));
	}
	
	public void clickPopupOkButton()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.resetPopupOkButton);
		click(SignIn_UM_ForgotPasswordLocators.resetPopupOkButton);
	}
	
	public void forgotPassDeepLink()
	{
		driver.get("meter-installer-app://redaptive/forgot-password/d2ce883a-412b-44ad-8bad-8d9b55e1da25");
	}
	
	public void clearPassResetFields()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.newPassword);
		clear(SignIn_UM_ForgotPasswordLocators.newPassword);
		clear(SignIn_UM_ForgotPasswordLocators.confirmNewPass);
	}
	
	public void typePassConfPass()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.newPassword);
		type(SignIn_UM_ForgotPasswordLocators.newPassword, "Test@1234567");
		type(SignIn_UM_ForgotPasswordLocators.confirmNewPass, "Test@1234567");
	}
	
	public void clickNextButton()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.resetNextButton);
		click(SignIn_UM_ForgotPasswordLocators.resetNextButton);
	}
	
	public boolean verifyWMHomePage()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.workMarketHome);
		return isElementPresent(SignIn_UM_ForgotPasswordLocators.workMarketHome);
	}
	
	//------------------Create Account------------------------
	public void clickSignUp()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.signUpTab);
		click(SignIn_UM_ForgotPasswordLocators.signUpTab);
	}
	
	public boolean verifyCreateAccount()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.createAccountHeading);
		return(isElementPresent(SignIn_UM_ForgotPasswordLocators.createAccountHeading));
	}
	
	public void clickReqLinkButton()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.requestLinkButton);
		click(SignIn_UM_ForgotPasswordLocators.requestLinkButton);
	}
	
	public void clickReqCancelButton()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.requestCancelButton);
		click(SignIn_UM_ForgotPasswordLocators.requestCancelButton);
	}
	
	public boolean verifyRequestAccess()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.requestAccessHeading);
		return(isElementPresent(SignIn_UM_ForgotPasswordLocators.requestAccessHeading));
	}
	
	public void typeRequestEmail()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.requestEmail);
		click(SignIn_UM_ForgotPasswordLocators.requestEmail);
		type(SignIn_UM_ForgotPasswordLocators.requestEmail, "tes@ab.com");
	}
	
	public void clickSendMeLinkButton()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.sendMeLinkButton);
		click(SignIn_UM_ForgotPasswordLocators.sendMeLinkButton);
	}
	
	public void clickRequestAccessCancelButton()
	{
		waitForElementPresent(SignIn_UM_ForgotPasswordLocators.requestAccessCancelButton);
		click(SignIn_UM_ForgotPasswordLocators.requestAccessCancelButton);
	}
}
