package PageLocators;

import org.openqa.selenium.By;

import Resources.BaseTest;

public class SubmitLocators {
	
	public static By finalizeInstallBtn;
	public static By submitCancelBtn;
	public static By submitDoneBtn;
	public static By InstallationDoneText;
	public static By submitReturnToHomeBtn;
	
	public static void locatorsForiOS_Android() {
		if (BaseTest.driverName.equals("Android") || BaseTest.driverName.equals("Local")) 
		{
			finalizeInstallBtn = By.xpath("//android.view.ViewGroup[@resource-id='finalize_submit_landing_btn']");
			submitCancelBtn = By.xpath("//android.view.ViewGroup[@resource-id='submit_steps_cancel_btn']");
			submitDoneBtn = By.xpath("//android.view.ViewGroup[@resource-id='submit_steps_cancel_btn']");
			InstallationDoneText = By.xpath("//android.widget.TextView[@text='The meter installation is done!']");
			submitReturnToHomeBtn = By.xpath("//android.view.ViewGroup[@resource-id='submit_complete_home_btn']");
		}
		else if (BaseTest.driverName.equals("iOS"))
		{
			finalizeInstallBtn = By.id("finalize_submit_landing_btn");
			submitCancelBtn = By.id("submit_steps_cancel_btn");
			submitDoneBtn = By.id("next_test_meter_src");
			InstallationDoneText = 
			submitReturnToHomeBtn = By.id("submit_complete_home_btn");
		}
		
		}

}
