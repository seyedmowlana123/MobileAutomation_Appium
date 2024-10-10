package Pages;

import PageLocators.TestLocators;
import Resources.BasePage;
import io.appium.java_client.AppiumDriver;

public class TestPage extends BasePage{

	public TestPage(AppiumDriver driver) 
	{
		super(driver);
		TestLocators.locatorsForiOS_Android();
	}
	
	public void selectSafetyStandardChkBox()
	{
		waitForElementPresent(TestLocators.testCheckBox1);
		click(TestLocators.testCheckBox1);
		log("Test - Safety Standard Check Box is selected");
	}
	
	public void selectRestoredPowerChkBox()
	{
		waitForElementPresent(TestLocators.testCheckBox2);
		click(TestLocators.testCheckBox2);
		log("Test - Restored Power Check Box is selected");
	}
	
	public void clickTestHomeNextBtn()
	{
		waitForElementPresent(TestLocators.testHomeNextBtn);
		click(TestLocators.testHomeNextBtn);
		log("Test Home Next Button Clicked");
	}
	
	public void clickTestMeterBtn()
	{
		waitForElementPresent(TestLocators.testMeterBtn);
		click(TestLocators.testMeterBtn);
		log("Test Meter Button Clicked");
	}
	
	public void clickDoneBtn()
	{
		threadSleep(25000);
		waitForElementPresentWithTime(TestLocators.doneBtn, 120);
		safeClick(TestLocators.doneBtn);
		//click(TestLocators.doneBtn);
		log("Test Done Button Clicked");
	}
	
}
