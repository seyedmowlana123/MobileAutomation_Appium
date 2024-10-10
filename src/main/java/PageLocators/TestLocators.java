package PageLocators;

import org.openqa.selenium.By;

import Resources.BaseTest;

public class TestLocators {
	
	public static By testCheckBox1;
	public static By testCheckBox2;
	public static By testHomeNextBtn;
	public static By testMeterBtn;
	public static By retryBtn;
	public static By doneBtn;
	
	public static void locatorsForiOS_Android() {
		if (BaseTest.driverName.equals("Android") || BaseTest.driverName.equals("Local")) 
		{
			testCheckBox1 = By.xpath("//android.widget.CheckBox[@resource-id='safety_standard_checkbox']");
			testCheckBox2 = By.xpath("//android.widget.CheckBox[@resource-id='restored_power_panel']");
			testHomeNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_test_meter_src']");
			testMeterBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_test_meter_src']");
			retryBtn = By.xpath("//android.view.ViewGroup[@resource-id='retry_test_meter']");
			doneBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_test_meter_src']");
		}
		else if (BaseTest.driverName.equals("iOS"))
		{
			testCheckBox1 = By.id("safety_standard_checkbox");
			testCheckBox2 = By.id("restored_power_panel");
			testHomeNextBtn = By.id("next_test_meter_src");
			testMeterBtn = By.id("next_test_meter_src");
			retryBtn = By.id("retry_test_meter");
			doneBtn = By.id("next_test_meter_src");
		}
		
		}

}
