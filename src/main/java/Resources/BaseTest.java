package Resources;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	public AppiumDriver driver;
	private BasePage basePage;
	public static Properties prop;

	public static String userName;
	public static String accessKey;
	public static String driverName;
	public static String nwmUsername;
	public static String nwmPassword;
	public static String wmUsername;
	public static String wmPassword;
	@BeforeTest
	public void launchApp() throws IOException
	{
		
		String resourceName = "Redaptive.properties";
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		prop = new Properties();
		try(InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
			prop.load(resourceStream);
			userName = prop.getProperty("browserStackUserName");
			accessKey = prop.getProperty("browserAccessKey");
			nwmUsername = prop.getProperty("nwmUserName");
			nwmPassword = prop.getProperty("nwmPassword");
			wmUsername = prop.getProperty("wmUserName");
			wmPassword = prop.getProperty("wmPassword");
		}
		
		driverName = prop.getProperty("platform");
		System.out.println("Platform : "+driverName);
		
		if (driverName.equals("Android")){
		driver = LaunchAndroidApp();
		}
		else if (driverName.equals("iOS"))
		{
		driver = LaunchiOSApp();
		}
		else if (driverName.equals("Local"))
		{
		driver = LaunchAndroidAppEmulator();
		}
		else {
			basePage.log("Invalid Platform. Please select Android or iOS");
			return;
		}
	}
	
	//Running in Local in Pixel-5 Emulator
	public static AndroidDriver LaunchAndroidAppEmulator() throws MalformedURLException {
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("appPackage", "com.redaptive");
		caps.setCapability("appActivity", "com.redaptive.MainActivity");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel-5");
		
		// Instantiate Appium Driver
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	
		return driver;
	}
	
	//Run Android in BrowserStack 
	public static AndroidDriver LaunchAndroidApp() throws MalformedURLException {

		// Use Java Client v6.0.0 or above
		DesiredCapabilities capabilities = new DesiredCapabilities();
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("buildName", prop.getProperty("bsBuildName"));
		browserstackOptions.put("sessionName", "Android_Test");
		//browserstackOptions.put("local", "true");
		capabilities.setCapability("bstack:options", browserstackOptions);
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("platformVersion", "12.0");
		capabilities.setCapability("deviceName", prop.getProperty("bsDeviceName"));
		capabilities.setCapability("app", "bs://87bd1d9ab15633cbb537f59371c15d5cfa53ee5c");		 

		// Instantiate Appium Driver for Android
		AndroidDriver driver = new AndroidDriver(
				new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), capabilities);
		
		return driver;
	}
	
	// Run iOS in BrowserStack 
	public static IOSDriver LaunchiOSApp() throws MalformedURLException {
		// Set the Desired Capabilities

		// Use Java Client v6.0.0 or above
		DesiredCapabilities capabilities = new DesiredCapabilities();
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("buildName", "iOS_Build_First");
		browserstackOptions.put("sessionName", "iOS_Test");
		capabilities.setCapability("bstack:options", browserstackOptions);
		capabilities.setCapability("platformName", "ios");
		capabilities.setCapability("platformVersion", "14");
		capabilities.setCapability("deviceName", "iPhone 12");
		capabilities.setCapability("app", "bs://54e790938072cd72299345e8e30daa03ba7456ca");

		// Instantiate Appium Driver for iOS
		IOSDriver driver = new IOSDriver(
				new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), capabilities);

		return driver;
	}
	
	public BasePage getBasePage() throws IOException{
		if (basePage == null) {
			basePage = new BasePage(this.driver);
		}
		return basePage;
	}
	
}
