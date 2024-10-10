package Pages;

import PageLocators.PowerLocators;
import Resources.BasePage;
import io.appium.java_client.AppiumDriver;

public class PowerPage extends BasePage{

	public PowerPage(AppiumDriver driver) 
	{
		super(driver);
		PowerLocators.locatorsForiOS_Android();
	}
	
	public boolean verifyPowerPage()
	{
		waitForElementPresent(PowerLocators.powerHomePage);
		return(isElementPresent(PowerLocators.powerHomePage));
	}
	
	public void clickNextBtn()
	{
		waitForElementPresent(PowerLocators.powerHomeNextBtn);
		click(PowerLocators.powerHomeNextBtn);		
	}
	
	public boolean verifyPowerSourcePage()
	{
		return(isElementPresent(PowerLocators.powerSourceLabel));
	}
	
	public void clickPowerSourceRadioBtn()
	{
		waitForElementPresent(PowerLocators.powerSourceRadioBtn);
		click(PowerLocators.powerSourceRadioBtn);
	}
	
	public void clickPhaseADropDown()
	{
		waitForElementPresent(PowerLocators.breakerSelectionPhaseA);
		click(PowerLocators.breakerSelectionPhaseA);
	}
	
	public void clickPhaseBDropDown()
	{
		waitForElementPresent(PowerLocators.breakerSelectionPhaseB);
		click(PowerLocators.breakerSelectionPhaseB);
	}
	
	public void clickPhaseCDropDown()
	{
		waitForElementPresent(PowerLocators.breakerSelectionPhaseC);
		click(PowerLocators.breakerSelectionPhaseC);
	}
	
	public void selectPhaseAValue()
	{
		waitForElementPresent(PowerLocators.phaseADropDown1stValue);
		click(PowerLocators.phaseADropDown1stValue);
	}
	
	public void selectPhaseBValue()
	{
		waitForElementPresent(PowerLocators.phaseBDropDown1stValue);
		click(PowerLocators.phaseBDropDown1stValue);
	}
	
	public void selectPhaseCValue()
	{
		waitForElementPresent(PowerLocators.phaseCDropDown1stValue);
		click(PowerLocators.phaseCDropDown1stValue);
	}
	
	public void clickBreakerNextBtn()
	{
		waitForElementPresent(PowerLocators.breakerSelectionNextBtn);
		click(PowerLocators.breakerSelectionNextBtn);
	}
	
}
