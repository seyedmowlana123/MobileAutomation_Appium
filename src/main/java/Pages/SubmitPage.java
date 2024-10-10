package Pages;

import PageLocators.SubmitLocators;
import Resources.BasePage;
import io.appium.java_client.AppiumDriver;

public class SubmitPage extends BasePage{
	
	public SubmitPage(AppiumDriver driver) 
	{
		super(driver);
		SubmitLocators.locatorsForiOS_Android();
	}
	
	public void clickFinalizeInstallBtn()
	{
		waitForElementPresent(SubmitLocators.finalizeInstallBtn);
		click(SubmitLocators.finalizeInstallBtn);
	}
	
	public void clickDoneBtn()
	{
		waitForElementPresent(SubmitLocators.submitDoneBtn);
		click(SubmitLocators.submitDoneBtn);
	}

}
