package PageLocators;

import org.openqa.selenium.By;

import Resources.BaseTest;

public class SignIn_UM_ForgotPasswordLocators {

	// Sign In
	public static By signInTab;
	public static By signUpTab;
	public static By userName;
	public static By password;
	public static By passwordIcon;
	public static By submit;
	public static By signInFailHeading;
	public static By okButton;
	
	// Forgot Password
	public static By forgotPasswordLink;
	public static By resetPasswordHeading;
	public static By resetEmail;
	public static By resetButton;
	public static By confirmationPopup;
	public static By resetPopupOkButton;
	public static By newPassword;
	public static By confirmNewPass;
	public static By resetNextButton;
	public static By resetPassCancelButton;
	public static By workMarketHome;
	
	// Create Account
	public static By createAccountHeading;
	public static By requestLinkButton;
	public static By requestCancelButton;
	public static By requestAccessHeading;
	public static By requestEmail;
	public static By sendMeLinkButton;
	public static By requestAccessCancelButton;

	
	public static void locatorsForiOS_Android()
	{
		if(BaseTest.driverName.equals("Android")|| BaseTest.driverName.equals("Local"))
		{
			// Sign In
			signInTab = By.xpath("//android.view.ViewGroup[@resource-id='sign_in_tab']");
			signUpTab = By.xpath("//android.view.ViewGroup[@resource-id='sign_up_tab']");
			userName = By.xpath("//android.widget.EditText[@resource-id='auth_email_input']");
			password = By.xpath("//android.widget.EditText[@resource-id='auth_password_input']");
			passwordIcon = By.xpath("//android.view.ViewGroup[@resource-id='auth_password_input_icon']");
			
			submit = By.xpath("//android.view.ViewGroup[@resource-id='sign_in_btn']");
			signInFailHeading = By.xpath("//android.widget.TextView[@text='Sign in failed']");
			okButton = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
			
			// Forgot Password
			forgotPasswordLink = By.xpath("//android.widget.TextView[@text='Forgot password?']");
			resetPasswordHeading = By.xpath("//android.widget.TextView[@text='Reset Password']");
			resetEmail = By.xpath("//android.widget.EditText[@text='Enter your Email address']");
			resetButton = By.xpath("//android.view.ViewGroup[@resource-id='reset_pw_btn']");
			confirmationPopup = By.xpath("//android.widget.TextView[contains(@text(),'We've sent you a password')]");
			resetPopupOkButton = By.xpath("//android.view.ViewGroup[@resource-id='reset_pw_msg_ok_btn']");
			newPassword = By.xpath("//android.widget.EditText[@text='New Password']");
			confirmNewPass = By.xpath("//android.widget.EditText[@text='Confirm New Password']");
			resetNextButton = By.xpath("//android.view.ViewGroup[@resource-id='reset_pw_next_btn']");
			resetPassCancelButton = By.xpath("//android.view.ViewGroup[@resource-id='reset_pw_cancel_btn']");
			workMarketHome = By.xpath("//android.widget.TextView[@resource-id='text_image_text']");
			
			// Create Account
			createAccountHeading = By.xpath("//android.widget.TextView[@text='Create Account']");
			requestLinkButton = By.xpath("//android.view.ViewGroup[@resource-id='sign_up_link_button']");
			requestCancelButton = By.xpath("//android.view.ViewGroup[@resource-id='request_access_cancel_button']");
			requestAccessHeading = By.xpath("//android.widget.TextView[@text='Request Access']");
			requestEmail = By.xpath("//android.widget.EditText[@resource-id='request_access_email_input']");
			sendMeLinkButton = By.xpath("//android.view.ViewGroup[@resource-id='request_access_link_button']");
			requestAccessCancelButton = By.xpath("//android.view.ViewGroup[@resource-id='request_access_cancel_button']");
		}
		else if(BaseTest.driverName.equals("iOS"))
		{
			signInTab = By.id("sign_in_tab");
			signUpTab = By.id("sign_up_tab");
			userName = By.id("auth_email_input");
			password = By.id("auth_password_input");
			passwordIcon = By.id("auth_password_input_icon");
			submit = By.name("sign_in_btn"); 
			signInFailHeading = 
			okButton = 
					
			// Forgot Password
			forgotPasswordLink = By.id("login_forgot_pw_btn");
			resetPasswordHeading = 
			resetEmail = 
			resetButton = By.id("reset_pw_btn");
			confirmationPopup = 
			resetPopupOkButton = By.id("reset_pw_msg_ok_btn");
			newPassword = 
			confirmNewPass = 
			resetNextButton = By.id("reset_pw_next_btn");
			resetPassCancelButton = By.id("reset_pw_cancel_btn");
			workMarketHome = By.id("text_image_text");

			// Create Account
			createAccountHeading = 
			requestLinkButton = By.id("sign_up_link_button");
			requestCancelButton = By.id("request_access_cancel_button");
			requestAccessHeading = 
			requestEmail = By.id("r");
			sendMeLinkButton = By.id("request_access_link_button");
			requestAccessCancelButton = By.id("request_access_cancel_button");

		}
	}
	
	
	
}
