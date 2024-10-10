package Jobs;

import static org.testng.Assert.assertEquals;
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

public class WorkMarket{
	
	AppiumDriver driver;
	String wmUsername;
	String wmPassword;
	
	public WorkMarket(AppiumDriver driver,String wmUsername,String wmPassword) {
		this.driver=driver;
		this.wmUsername=wmUsername;
		this.wmPassword=wmPassword;
	}

	@BeforeTest
	public void loginWMUser()
	{
		SignIn_UM_ForgotPasswordPage signIn = new SignIn_UM_ForgotPasswordPage(driver);
		signIn.validSignIn(wmUsername, wmPassword);
	}
	@Test
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
	
	//@AfterTest
	public void closeApp()
	{
		driver.quit();
	}
}
