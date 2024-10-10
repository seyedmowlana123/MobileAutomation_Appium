package PageLocators;

import org.openqa.selenium.By;

import Resources.BaseTest;

public class JobsLocators {

	public static By tabToday;
	public static By tabUpcoming;
	public static By tabPrevious;
	public static By jobId;
	public static By viewButton;
	public static By jobViewBtn;
	public static By addMeterButton;
	public static By deleteJobButton;
	public static By addMeterLabel;
	public static By macAddress;
	public static By nextButton;
	public static By verifyMeterPage;
	public static By meter1stStepButton;
	public static By meter2ndStepButton;
	public static By meter3rdStepButton;
	public static By meter4thStepButton;
	public static By meter5thStepButton;
	public static By meter6thStepButton;
	public static By meter7thStepButton;
	public static By deleteMeter;
	public static By safetyWarning;
	public static By deEnergized;
	public static By energized;
	public static By safetyCheckNextButton;
	public static By useCamera;
	public static By uploadGallery;
	public static By examplePhoto;
	public static By selectPhoto;
	public static By photoNextButton;

	// Non-Work Market
	public static By jobCodeTextBox;
	public static By whereJobCodeLink;
	public static By whereJobCodeText;
	public static By jobsEnterButton;
	public static By nwmPopup;
	public static By confirmationRadioButton;
	public static By continueButton;
	public static By addMorePanelBtn;
	public static By panelsTextBox;

	public static void locatorsForiOS_Android()
	{
		if(BaseTest.driverName.equals("Android")|| BaseTest.driverName.equals("Local"))
		{
			tabToday = By.xpath("//android.view.ViewGroup[@resource-id='today_btn']");
			tabUpcoming = By.xpath("//android.view.ViewGroup[@resource-id='upcoming_btn']");
			tabPrevious = By.xpath("//android.view.ViewGroup[@resource-id='previous_btn']");
			jobId = By.xpath("//android.widget.TextView[@text='Job E00009399']");
			viewButton = By.xpath("//android.widget.TextView[@text='View']");
			jobViewBtn = By.xpath("//android.view.ViewGroup[@resource-id='job-button-pill-1']");
			addMeterButton = By.xpath("//android.view.ViewGroup[@resource-id='add_meter_btn']");
			deleteJobButton = By.xpath("//android.view.ViewGroup[@resource-id='delete_job_btn']");
			addMeterLabel = By.xpath("//android.widget.TextView[@text='Add Meter']");
			macAddress = By.xpath("//android.widget.EditText[@resource-id='mac_id_input']");
			nextButton = By.xpath("//android.view.ViewGroup[@resource-id='next_btn']");
			verifyMeterPage = By.xpath("//android.widget.TextView[@text='Meter']");
			meter1stStepButton = By.xpath("//android.view.ViewGroup[@resource-id='step1']");
			meter2ndStepButton = By.xpath("//android.view.ViewGroup[@resource-id='step2']");
			meter3rdStepButton = By.xpath("//android.view.ViewGroup[@resource-id='step3']");
			meter4thStepButton = By.xpath("//android.view.ViewGroup[@resource-id='step4']");
			meter5thStepButton = By.xpath("//android.view.ViewGroup[@resource-id='step5']");
			meter6thStepButton = By.xpath("//android.view.ViewGroup[@resource-id='step6']");
			meter7thStepButton = By.xpath("//android.view.ViewGroup[@resource-id='step7']");
			deleteMeter = By.xpath("//android.view.ViewGroup[@resource-id='meter_delete']");
			safetyWarning = By.xpath("//android.widget.TextView[@text='Safety Warning!']");
			deEnergized = By.xpath("//android.view.ViewGroup[@resource-id='radioButtonInputradioButton|0']");
			energized = By.xpath("//android.view.ViewGroup[@resource-id='radioButtonInputradioButton|1']");
			safetyCheckNextButton = By.xpath("//android.view.ViewGroup[@resource-id='safety_check']");
			useCamera = By.xpath("//android.view.ViewGroup[@resource-id='use_camera_btn']");
			uploadGallery = By.xpath("//android.view.ViewGroup[@resource-id='upload_from_gallery_btn']");
			examplePhoto = By.xpath("//android.view.ViewGroup[@resource-id='example_photo_btn']");
			
			if(BaseTest.driverName.equals("Android"))
			{
				selectPhoto = By.xpath("//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb']");
			}
			else
			{
				selectPhoto = By.xpath("//android.widget.ImageView[@resource-id='com.android.documentsui:id/icon_thumb']");
			}

			photoNextButton = By.xpath("//android.view.ViewGroup[@resource-id='next_btn']");

			// Non-Work Market
			jobCodeTextBox = By.xpath("//android.widget.EditText[@resource-id='job_code_input']");
			whereJobCodeLink = By.xpath("//android.widget.TextView[@text='Where is the job code?']");
			whereJobCodeText = By.xpath("//android.widget.TextView[@text='Every meter has an associated job code']");
			jobsEnterButton = By.xpath("//android.view.ViewGroup[@resource-id='enter_btn']");
			nwmPopup = By.xpath("//android.widget.TextView[@text='Please confirm that the entered job code and install location are correct:']");
			confirmationRadioButton = By.xpath("//android.view.ViewGroup[@resource-id='radioButtonInputradioButton|0']");
			continueButton = By.xpath("//android.view.ViewGroup[@resource-id='Button']");
			addMorePanelBtn = By.xpath("//android.view.ViewGroup[@resource-id='add-more-panels']");
			panelsTextBox = By.xpath("//android.widget.EditText[@resource-id='panel_name_input']");
		}
		else if(BaseTest.driverName.equals("iOS"))
		{
			tabToday = By.id("today_btn");
			tabUpcoming = By.id("upcoming_btn");
			tabPrevious = By.id("previous_btn");
			jobId = 
			viewButton = 
			jobViewBtn = By.id("job-button-pill-0");
			addMeterButton = By.id("add_meter_btn");
			deleteJobButton = By.id("delete_job_btn");
			addMeterLabel = 
			macAddress = By.id("mac_id_input");
			nextButton = By.id("next_btn");
			verifyMeterPage = 
			meter1stStepButton = By.id("step1");
			meter2ndStepButton = By.id("step2");
			meter3rdStepButton = By.id("step3");
			meter4thStepButton = By.id("step4");
			meter5thStepButton = By.id("step5");
			meter6thStepButton = By.id("step6");
			meter7thStepButton = By.id("step7");
			deleteMeter = By.id("meter_delete");
			safetyWarning =
			deEnergized = By.id("radioButtonInputradioButton|0");
			energized = By.id("radioButtonInputradioButton|1");
			safetyCheckNextButton = By.id("safety_check");
			useCamera = By.id("use_camera_btn");
			uploadGallery = By.id("upload_from_gallery_btn");
			examplePhoto = By.id("example_photo_btn");
			selectPhoto =
			photoNextButton = By.id("next_btn");
			addMorePanelBtn = By.id("add-more-panels");
			panelsTextBox = By.id("panel_name_input");
		}
	}
	
	
}
