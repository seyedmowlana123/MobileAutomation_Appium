package Panels;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Converter;

import Pages.JobsPage;
import Pages.PanelsPage;
import Pages.SignIn_UM_ForgotPasswordPage;
import Resources.BasePage;
import Resources.BaseTest;
import Resources.GlobalConstants;

public class SwitchBoard extends BaseTest{
	
	@BeforeTest
	public void loginWMUser()
	{
		SignIn_UM_ForgotPasswordPage signIn = new SignIn_UM_ForgotPasswordPage(driver);
		signIn.validSignIn(nwmUsername, nwmPassword);
	}
	
	@Test(priority=0)
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
	
	@Test(priority=1)
	public void switchboardFlow()
	{
		String SwitchName = ("AutoSwitch_" + BasePage.generateRandomNumber()).toString();
		PanelsPage SwitchBoard = new PanelsPage(driver);
		assertTrue(SwitchBoard.verifyPanelHomePage(), "Panels Page NOT loaded");
		SwitchBoard.enterPanelName("AutomationSwitchBoard_" + BasePage.generateRandomNumber());
		SwitchBoard.clickNumPanelsNo();
		SwitchBoard.select3Phase();
		SwitchBoard.clickNextBtn();
		assertTrue(SwitchBoard.verifySwitchboardPage(), "Switchboard page NOT loaded");
		SwitchBoard.clickAddMoreSwitches();
		assertTrue(SwitchBoard.verifyAddSwitchPage(), "Add Switch page NOT loaded");
		//SwitchBoard.typeSwitchName("AutoSwitch_" + BasePage.generateRandomNumber());
		SwitchBoard.typeSwitchName(SwitchName);
		SwitchBoard.clickAddSwitchBtn();
		SwitchBoard.clickEditSwitch();
		assertTrue(SwitchBoard.verifyEditSwitchPage(), "Edit Switch page NOT loaded");
		SwitchBoard.editSwitchName("Edited_" + SwitchName);
		SwitchBoard.clickEditSwitchUpdateBtn();
		SwitchBoard.clickSwitchNextBtn();
		SwitchBoard.clickUploadFromGalleryBtn();
		SwitchBoard.selectPhoto();
		SwitchBoard.clickPhotoNextBtn();
		SwitchBoard.clickNoAddMorePanels();
		SwitchBoard.clickAddMoreNextBtn();
	}

}