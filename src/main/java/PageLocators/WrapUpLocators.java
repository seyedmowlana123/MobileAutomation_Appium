package PageLocators;

import org.openqa.selenium.By;

import Resources.BaseTest;

public class WrapUpLocators {
	
	public static By wrapUpNextBtn;
	public static By useCamera;
	public static By uploadGallery;
	public static By uploadNextBtn;
	public static By cemaraShutterBtn;
	public static By cemaraShutterBtn2;
	public static By stickerNextBtn;
	public static By otherMaterialsYes;
	public static By otherMaterialsNo;
	public static By meterQty;
	public static By cellRouterQty;
	public static By cTQty;
	public static By wireQty;
	public static By leftOverNextBtn;
	public static By wrapUpCmt;
	public static By wrapupDone;
	
	public static void locatorsForiOS_Android()
	{
		if(BaseTest.driverName.equals("Android")|| BaseTest.driverName.equals("Local"))
		{			
			wrapUpNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_wrap_up_installation']");
			useCamera = By.xpath("//android.view.ViewGroup[@resource-id='use_camera_btn']");
			uploadGallery = By.xpath("//android.view.ViewGroup[@resource-id='upload_from_gallery_btn']");
			uploadNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_btn']");
			stickerNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_sticker_instruction']");
			otherMaterialsNo = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_leftOverEquipment_0']");
			otherMaterialsYes = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_leftOverEquipment_1']");
			cemaraShutterBtn2 = By.xpath("//android.widget.ImageView[@resource-id=com.android.camera2:id/shutter_button]");
			cemaraShutterBtn = By.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]");
			meterQty = By.xpath("//android.widget.EditText[@resource-id='meter_quantity_id_input']");
			cellRouterQty = By.xpath("//android.widget.EditText[@resource-id='cell_router_id_input']");
			cTQty = By.xpath("//android.widget.EditText[@resource-id='ct_harness_id_input']");
			wireQty = By.xpath("//android.widget.EditText[@resource-id='wire_tap_id_input']");
			leftOverNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_left_over_equipment']");
			wrapUpCmt = By.xpath("//android.widget.EditText[@resource-id='description_final_notes']");
			wrapupDone = By.xpath("//android.view.ViewGroup[@resource-id='next_final_notes']");
		}
		else if(BaseTest.driverName.equals("iOS"))
		{
			wrapUpNextBtn = By.id("next_wrap_up_installation");
			useCamera = By.id("use_camera_btn']");
			uploadGallery = By.id("upload_from_gallery_btn");
			uploadNextBtn = By.id("next_btn");
			stickerNextBtn = By.id("next_sticker_instruction");
			otherMaterialsNo = By.id("RadioButtonInput_RadioBlock_leftOverEquipment_0");
			otherMaterialsYes = By.id("'RadioButtonInput_RadioBlock_leftOverEquipment_1");
			cemaraShutterBtn2 = By.id("com.android.camera2:id/shutter_button");
			meterQty = By.id("meter_quantity_id_input");
			cellRouterQty = By.id("cell_router_id_input");
			cTQty = By.id("ct_harness_id_input");
			wireQty = By.id("wire_tap_id_input");
			leftOverNextBtn = By.id("next_left_over_equipment");
			wrapUpCmt = By.id("description_final_notes");
			wrapupDone = By.id("next_final_notes");
		}
	}

}
