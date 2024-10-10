package Pages;

import PageLocators.PanelsLocators;
import Resources.BasePage;
import io.appium.java_client.AppiumDriver;

public class PanelsPage extends BasePage {
	
	public PanelsPage(AppiumDriver driver) 
	{
		super(driver);
		PanelsLocators.locatorsForiOS_Android();
	}
	
	public boolean verifyPanelHomePage()
	{
		waitForElementPresent(PanelsLocators.panelsHomePage);
		return(isElementPresent(PanelsLocators.panelsHomePage));
	}
	
	public void enterPanelName(String PanelName)
	{
		waitForElementPresent(PanelsLocators.panelsTextBox);
		type(PanelsLocators.panelsTextBox, PanelName);
	}
	
	public void select3Phase()
	{
		waitForElementPresent(PanelsLocators.threePhasePanel);
		click(PanelsLocators.threePhasePanel);
		log("3-Phase Selected");
	}
	
	public void clickNextBtn()
	{
		waitForElementPresent(PanelsLocators.panelsNextBtn);
		click(PanelsLocators.panelsNextBtn);
		log("Next Button is clicked");
	}
	
	public boolean verifyLeftScreen()
	{
		waitForElementPresent(PanelsLocators.leftHome);
		return(isElementPresent(PanelsLocators.leftHome));
	}
	
	public void clickLeftOddNumbers()
	{
		waitForElementPresent(PanelsLocators.leftOddNumbers);
		click(PanelsLocators.leftOddNumbers);
		log("Odd Numbers Selected for Left Range");
	}
	
	public void clickLeftEvenNumbers()
	{
		waitForElementPresent(PanelsLocators.leftEvenNumbers);
		click(PanelsLocators.leftEvenNumbers);
		log("Even Numbers Selected for Left Range");
	}
	
	public void clickLeftConsecutiveNumbers()
	{
		waitForElementPresent(PanelsLocators.leftConsecutiveNumbers);
		click(PanelsLocators.leftConsecutiveNumbers);
		log("Consecutive Numbers Selected for Left Range");
	}
	
	public void clickLeftNextBtn()
	{
		waitForElementPresent(PanelsLocators.leftNextBtn);
		click(PanelsLocators.leftNextBtn);
	}
	
	public boolean verifyRightScreen()
	{
		waitForElementPresent(PanelsLocators.rightHome);
		return(isElementPresent(PanelsLocators.rightHome));
	}
	
	public void clickRightOddNumbers()
	{
		waitForElementPresent(PanelsLocators.rightOddNumbers);
		click(PanelsLocators.rightOddNumbers);
		log("Odd Numbers Selected for Right Range");
	}
	
	public void clickRightEvenNumbers()
	{
		waitForElementPresent(PanelsLocators.rightEvenNumbers);
		click(PanelsLocators.rightEvenNumbers);
		log("Even Numbers Selected for Right Range");
	}
	
	public void clickRightConsecutiveNumbers()
	{
		waitForElementPresent(PanelsLocators.rightConsecutiveNumbers);
		click(PanelsLocators.rightConsecutiveNumbers);
		log("Cnsecutive Numbers Selected for Right Range");
	}
	
	public void clickRightNextBtn()
	{
		waitForElementPresent(PanelsLocators.rightNextBtn);
		click(PanelsLocators.rightNextBtn);
	}
	
	public void clickPatternToptoBottom()
	{
		waitForElementPresent(PanelsLocators.patternTopToBottom);
		click(PanelsLocators.patternTopToBottom);
		log("Top to Bottom Selected as Phasing Pattern");
	}
	
	public void clickPatternNextBtn()
	{
		waitForElementPresent(PanelsLocators.patternNextBtn);
		click(PanelsLocators.patternNextBtn);
	}
	
	public boolean verifyPanelRangeLeftScreen()
	{
		waitForElementPresent(PanelsLocators.panelLeftHome);
		return(isElementPresent(PanelsLocators.panelLeftHome));
	}
	
	public void typeLeftStartingFrom(String leftStartNumber)
	{
		waitForElementPresent(PanelsLocators.panelLeftStarting);
		type(PanelsLocators.panelLeftStarting, leftStartNumber);
		log("Starting Number Added for Left Panels");
	}
	
	public void typeLeftEndingFrom(String leftEndNumber)
	{
		waitForElementPresent(PanelsLocators.panelLeftEnding);
		type(PanelsLocators.panelLeftEnding, leftEndNumber);
		log("Ending Number Added for Left Panels");
	}
	
	public void clickPanelLeftNextBtn()
	{
		waitForElementPresent(PanelsLocators.panelLeftNextBtn);
		click(PanelsLocators.panelLeftNextBtn);
	}
	
	public boolean verifyPanelRangeRightScreen()
	{
		waitForElementPresent(PanelsLocators.panelRightHome);
		return(isElementPresent(PanelsLocators.panelRightHome));
	}
	
