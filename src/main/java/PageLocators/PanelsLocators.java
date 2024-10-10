package PageLocators;

import org.openqa.selenium.By;

import Resources.BaseTest;

public class PanelsLocators {
	
	public static By panelsHomePage;
	public static By panelsTextBox;
	public static By panelsNextBtn;
	public static By numberedPanelsYes;
	public static By numberedPanelsNo;
	public static By singlePhasePanel;
	public static By threePhasePanel;
	public static By otherPanel;
	public static By voltage120_240;
	public static By voltageOther;
	public static By leftHome;
	public static By leftOddNumbers;
	public static By leftEvenNumbers;
	public static By leftConsecutiveNumbers;
	public static By leftNextBtn;
	public static By rightHome;
	public static By rightOddNumbers;
	public static By rightEvenNumbers;
	public static By rightConsecutiveNumbers;
	public static By rightNextBtn;
	public static By patternTopToBottom;
	public static By patternBottomToTop;
	public static By patternILine;
	public static By patternNextBtn;
	public static By panelLeftHome;
	public static By panelLeftStarting;
	public static By panelLeftEnding;
	public static By panelLeftNextBtn;
	public static By panelRightHome;
	public static By panelRightStarting;
	public static By panelRightEnding;
	public static By panelRightNextBtn;
	public static By breakerLeftHeading;
	public static By breakerLeftPhasingPattern;
	public static By breakerLeftNextBtn;
	public static By breakerRightHeading;
	public static By breakerRightPhasingPattern;
	public static By breakerRightNextBtn;
	public static By useCamera;
	public static By uploadPhoto;
	public static By examplePhoto;
	public static By selectPhoto;
	public static By photoNextBtn;
	public static By panelMonitorNo;
	public static By panelMonitorYes;
	public static By panelMonitorNextBtn;
	
