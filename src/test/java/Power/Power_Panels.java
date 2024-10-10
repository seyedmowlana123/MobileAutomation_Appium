package Power;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.JobsPage;
import Pages.PanelsPage;
import Pages.PowerPage;
import Pages.SignIn_UM_ForgotPasswordPage;
import Resources.BasePage;
import Resources.BaseTest;
import Resources.GlobalConstants;
import io.appium.java_client.AppiumDriver;

public class Power_Panels extends BaseTest{
	
AppiumDriver driver;
	
	public Power_Panels(AppiumDriver driver) 
	{
		this.driver=driver;
	}
	//@BeforeTest
	public void loginWMUser()
	{
		SignIn_UM_ForgotPasswordPage signIn = new SignIn_UM_ForgotPasswordPage(driver);
		signIn.validSignIn(nwmUsername, nwmPassword);
	}
	
	//@Test(priority=0)
	public void workMarketFlow()
	{
		JobsPage wmJobs = new JobsPage(driver);
		wmJobs.clickPreviousTab();
		assertEquals(wmJobs.getJob(), GlobalConstants.jobId, "Job Id Not Exists");
		wmJobs.clickViewJob();
		//assertTrue(wmJobs.verifyJobId(), "Job Id Not Exists");
		wmJobs.clickAddMeter();
		assertTrue(wmJobs.verifyAddMeterScreen(), "Add Meter Screen Not Loaded");
		wmJobs.typeMacAddress();
		wmJobs.clickNextButton();
		//assertTrue(wmJobs.verifyMeterPage(), "7 Step screen Not Loaded");
		wmJobs.click1stStep();
		assertTrue(wmJobs.verifySafetyScreen(), "Safety Warning Screen Not Loaded");
		wmJobs.clickDeEnergizedRadioBtn();
		wmJobs.clickSafetyCheckNextBtn();
		wmJobs.clickUploadFromGallery();
		wmJobs.selectPhoto();
		wmJobs.ClickPhotoNextButton();
	}
	
	//@Test(priority=0)
	public void nonWorkMarketFlow()
	{
		JobsPage nwmJobs = new JobsPage(driver);
		assertTrue(nwmJobs.verifyNWMHomeScreen(), "Non Work Market Home Screen Not Loaded");
		nwmJobs.typeJobCode(GlobalConstants.nwmjobCode);
		nwmJobs.clickJobEnterButton();
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

	//@Test(priority=1)
	public void numberedPanelsFlow()
	{
		PanelsPage NumPanels = new PanelsPage(driver);
		assertTrue(NumPanels.verifyPanelHomePage(), "Panels Page NOT loaded");
		//NumPanels.enterPanelName("AutomationPanel_" + BasePage.generateRandomNumber());
		NumPanels.select3Phase();
		NumPanels.clickNextBtn();
		assertTrue(NumPanels.verifyLeftScreen(), "Left Screen Not Loaded");
		NumPanels.clickLeftOddNumbers();
		NumPanels.clickLeftNextBtn();
		assertTrue(NumPanels.verifyRightScreen(), "Right Screen Not Loaded");
		NumPanels.clickRightEvenNumbers();
		NumPanels.clickRightNextBtn();
		NumPanels.clickPatternToptoBottom();
		NumPanels.clickPatternNextBtn();
		assertTrue(NumPanels.verifyPanelRangeLeftScreen(), "Panels Range Left Screen Not Loaded");
		NumPanels.typeLeftStartingFrom(GlobalConstants.panelLeftStarting);
		NumPanels.typeLeftEndingFrom(GlobalConstants.panelLeftEnding);
		NumPanels.clickPanelLeftNextBtn();
		assertTrue(NumPanels.verifyPanelRangeRightScreen(), "Panels Range Right Screen Not Loaded");
		NumPanels.typeRightStartingFrom(GlobalConstants.panelRightStarting);
		NumPanels.typeRightEndingFrom(GlobalConstants.panelRightEnding);
		NumPanels.clickPanelRightNextBtn();
		NumPanels.clickBreakerLeftNextBtn();
		NumPanels.clickBreakerRighttNextBtn();
		NumPanels.clickUploadFromGallery();
		NumPanels.selectPhoto();
		NumPanels.clickPhotoNextBtn();
		//NumPanels.clickNoAddMorePanels();
		NumPanels.clickAddMoreNextBtn();
	}
	
	@Test(priority=2)
	public void powerFlowWithNumberedPanels()
	{
		PowerPage Power = new PowerPage(driver);
		Power.verifyPowerPage();
		Power.clickNextBtn();
		Power.verifyPowerSourcePage();
		Power.clickPowerSourceRadioBtn();
		Power.clickNextBtn();
		Power.clickPhaseADropDown();
		Power.selectPhaseAValue();
		Power.clickPhaseBDropDown();
		Power.selectPhaseBValue();
		Power.clickPhaseCDropDown();
		Power.selectPhaseCValue();
		Power.clickBreakerNextBtn();
	}

}