	public void typeRightStartingFrom(String rightStartNumber)
	{
		waitForElementPresent(PanelsLocators.panelRightStarting);
		type(PanelsLocators.panelRightStarting, rightStartNumber);
		log("Starting Number Added for Right Panels");
	}
	
	public void typeRightEndingFrom(String rightEndNumber)
	{
		waitForElementPresent(PanelsLocators.panelRightEnding);
		type(PanelsLocators.panelRightEnding, rightEndNumber);
		log("Ending Number Added for Right Panels");
	}
	
	public void clickPanelRightNextBtn()
	{
		waitForElementPresent(PanelsLocators.panelRightNextBtn);
		click(PanelsLocators.panelRightNextBtn);
	}
	
	public void clickBreakerLeftNextBtn()
	{
		waitForElementPresent(PanelsLocators.breakerLeftNextBtn);
		click(PanelsLocators.breakerLeftNextBtn);
		log("Left Side Breaker Next button clicked");
	}
	
	public void clickBreakerRighttNextBtn()
	{
		waitForElementPresent(PanelsLocators.breakerRightNextBtn);
		click(PanelsLocators.breakerRightNextBtn);
		log("Right Side Breaker Next button clicked");
	}
	
	public void clickUploadFromGallery()
	{
		waitForElementPresent(PanelsLocators.uploadPhoto);
		click(PanelsLocators.uploadPhoto);
		log("Photo Upload From Gallery option selected");
	}
	
	public void selectPhoto()
	{
		waitForElementPresent(PanelsLocators.selectPhoto);
		click(PanelsLocators.selectPhoto);
		log("Photo Selected From Gallery");
	}
	
	public void clickPhotoNextBtn()
	{
		waitForElementPresent(PanelsLocators.photoNextBtn);
		click(PanelsLocators.photoNextBtn);
	}
	
	public void clickNoAddMorePanels()
	{
		waitForElementPresent(PanelsLocators.panelMonitorNo);
		click(PanelsLocators.panelMonitorNo);
		log("No selected from Will this meter monitoring any other panels");
	}
	
	public void clickAddMoreNextBtn()
	{
		waitForElementPresent(PanelsLocators.panelMonitorNextBtn);
		click(PanelsLocators.panelMonitorNextBtn);
	}
	
	//------------------- SwitchBoard----------------------------------
	
	public void clickNumPanelsNo()
	{
		waitForElementPresent(PanelsLocators.numberedPanelsNo);
		click(PanelsLocators.numberedPanelsNo);
		log("Switchboard Selected");
	}
	
	public boolean verifySwitchboardPage()
	{
		waitForElementPresent(PanelsLocators.switchBoardHomepage);
		return(isElementPresent(PanelsLocators.switchBoardHomepage));
	}
	
	public void clickAddMoreSwitches()
	{
		waitForElementPresent(PanelsLocators.addMoreSwitches);
		click(PanelsLocators.addMoreSwitches);
		log("Clicked Add More Switches");
	}
	
	public boolean verifyAddSwitchPage()
	{
		waitForElementPresent(PanelsLocators.addSwitchPage);
		return(isElementPresent(PanelsLocators.addSwitchPage));
	}
	
	public void typeSwitchName(String switchName)
	{
		waitForElementPresent(PanelsLocators.switchName);
		type(PanelsLocators.switchName, switchName);
		log("Type Switch Name");
	}
	
	public void clickAddSwitchBtn()
	{
		waitForElementPresent(PanelsLocators.addSwitchBtn);
		click(PanelsLocators.addSwitchBtn);
		log("3 Phase Switch Added");
	}
	
	public void clickEditSwitch()
	{
		waitForElementPresent(PanelsLocators.editSwitch);
		click(PanelsLocators.editSwitch);
		log("Clicked Edit Switch");
	}
	
	public boolean verifyEditSwitchPage()
	{
		waitForElementPresent(PanelsLocators.editSwitchPage);
		return(isElementPresent(PanelsLocators.editSwitchPage));
	}
	
	public void editSwitchName(String switchName)
	{
		waitForElementPresent(PanelsLocators.editSwitchTextBox);
		clear(PanelsLocators.editSwitchTextBox);
		type(PanelsLocators.editSwitchTextBox, switchName);
		log("Switch Name Edited");
	}
	
	public void clickEditSwitchUpdateBtn()
	{
		waitForElementPresent(PanelsLocators.editSwitchBtn);
		click(PanelsLocators.editSwitchBtn);
		log("Switch is Edited");
	}
	
	public void clickSwitchNextBtn()
	{
		waitForElementPresent(PanelsLocators.switchNextBtn);
		click(PanelsLocators.switchNextBtn);
		log("Switch Next button is clicked");
	}
	
	public void clickUploadFromGalleryBtn()
	{
		waitForElementPresent(PanelsLocators.uploadFromGalleryBtn);
		click(PanelsLocators.uploadFromGalleryBtn);
		log("Upload from gallery");
	}

}