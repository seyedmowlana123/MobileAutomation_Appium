package PageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Resources.BaseTest;

public class CTLocators {
	
	public static By ctHomeNextBtn;
	public static By portADropdown;
	public static By portBDropdown;
	public static By ctNextBtn;
	public static By ctSize1;
	public static By ctSize2;
	public static By portAPanel1;
	public static By portAPanel2;
	public static By portABreaker1;
	public static By portABreaker2;
	public static By panelValue1;
	public static By panelValue2;
	public static By breakerValue1;
	public static By breakerValue2;
	public static By requiredTextBox;
	public static By modalNextBtn;
	
	public static void locatorsForiOS_Android() {
		if (BaseTest.driverName.equals("Android") || BaseTest.driverName.equals("Local")) 
		{
			ctHomeNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_ct_landing_btn']");
			portADropdown = By.xpath("//android.view.ViewGroup[@resource-id='ct-expand-cont-0']");
			portBDropdown = By.xpath("//android.view.ViewGroup[@resource-id='ct-expand-cont-1']");
			ctNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='ct_mapping_next_btn']");
			ctSize1 = By.xpath("//android.view.ViewGroup[@resource-id='0-ctSize0']");
			ctSize2 = By.xpath("//android.view.ViewGroup[@resource-id='0-ctSize1']");
			portAPanel1 = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-button-ct-mapping-panel-1']");
			portAPanel2 = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-button-ct-mapping-panel-2']");
			portABreaker1 = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-button-ct-mapping-breaker-1']");
			portABreaker2 = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-button-ct-mapping-breaker-2']");
			panelValue1 = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-item-ct-mapping-panel-1-0']");
			panelValue2 = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-item-ct-mapping-panel-2-0']");
			breakerValue1 = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-item-ct-mapping-breaker-1-4']");
			breakerValue2 = By.xpath("//android.view.ViewGroup[@resource-id='custom-dropdown-item-ct-mapping-breaker-2-5']");
			requiredTextBox = By.xpath("//android.widget.EditText[@resource-id='ct_mapping_modal_description']");
			modalNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='ct_mapping_modal_next_btn']");
		}
		else if (BaseTest.driverName.equals("iOS"))
		{
			ctHomeNextBtn = By.id("next_ct_landing_btn");
			portADropdown = By.id("ct-expand-cont-0");
			portBDropdown = By.id("ct-expand-cont-1");
			ctNextBtn = By.id("ct_mapping_next_btn");
			ctSize1 = By.id("0-ctSize0");
			ctSize2 = By.id("0-ctSize1");
			portAPanel1 = By.id("custom-dropdown-button-ct-mapping-panel-1");
			portAPanel2 = By.id("custom-dropdown-button-ct-mapping-panel-2");
			portABreaker1 = By.id("custom-dropdown-button-ct-mapping-breaker-1");
			portABreaker2 = By.id("custom-dropdown-button-ct-mapping-breaker-2");
			panelValue1 = By.id("custom-dropdown-item-ct-mapping-panel-1-0");
			panelValue2 = By.id("custom-dropdown-item-ct-mapping-panel-2-0");
			breakerValue1 = By.id("custom-dropdown-item-ct-mapping-breaker-1-4");
			breakerValue2 = By.id("custom-dropdown-item-ct-mapping-breaker-2-5");
			requiredTextBox = By.id("ct_mapping_modal_description");
			modalNextBtn = By.id("ct_mapping_modal_next_btn");
		}
	}
}