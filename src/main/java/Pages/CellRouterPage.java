package Pages;

import PageLocators.CellRouterLocators;
import PageLocators.PanelsLocators;
import Resources.BasePage;
import io.appium.java_client.AppiumDriver;

public class CellRouterPage extends BasePage{
	
	public CellRouterPage(AppiumDriver driver) 
	{
		super(driver);
		CellRouterLocators.locatorsForiOS_Android();
	}
	
	public void clickCellRouterYes()
	{
		waitForElementPresent(CellRouterLocators.cellRouterYes);
		click(CellRouterLocators.cellRouterYes);
		log("Cell Router Yes Radio button is clicked");
	}
	
	public void cellRouterHomeNextBtn()
	{
		waitForElementPresent(CellRouterLocators.cellRouterNext);
		click(CellRouterLocators.cellRouterNext);
		log("Cell Router Next button is clicked");
	}
	
	public void clickRouterMacTextField()
	{
		threadSleep(2000);
		waitForElementPresent(CellRouterLocators.cellRouterQR);
		click(CellRouterLocators.cellRouterQR);
	}
	
	public void typeRouterMac(String mac)
	{
		waitForElementPresent(CellRouterLocators.cellRouterQR);
		type(CellRouterLocators.cellRouterQR, mac);
		log("Cell Router Mac Address Typed");
	}
	
	public void clickMacNextBtn()
	{
		waitForElementPresent(CellRouterLocators.cellRouterMACNextBtn);
		click(CellRouterLocators.cellRouterMACNextBtn);
		log("Cell Router MAC Next button is clicked");
	}
	
	public void clickOptionalNextBtn()
	{
		waitForElementPresent(CellRouterLocators.cellRouterNext);
		click(CellRouterLocators.cellRouterNext);
		log("Cell Router Optional Next button is clicked");
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
