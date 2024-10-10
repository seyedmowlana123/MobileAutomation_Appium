package PageLocators;

import org.openqa.selenium.By;

import Resources.BaseTest;

public class CellRouterLocators {
	
	public static By cellRouterNo;
	public static By cellRouterYes;
	public static By cellRouterNext;
	public static By cellRouterQR;
	public static By cellRouterMACNextBtn;
	public static By cellRouterCmt;
	public static By useCamera;
	public static By uploadGallery;
	public static By cameraShutterBtn;
	public static By cemaraShutterBtn2;
	public static By otherMaterialsYes;
	public static By otherMaterialsNo;
	
	public static void locatorsForiOS_Android()
	{
		if(BaseTest.driverName.equals("Android")|| BaseTest.driverName.equals("Local"))
		{
			cellRouterNo = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonLabel_RadioBlock_cellRouterLanding_0']");
			cellRouterYes = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_cellRouterLanding_1']");
			cellRouterNext = By.xpath("//android.view.ViewGroup[@resource-id='next_cell_router_landing_btn']");
			cellRouterQR = By.xpath("//android.widget.EditText[@resource-id='mac_id_input']");
			cellRouterMACNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_btn']");
			cellRouterCmt = By.xpath("//android.widget.EditText[@resource-id='description_other_power_src']");
			useCamera = By.xpath("//android.view.ViewGroup[@resource-id='use_camera_btn']");
			uploadGallery = By.xpath("//android.view.ViewGroup[@resource-id='upload_from_gallery_btn']");
			otherMaterialsNo = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_leftOverEquipment_0']");
			otherMaterialsYes = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_leftOverEquipment_1']");
			cemaraShutterBtn2 = By.xpath("//android.widget.ImageView[@resource-id=com.android.camera2:id/shutter_button]");
			cameraShutterBtn = By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]");
		
			
		}
		else if(BaseTest.driverName.equals("iOS"))
		{ //By.id("step1");
			cellRouterNo = By.id("RadioButtonLabel_RadioBlock_cellRouterLanding_0");
			cellRouterYes = By.id("RadioButtonInput_RadioBlock_cellRouterLanding_1");
			cellRouterNext = By.id("next_cell_router_landing_btn");
			cellRouterQR = By.id("mac_id_input");
			cellRouterMACNextBtn = By.id("next_btn");
			cellRouterCmt = By.id("description_other_power_src");
			useCamera = By.id("use_camera_btn");
			uploadGallery = By.id("upload_from_gallery_btn");
			otherMaterialsNo = By.id("RadioButtonInput_RadioBlock_leftOverEquipment_0");
			otherMaterialsYes = By.id("RadioButtonInput_RadioBlock_leftOverEquipment_1");
			cemaraShutterBtn2 = By.id("com.android.camera2:id/shutter_button");
			//cameraShutterBtn = By.id("//android.widget.ImageView[@content-desc=\"Shutter\"]");
		}
	}

}
