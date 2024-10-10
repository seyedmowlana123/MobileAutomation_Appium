package Submit;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CTsPage;
import Pages.CellRouterPage;
import Pages.JobsPage;
import Pages.PanelsPage;
import Pages.PowerPage;
import Pages.SignIn_UM_ForgotPasswordPage;
import Pages.SubmitPage;
import Pages.TestPage;
import Pages.WrapUpPage;
import Resources.BasePage;
import Resources.BaseTest;
import Resources.GlobalConstants;
import io.appium.java_client.AppiumDriver;

public class Submit extends BaseTest {

	AppiumDriver driver;

	public Submit(AppiumDriver driver) {
		this.driver = driver;
	}

	// @BeforeTest
	public void loginNWMUser() {
		SignIn_UM_ForgotPasswordPage signIn = new SignIn_UM_ForgotPasswordPage(driver);
		signIn.validSignIn(nwmUsername, nwmPassword);
	}

	// @Test(priority=0)
	public void nonWorkMarketFlow() {
		JobsPage nwmJobs = new JobsPage(driver);
		assertTrue(nwmJobs.verifyNWMHomeScreen(), "Non Work Market Home Screen Not Loaded");
//		nwmJobs.typeJobCode(GlobalConstants.nwmjobCode);
//		nwmJobs.clickJobEnterButton();
		nwmJobs.click1stJob();
		nwmJobs.swipeUp();
		nwmJobs.clickAddMeter();
		assertTrue(nwmJobs.verifyAddMeterScreen(), "Add Meter Screen Not Loaded");
		nwmJobs.typeMacAddress();
		nwmJobs.clickNextButton();
		assertTrue(nwmJobs.verifyNWMPopup(), "NWM Popup Not Loaded");
		nwmJobs.clickNWMPopupRadioButton();
		nwmJobs.clickContinueButton();
		nwmJobs.click1stStep();
		// assertTrue(nwmJobs.verifySafetyScreen(), "Safety Warning Screen Not Loaded");
		nwmJobs.clickAddPanels();
		nwmJobs.enterPanelName("AutomationPanel_" + BasePage.generateRandomNumber());
		nwmJobs.clickNextBtn();
		nwmJobs.clickDeEnergizedRadioBtn();
		nwmJobs.clickSafetyCheckNextBtn();
		nwmJobs.clickUploadFromGallery();
		nwmJobs.selectPhoto();
		nwmJobs.ClickPhotoNextButton();
	}

	// @Test(priority=1)
	public void numberedPanelsFlow() {
		PanelsPage NumPanels = new PanelsPage(driver);
		assertTrue(NumPanels.verifyPanelHomePage(), "Panels Page NOT loaded");
		// NumPanels.enterPanelName("AutomationPanel_" +
		// BasePage.generateRandomNumber());
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
		// NumPanels.clickNoAddMorePanels();
		NumPanels.clickAddMoreNextBtn();
	}

	// @Test(priority=2)
	public void powerFlowWithNumberedPanels() {
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

	// @Test(priority=3)
	public void CTFlow() {
		CTsPage CT = new CTsPage(driver);
		CT.clickCTHomeNextBtn();
		CT.clickPortADropDown();
		CT.swipeCT();
		CT.swipeCT();
		CT.clickCTSize();
		CT.clickPanelA1DropDown();
		CT.clickPanelA1Value();
		CT.clickBreakerA1DropDown();
		CT.clickBreakerA1Value();
		CT.clickPanelA2DropDown();
		CT.clickPanelA2Value();
		// CT.clickBreakerA2Value();
		CT.clickBreakerA2DropDown();
		CT.clickBreakerA2Value();
		CT.clickCTMainNextBtn();
		CT.swipeCT();
		CT.typeRequired(GlobalConstants.ctModalExplanation);
		CT.clickModalNextBtn();
		CT.clickUploadFromGallery();
		CT.selectPhoto();
		CT.clickPhotoNextBtn();
	}

	// @Test(priority=4)
	public void testFlow() {
		TestPage TP = new TestPage(driver);
		TP.selectSafetyStandardChkBox();
		TP.selectRestoredPowerChkBox();
		TP.clickTestHomeNextBtn();
		TP.clickTestMeterBtn();
		TP.clickDoneBtn();
	}

	// @Test(priority=5)
	public void cellRouterFlow() {
		CellRouterPage CR = new CellRouterPage(driver);
		CR.clickCellRouterYes();
		CR.cellRouterHomeNextBtn();
		// CR.clickRouterMacTextField();
		CR.typeRouterMac(GlobalConstants.macAddress);
		CR.clickMacNextBtn();
		CR.clickOptionalNextBtn();
		CR.clickUploadFromGallery();
		CR.selectPhoto();
		CR.clickPhotoNextBtn();
	}

	// @Test(priority=6)
	public void WrapUpFlow() {
		WrapUpPage WrUp = new WrapUpPage(driver);
		WrUp.clickWrapUpHome();
		WrUp.clickUploadFromGallery();
		WrUp.selectPhoto();
		WrUp.clickPhotoNextBtn();
		WrUp.clickMeteringInsightsNextBtn();
		WrUp.clickLeftOverYes();
		WrUp.typeExcessMeterQty(GlobalConstants.ExcessMeterQty);
		WrUp.typeExcessCellRouterQty(GlobalConstants.ExcessCellRouterQty);
		WrUp.clickLeftOverNextBtn();
		WrUp.typeWrapUpComment(GlobalConstants.WrapUpComments);
		WrUp.clickWrapUpDone();
	}

	@Test(priority = 7)
	public void SubmitFlow() {
		SubmitPage sp = new SubmitPage(driver);
		sp.clickFinalizeInstallBtn();
		// Verify Submit Process
		// sp.clickDoneBtn();
	}

}
