package PageLocators;

import org.openqa.selenium.By;

import Resources.BaseTest;

public class PowerLocators {
	
	public static By powerHomePage;
	public static By powerHomeNextBtn;
	public static By powerSourceLabel;
	public static By powerSourceRadioBtn;
	public static By breakerSelectionPhaseA;
	public static By breakerSelectionPhaseB;
	public static By breakerSelectionPhaseC;
	public static By breakerSelectionNextBtn;
	public static By phaseADropDown1stValue;
	public static By phaseBDropDown1stValue;
	public static By phaseCDropDown1stValue;
	
	public static void locatorsForiOS_Android() {
		if (BaseTest.driverName.equals("Android") || BaseTest.driverName.equals("Local")) 
		{
			powerHomePage = By.xpath("//android.widget.TextView[@text='Connect the meter power leads to phase A, B, and C supply lines as indicated.']");
			powerHomeNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='power_conn_landing_next_btn']");
			powerSourceLabel = By.xpath("//android.widget.TextView[@text='What source is providing power to the meter?']");
			powerSourceRadioBtn = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_powerSource_0']");
			breakerSelectionPhaseA = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-button-meter-lead-0']");
			breakerSelectionPhaseB = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-button-meter-lead-1']");
			breakerSelectionPhaseC = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-button-meter-lead-2']");
			breakerSelectionNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_panel_power_src']");
			phaseADropDown1stValue = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-item-meter-lead-0-0']");
			phaseBDropDown1stValue = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-item-meter-lead-1-0']");
			phaseCDropDown1stValue = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-item-meter-lead-2-0']");
		}
		else if (BaseTest.driverName.equals("iOS"))
		{
			powerHomePage = 
			powerHomeNextBtn = By.id("power_conn_landing_next_btn");
			powerSourceLabel = 
			powerSourceRadioBtn = By.id("RadioButtonInput_RadioBlock_powerSource_0");
			breakerSelectionPhaseA = By.id("custom-dropdown-button-meter-lead-0");
			breakerSelectionPhaseB = By.id("custom-dropdown-button-meter-lead-1");
			breakerSelectionPhaseC = By.id("custom-dropdown-button-meter-lead-2");
			breakerSelectionNextBtn = By.id("next_panel_power_src");
			phaseADropDown1stValue = By.id("custom-dropdown-item-meter-lead-0-0");
			phaseBDropDown1stValue = By.id("custom-dropdown-item-meter-lead-1-0");
			phaseCDropDown1stValue = By.id("custom-dropdown-item-meter-lead-2-0");
		}
		
		}
}
