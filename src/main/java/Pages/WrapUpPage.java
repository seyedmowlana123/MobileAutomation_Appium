package Pages;

import PageLocators.PanelsLocators;
import PageLocators.WrapUpLocators;
import Resources.BasePage;
import io.appium.java_client.AppiumDriver;

public class WrapUpPage extends BasePage{
	
	public WrapUpPage(AppiumDriver driver) 
	{
		super(driver);
		WrapUpLocators.locatorsForiOS_Android();
	}
	
	public void clickWrapUpHome()
	{
		waitForElementPresent(WrapUpLocators.wrapUpNextBtn);
		click(WrapUpLocators.wrapUpNextBtn);
		log("Wrap Up Home Page Next Button is Clicked");
	}
	
	public void clickUploadFromGallery()
	{
		waitForElementPresent(WrapUpLocators.uploadGallery);
		click(WrapUpLocators.uploadGallery);
		log("Upload From Gallery Button Clicked");
	}
	
	public void selectPhoto()
	{
		waitForElementPresent(PanelsLocators.selectPhoto);
		click(PanelsLocators.selectPhoto);
		log("Photo Selected From Gallery");
	}
	
	public void clickPhotoNextBtn()
	{
		waitForElementPresent(WrapUpLocators.uploadNextBtn);
		click(WrapUpLocators.uploadNextBtn);
	}
	
	public void clickMeteringInsightsNextBtn()
	{
		waitForElementPresent(WrapUpLocators.stickerNextBtn);
		click(WrapUpLocators.stickerNextBtn);
		log("Sticker Next Button Clicked");
	}
	
	public void clickLeftOverYes()
	{
		waitForElementPresent(WrapUpLocators.otherMaterialsYes);
		click(WrapUpLocators.otherMaterialsYes);
		log("Left Over Material Yes Button Clicked");
	}
	
	public void typeExcessMeterQty(String qty)
	{
		waitForElementPresent(WrapUpLocators.meterQty);
		type(WrapUpLocators.meterQty, qty);
		log("Excess Meter Quantity Entered");
	}
	
	public void typeExcessCellRouterQty(String qty)
	{
		waitForElementPresent(WrapUpLocators.cellRouterQty);
		type(WrapUpLocators.cellRouterQty, qty);
		log("Excess Cell Router Quantity Entered");
	}
	
	public void clickLeftOverNextBtn()
	{
		waitForElementPresent(WrapUpLocators.leftOverNextBtn);
		click(WrapUpLocators.leftOverNextBtn);
		log("Left Over Material Next Button Clicked");
	}
	
	public void typeWrapUpComment(String comment)
	{
		waitForElementPresent(WrapUpLocators.wrapUpCmt);
		type(WrapUpLocators.wrapUpCmt, comment);
		log("Wrap Up Comment Entered");
	}
	
	public void clickWrapUpDone()
	{
		waitForElementPresent(WrapUpLocators.wrapupDone);
		click(WrapUpLocators.wrapupDone);
		log("Wrap Up Completed");
	}

}
