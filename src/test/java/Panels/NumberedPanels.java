package Panels;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Jobs.NonWorkMarket;
import Jobs.WorkMarket;
import Pages.JobsPage;
import Pages.PanelsPage;
import Pages.SignIn_UM_ForgotPasswordPage;
import Resources.BasePage;
import Resources.BaseTest;
import Resources.GlobalConstants;
import io.appium.java_client.AppiumDriver;

public class NumberedPanels extends BaseTest{
	
	AppiumDriver driver;
	
	public NumberedPanels(AppiumDriver driver) 
	{
		this.driver=driver;
	}
	
	//@BeforeTest
	public void loginNWMUser()
	{
//		SignIn_UM_ForgotPasswordPage signIn = new SignIn_UM_ForgotPasswordPage(driver);
//		signIn.validSignIn(GlobalConstants.nwmUserName, GlobalConstants.nwmPassword);
	}
	
	//@Test(priority=0)
	public void nonWMFlow()
	{
//		NonWorkMarket nwm= new NonWorkMarket();
//		nwm.nonWorkMarketFlow();
	}

	@Test (priority=0)
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
}