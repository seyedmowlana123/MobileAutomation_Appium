package Pages;

import PageLocators.CTLocators;
import PageLocators.PanelsLocators;
import Resources.BasePage;
import Resources.BasePage.Direction;
import io.appium.java_client.AppiumDriver;

public class CTsPage extends BasePage{
	
	public CTsPage(AppiumDriver driver) 
	{
		super(driver);
		CTLocators.locatorsForiOS_Android();
	}
	
	public void clickCTHomeNextBtn()
	{
		isElementPresent(CTLocators.ctHomeNextBtn);
		click(CTLocators.ctHomeNextBtn);
	}
	
	public void clickPortADropDown()
	{
		isElementPresent(CTLocators.portADropdown);
		click(CTLocators.portADropdown);
		log("Port A DropDown is clicked");
	}
	
	public void clickCTSize()
	{
		isElementPresent(CTLocators.ctSize1);
		click(CTLocators.ctSize1);
		log("CT Size is selected");
	}
	
	public void clickPanelA1DropDown()
	{
		isElementPresent(CTLocators.portAPanel1);
		click(CTLocators.portAPanel1);
		log("Panel A1 Dropdown is clicked");
	}
	
	public void clickPanelA1Value()
	{
		isElementPresent(CTLocators.panelValue1);
		click(CTLocators.panelValue1);
		log("Panel A1 Value is selected");
	}
	
	public void clickBreakerA1DropDown()
	{
		isElementPresent(CTLocators.portABreaker1);
		click(CTLocators.portABreaker1);
		log("Breaker A1 Dropdown is selected");
	}
	
	public void clickBreakerA1Value()
	{
		isElementPresent(CTLocators.breakerValue1);
		click(CTLocators.breakerValue1);
		log("Breaker A1 Value is selected");
	}
	
	public void clickPanelA2DropDown()
	{
		isElementPresent(CTLocators.portAPanel2);
		click(CTLocators.portAPanel2);
		log("Panel A2 Dropdown is clicked");
	}

	public void clickPanelA2Value()
	{
		isElementPresent(CTLocators.panelValue2);
		click(CTLocators.panelValue2);
		log("Panel A2 Value is selected");
	}
	
	public void clickBreakerA2DropDown()
	{
		isElementPresent(CTLocators.portABreaker2);
		click(CTLocators.portABreaker2);
		log("Breaker A2 Dropdown is selected");
	}
	
	public void clickBreakerA2Value()
	{
		isElementPresent(CTLocators.breakerValue2);
		click(CTLocators.breakerValue2);
		log("Breaker A2 Value is selected");
	}
	
	public void clickCTMainNextBtn()
	{
		isElementPresent(CTLocators.ctNextBtn);
		click(CTLocators.ctNextBtn);
		log("Clicked CT Main Page Next Button");
	}
	
	public void swipeCT() 
	{
		swipeScreenSmall(Direction.UP);
	}
	
	public void typeRequired(String required)
	{
		isElementPresent(CTLocators.requiredTextBox);
		type(CTLocators.requiredTextBox, required);
		log("Typed Brief Explanation");
	}
	
	public void clickModalNextBtn()
	{
		isElementPresent(CTLocators.modalNextBtn);
		click(CTLocators.modalNextBtn);
		log("Clicked CT Modal Next Button");
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
	
}
