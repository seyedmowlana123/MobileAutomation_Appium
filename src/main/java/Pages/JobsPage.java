package Pages;

import org.openqa.selenium.StaleElementReferenceException;

import PageLocators.JobsLocators;
import PageLocators.PanelsLocators;
import Resources.BasePage;
import Resources.GlobalConstants;
import io.appium.java_client.AppiumDriver;

public class JobsPage extends BasePage{
	
	public JobsPage(AppiumDriver driver) 
	{
		super(driver);
		JobsLocators.locatorsForiOS_Android();
	}
	
	public void clickPreviousTab()
	{
		waitForElementPresent(JobsLocators.tabPrevious);
		click(JobsLocators.tabPrevious);
		log("Previous Tab is Clicked");
	}
	
	public boolean verifyJobId()
	{
		waitForElementPresent(JobsLocators.jobId);
		return isElementPresent(JobsLocators.jobId);
	}
	
	public String getJob()
	{
		waitForElementPresent(JobsLocators.jobId);
		return getText(JobsLocators.jobId);
	}
	
	public void clickViewJob()
	{
		waitForElementPresent(JobsLocators.viewButton);
		click(JobsLocators.viewButton);
		log("View Job is clicked");
	}
	
	public void clickAddMeter()
	{
		waitForElementPresent(JobsLocators.addMeterButton);
		click(JobsLocators.addMeterButton);
		log("Add Meter Button is clicked");
	}
	
	public boolean verifyAddMeterScreen()
	{
		try {
			waitForElementPresent(JobsLocators.addMeterLabel);
		return (isElementPresent(JobsLocators.addMeterLabel));
		}
		catch (StaleElementReferenceException elementHasAppeared) {
	        return true;
	      }
	}
	
	public void typeMacAddress()
	{
		waitForElementPresent(JobsLocators.macAddress);
		type(JobsLocators.macAddress, GlobalConstants.macAddress);
		log("Mac Address is added");
	}
	
	public void clickNextButton()
	{
		waitForElementPresent(JobsLocators.nextButton);
		click(JobsLocators.nextButton);
		log("Next button is clicked");
	}
	
	public boolean verifyMeterPage()
	{
		try {
		waitForElementPresent(JobsLocators.verifyMeterPage);
		return(isElementPresent(JobsLocators.verifyMeterPage));
		}
		catch(StaleElementReferenceException elementHasAppeared) {
	        return true;
	      }
	}
	
	public void click1stStep()
	{
		waitForElementPresent(JobsLocators.meter1stStepButton);
		click(JobsLocators.meter1stStepButton);
		log("Clicked the 1st Step");
	}
	
	public boolean verifySafetyScreen()
	{
		waitForElementPresent(JobsLocators.safetyWarning);
		return(isElementPresent(JobsLocators.safetyWarning));
	}
	
	public void clickDeEnergizedRadioBtn()
	{
		waitForElementPresent(JobsLocators.deEnergized);
		click(JobsLocators.deEnergized);
		log("De-Energized Radio button is clicked");
	}
	
	public void clickSafetyCheckNextBtn()
	{
		waitForElementPresent(JobsLocators.safetyCheckNextButton);
		click(JobsLocators.safetyCheckNextButton);
		log("Safety Check Next button is clicked");
	}
	
	public void clickUploadFromGallery()
	{
		waitForElementPresent(JobsLocators.uploadGallery);
		click(JobsLocators.uploadGallery);
		log("Upload from Gallery button clicked");
	}
	
	public void selectPhoto()
	{
		waitForElementPresent(JobsLocators.selectPhoto);
		click(JobsLocators.selectPhoto);
		log("Photo Selected");
	}
	
	public void ClickPhotoNextButton()
	{
		waitForElementPresent(JobsLocators.photoNextButton);
		click(JobsLocators.photoNextButton);
	}
	
	//----------------------Non-WorkMarket-------------------------------------
	
	public boolean verifyNWMHomeScreen()
	{
		waitForElementPresent(JobsLocators.jobCodeTextBox);
		return(isElementPresent(JobsLocators.jobCodeTextBox));
	}
	
	public void typeJobCode(String JobCode)
	{
		waitForElementPresent(JobsLocators.jobCodeTextBox);
		type(JobsLocators.jobCodeTextBox, JobCode);
		log("Job Code Entered");
	}
	
	public void clickJobEnterButton()
	{
		waitForElementPresent(JobsLocators.jobsEnterButton);
		click(JobsLocators.jobsEnterButton);
	}
	
	public void click1stJob()
	{
		waitForElementPresent(JobsLocators.jobViewBtn);
		click(JobsLocators.jobViewBtn);
		log("First Job is clicked");
	}
	
	public void swipeToEnd()
	{
		swipeScreen(Direction.UP);
	}
	
	public boolean verifyNWMPopup()
	{
		waitForElementPresent(JobsLocators.nwmPopup);
		return (isElementPresent(JobsLocators.nwmPopup));
	}
	
	public void clickNWMPopupRadioButton()
	{
		waitForElementPresent(JobsLocators.confirmationRadioButton);
		click(JobsLocators.confirmationRadioButton);
	}
	
	public void clickContinueButton()
	{
		waitForElementPresent(JobsLocators.continueButton);
		click(JobsLocators.continueButton);
	}
	
	public void clickAddPanels()
	{
		waitForElementPresent(JobsLocators.addMorePanelBtn);
		click(JobsLocators.addMorePanelBtn);
		log("Add Panels Button is clicked");
	}
	public void enterPanelName(String PanelName)
	{
		waitForElementPresent(JobsLocators.panelsTextBox);
		type(JobsLocators.panelsTextBox, PanelName);
	}
	
	public void clickNextBtn()
	{
		waitForElementPresent(JobsLocators.photoNextButton);
		click(JobsLocators.photoNextButton);
		log("Next Button is clicked");
	}
	
	public void swipeUp()
	{
		//swipeScreen(Direction.UP);
		swipeScreenSmall(Direction.UP);
	}
}
