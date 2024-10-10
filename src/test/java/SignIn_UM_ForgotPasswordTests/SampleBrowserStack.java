package SignIn_UM_ForgotPasswordTests;
//package android;
import java.net.URL;
import java.util.List;
import java.util.function.Function;
import java.net.MalformedURLException;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleBrowserStack {

		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
	    	DesiredCapabilities caps = new DesiredCapabilities();
	    	
	    	// Set your access credentials
	    	caps.setCapability("browserstack.user", "ivneetsinghwahi_JM7E8u");
	    	caps.setCapability("browserstack.key", "Em75LFf8CZ4wbc42wF5s");
	    	
	    	// Set URL of the application under test
	    	caps.setCapability("app", "bs://2a2843bd5a8282735d7ce26dc610957ed3392a6f");
	    	
	    	// Specify device and os_version for testing
	    	caps.setCapability("device", "Samsung Galaxy S21");
	    	caps.setCapability("os_version", "12.0");
	        
	    	// Set other BrowserStack capabilities
	    	caps.setCapability("project", "First Java Project");
	    	caps.setCapability("build", "browserstack-build-1");
	    	caps.setCapability("name", "first_test");
	       
	    	// default port: 9687
	    	System.getProperties().put("http.proxyHost", "localhost");
	    	System.getProperties().put("http.proxyPort", "9687");
	    	// Initialise the remote Webdriver using BrowserStack remote URL
	    	// and desired capabilities defined above
	        AndroidDriver driver = new AndroidDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);
	        
	        // Write your test case statements here
	        
	        // Invoke driver.quit() after the test is done to indicate that the test is completed.
	        //driver.quit();
			
		}
	
}