package Jobs;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.JobsPage;
import Pages.SignIn_UM_ForgotPasswordPage;
import Resources.BasePage;
import Resources.BaseTest;
import Resources.GlobalConstants;
import io.appium.java_client.AppiumDriver;

public class NonWorkMarket {

	AppiumDriver driver;
	String nwmUsername;
	String nwmPassword;
	
	public NonWorkMarket(AppiumDriver driver,String nwmUsername,String nwmPassword) {
		this.driver=driver;
		this.nwmUsername=nwmUsername;
		this.nwmPassword=nwmPassword;
	}
	//@BeforeTest
	public void loginNWMUser()
	{
		SignIn_UM_ForgotPasswordPage signIn = new SignIn_UM_ForgotPasswordPage(driver);
		signIn.validSignIn(nwmUsername, nwmPassword);
	}
	@Test
	public void nonWorkMarketFlow()
	{
		JobsPage nwmJobs = new JobsPage(driver);
		assertTrue(nwmJobs.verifyNWMHomeScreen(), "Non Work Market Home Screen Not Loaded");
		//nwmJobs.swipeUp();
//		nwmJobs.typeJobCode(GlobalConstants.nwmjobCode);   			//Type the Job Code in Jobs search 
//		nwmJobs.clickJobEnterButton();
		nwmJobs.click1stJob();										//Clicks the first Job which is available in the list
		nwmJobs.swipeToEnd();
		nwmJobs.clickAddMeter();
		assertTrue(nwmJobs.verifyAddMeterScreen(), "Add Meter Screen Not Loaded");
		nwmJobs.typeMacAddress();
		nwmJobs.clickNextButton();
		assertTrue(nwmJobs.verifyNWMPopup(), "NWM Popup Not Loaded");
		nwmJobs.clickNWMPopupRadioButton();
		nwmJobs.clickContinueButton();
		nwmJobs.click1stStep();
		//assertTrue(nwmJobs.verifySafetyScreen(), "Safety Warning Screen Not Loaded");
		nwmJobs.clickAddPanels();
		nwmJobs.enterPanelName("AutomationPanel_" + BasePage.generateRandomNumber());
		nwmJobs.clickNextBtn();
		nwmJobs.clickDeEnergizedRadioBtn();
		nwmJobs.clickSafetyCheckNextBtn();
		nwmJobs.clickUploadFromGallery();
		nwmJobs.selectPhoto();
		nwmJobs.ClickPhotoNextButton();
	}
	
	//@AfterTest
	public void closeApp()
	{
		driver.quit();
	}
	
}