	public static By switchBoardHomepage;
	public static By addMoreSwitches;
	public static By addSwitchPage;
	public static By switchName;
	public static By addSwitchBtn;
	public static By editSwitch;
	public static By editSwitchPage;
	public static By editSwitchTextBox;
	public static By editSwitchBtn;
	public static By deleteSwitchBtn;
	public static By switchNextBtn;
	public static By uploadFromGalleryBtn;
	
	
	public static void locatorsForiOS_Android() {
		if (BaseTest.driverName.equals("Android") || BaseTest.driverName.equals("Local")) 
		{
			//Panels Landing Page
			panelsHomePage = By.xpath("//android.widget.TextView[@text='Begin by telling us about the panel where the meter is being installed.']");
			panelsTextBox = By.xpath("//android.widget.EditText[@resource-id='panel_name_input']");
			panelsNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='panel_install_init_next_btn']");
			numberedPanelsYes = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_panelType_0']");
			numberedPanelsNo = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_panelType_1']");
			singlePhasePanel = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_type_0']");
			threePhasePanel = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_type_1']");
			otherPanel = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_type_2']");
			voltage120_240 = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_voltage_0']");
			voltageOther = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_voltage_1']");
			//Side Selection
			leftHome = By.xpath("//android.widget.TextView[@text='What breaker numbers are in use down the left side of the panel?']");
			leftOddNumbers = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_panelLeft_0']");
			leftEvenNumbers = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_panelLeft_1']");
			leftConsecutiveNumbers = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_panelLeft_2']");
			leftNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_btn']");
			rightHome = By.xpath("//android.widget.TextView[@text='What breaker numbers are in use down the right side of the panel?']");
			rightOddNumbers = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_panelRight_0']");
			rightEvenNumbers = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_panelRight_1']");
			rightConsecutiveNumbers = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_panelRight_2']");
			rightNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_btn']");
			//Phasing Pattern Selection
			patternTopToBottom = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_phasingPattern_0']");
			patternBottomToTop = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_phasingPattern_1']");
			patternILine = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_phasingPattern_2']");
			patternNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_btn']");
			//Breaker Number Entering
			panelLeftHome = By.xpath("//android.widget.TextView[contains(@text,'What is the range')]");
			panelLeftStarting = By.xpath("//android.widget.EditText[@resource-id='panel_left_starting_from_input']");
			panelLeftEnding = By.xpath("//android.widget.EditText[@resource-id='panel_left_ending_at_input']");
			panelLeftNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='panel_left_next_input']");
			panelRightHome = By.xpath("//android.widget.TextView[contains(@text,'What is the range')]");
			panelRightStarting = By.xpath("//android.widget.EditText[@resource-id='panel_right_starting_from_input']");
			panelRightEnding = By.xpath("//android.widget.EditText[@resource-id='panel_right_ending_at_input']");
			panelRightNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='panel_right_next_input']");
			//Breaker Configuration
			breakerLeftHeading = By.xpath("//android.widget.TextView[@text='Left Side Breaker Layout']");
			breakerLeftPhasingPattern = By.xpath("//android.view.ViewGroup[@resource-id='left_phasing_pattern']");
			breakerLeftNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='left_breaker_layout_next_btn']");
			breakerRightHeading = By.xpath("//android.widget.TextView[@text='Right Side Breaker Layout']");
			breakerRightPhasingPattern = By.xpath("//android.view.ViewGroup[@resource-id='right_phasing_pattern']");
			breakerRightNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='right_breaker_layout_next_btn']");
			//Photo Upload
			useCamera = By.xpath("//android.view.ViewGroup[@resource-id='use_camera_btn']");
			uploadPhoto = By.xpath("//android.view.ViewGroup[@resource-id='upload_from_gallery_btn']");
			examplePhoto = By.xpath("//android.view.ViewGroup[@resource-id='example_photo_btn']");
			if(BaseTest.driverName.equals("Android"))
			{
				selectPhoto = By.xpath("//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb']");
			}
			else
			{
				selectPhoto = By.xpath("//android.widget.ImageView[@resource-id='com.android.documentsui:id/icon_thumb']");
			}
			photoNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_btn']");
			
			panelMonitorNo = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_otherMonitoringPanels_0']");
			panelMonitorYes = By.xpath("//android.view.ViewGroup[@resource-id='RadioButtonInput_RadioBlock_otherMonitoringPanels_1']");
			panelMonitorNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_btn']");
			
			//Switchboard
			switchBoardHomepage = By.xpath("//android.widget.TextView[@text='Please describe each switch found on this panel.']");
			addMoreSwitches = By.xpath("//android.view.ViewGroup[@resource-id='add-more-switches']");
			addSwitchPage = By.xpath("//android.widget.TextView[@text='Add Switch']");
			switchName = By.xpath("//android.widget.EditText[@resource-id='add_switch_name']");
			addSwitchBtn = By.xpath("//android.view.ViewGroup[@resource-id='add_switch_button']");
			editSwitch = By.xpath("//android.view.ViewGroup[@resource-id='add-more-switches']");
			editSwitchPage = By.xpath("//android.widget.TextView[@text='Edit Switch']");
			editSwitchTextBox = By.xpath("//android.widget.EditText[@resource-id='edit_switch_name']");
			editSwitchBtn = By.xpath("//android.view.ViewGroup[@resource-id='edit_switch_button']");
			deleteSwitchBtn = By.xpath("//android.view.ViewGroup[@resource-id='delete_switch_button']");
			switchNextBtn = By.xpath("//android.view.ViewGroup[@resource-id='next_btn']");
			uploadFromGalleryBtn = By.xpath("//android.view.ViewGroup[@resource-id='upload_from_gallery_btn']");
			
		}
		else if (BaseTest.driverName.equals("iOS"))
		{
			//Panels Landing Page
			panelsHomePage = 
			panelsTextBox = By.id("panel_name_input");
			panelsNextBtn = By.id("panel_install_init_next_btn");
			numberedPanelsYes = By.id("RadioButtonInput_RadioBlock_panelType_0");
			numberedPanelsNo = By.id("RadioButtonInput_RadioBlock_panelType_1");
			singlePhasePanel = By.id("RadioButtonInput_RadioBlock_type_0");
			threePhasePanel = By.id("RadioButtonInput_RadioBlock_type_1");
			otherPanel = By.id("RadioButtonInput_RadioBlock_type_2");
			voltage120_240 = By.id("RadioButtonInput_RadioBlock_voltage_0");
			voltageOther = By.id("RadioButtonInput_RadioBlock_voltage_1");
			//Side Selection
			leftHome = 
			leftOddNumbers = By.id("RadioButtonInput_RadioBlock_panelLeft_0");
			leftEvenNumbers = By.id("RadioButtonInput_RadioBlock_panelLeft_1");
			leftConsecutiveNumbers = By.id("RadioButtonInput_RadioBlock_panelLeft_2");
			leftNextBtn = By.id("next_btn");
			rightHome = 
			rightOddNumbers = By.id("RadioButtonInput_RadioBlock_panelRight_0");
			rightEvenNumbers = By.id("RadioButtonInput_RadioBlock_panelRight_1");
			rightConsecutiveNumbers = By.id("RadioButtonInput_RadioBlock_panelRight_2");
			rightNextBtn = By.id("next_btn");
			//Phasing Pattern Selection
			patternTopToBottom = By.id("RadioButtonInput_RadioBlock_phasingPattern_0");
			patternBottomToTop = By.id("RadioButtonInput_RadioBlock_phasingPattern_1");
			patternILine = By.id("RadioButtonInput_RadioBlock_phasingPattern_2");
			patternNextBtn = By.id("next_btn");
			//Breaker Number Entering
			panelLeftHome = 
			panelLeftStarting = By.id("panel_left_starting_from_input");
			panelLeftEnding = By.id("panel_left_ending_at_input");
			panelLeftNextBtn = By.id("panel_left_next_input");
			panelRightHome = 
			panelRightStarting = By.id("panel_right_starting_from_input");
			panelRightEnding = By.id("panel_right_ending_at_input");
			panelRightNextBtn = By.id("panel_right_next_input");
			//Breaker Configuration
			breakerLeftHeading = 
			breakerLeftPhasingPattern = By.id("left_phasing_pattern");
			breakerLeftNextBtn = By.id("left_breaker_layout_next_btn");
			breakerRightHeading =
			breakerRightPhasingPattern = By.id("right_phasing_pattern");
			breakerRightNextBtn = By.id("right_breaker_layout_next_btn");
			//Photo Upload
			useCamera = By.id("use_camera_btn");
			uploadPhoto = By.id("upload_from_gallery_btn");
			examplePhoto = By.id("example_photo_btn");
			photoNextBtn = By.id("next_btn");
			
			panelMonitorNo = By.id("RadioButtonInput_RadioBlock_otherMonitoringPanels_0");
			panelMonitorYes = By.id("RadioButtonInput_RadioBlock_otherMonitoringPanels_1");
			panelMonitorNextBtn = By.id("next_btn");
			
			//Switchboard
			switchBoardHomepage = 
			addMoreSwitches = By.id("add-more-switches");
			//addSwitchPage =
			switchName = By.id("add_switch_name");
			addSwitchBtn = By.id("add_switch_button");
			editSwitch = By.id("add-more-switches");
			editSwitchPage = 
			editSwitchTextBox = By.id("edit_switch_name");
			editSwitchBtn = By.id("edit_switch_button");
			deleteSwitchBtn = By.id("delete_switch_button");
			switchNextBtn = By.id("next_btn");
			uploadFromGalleryBtn = By.id("upload_from_gallery_btn");
		}

	}
}
