package Resources;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class BasePage {
	
	public AppiumDriver driver;

	public BasePage(AppiumDriver driver)
	{
		this.driver = driver;
	}
	public Actions getActions() {
		return new Actions(this.driver);
	}
	// Refreshing the page
	public void refreshPage() {
		driver.navigate().refresh();
	}
	//Logs
	public static void log(String message) {
		Reporter.log(message, true);
	}
	//Click the element
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	//Double click an element
	public void doubleClick(By locator) {
		getActions().doubleClick(driver.findElement(locator)).build().perform();
		log("Double Clicked on Element");
	}
	//Clear the element
	public void clear(By locator) {
		driver.findElement(locator).clear();
	}
	//Type into an element
	public void type(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}
	//Get text from an element
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	//Getting an attribute from  particular element
	public String getAttribute(By locator, String Attribute) {
		return driver.findElement(locator).getAttribute(Attribute);
	}
	//Getting a Random number
	public static int generateRandomNumber()
	{
		Random number = new Random();
		int a = number.nextInt(10000);
		return(a);
	}
	//Waits
		// Force Wait
		public void threadSleep(int ms) {
			try {
				Thread.sleep(ms);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Wait for visibility of a locator
		public void waitForElementPresent(By locator) {
			final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		// Wait for an element to be clickable
		public void safeClick(By locator) {
			try {
				final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.elementToBeClickable(locator));
				driver.findElement(locator).click();
			} catch (final WebDriverException e) {
				final Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(locator)).perform();
				action.click().perform();
			}
		}

		// Verify an element present
		public boolean isElementPresent(By locator) {
			boolean value;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			try {
				driver.findElement(locator).isDisplayed();
				value = true;
			} catch (final NoSuchElementException e) {
				value = false;
			} finally {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			}
			return value;
		}

		public void waitForElementPresentWithTime(By locator, int sec) {
			final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		//Full Swipe
		@SuppressWarnings({ "deprecation", "rawtypes" })
		public void swipeScreen(Direction dir) {
		    System.out.println("swipeScreen(): dir: '" + dir + "'"); // log for which direction

		    // Animation default time:
		    //  - Android: 300 ms
		    //  - iOS: 200 ms
		    // final value depends on your app and could be greater
		    final int ANIMATION_TIME = 200; // ms

		    final int PRESS_TIME = 200; // ms

		    int edgeBorder = 10; // better avoid edges
		    PointOption pointOptionStart, pointOptionEnd;

		    // init screen variables
		    Dimension dims = driver.manage().window().getSize();

		    // init start point = center of screen
		    pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

		    switch (dir) {
		        case DOWN: // center of footer
		            pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
		            break;
		        case UP: // center of header
		            pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
		            break;
		        case LEFT: // center of left side
		            pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
		            break;
		        case RIGHT: // center of right side
		            pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
		            break;
		        default:
		            throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
		    }

		    // execute swipe using TouchAction
		    try {
		        new TouchAction((PerformsTouchActions) driver)
		                .press(pointOptionStart)
		                // a bit more reliable when we add small wait
		                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
		                .moveTo(pointOptionEnd)
		                .release().perform();
		    } catch (Exception e) {
		        System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
		        return;
		    }

		    // always allow swipe action to complete
		    try {
		        Thread.sleep(ANIMATION_TIME);
		    } catch (InterruptedException e) {
		        // ignore
		    }
		}

		public enum Direction {
		    UP,
		    DOWN,
		    LEFT,
		    RIGHT;
		}
		
		//Small Swipe
		@SuppressWarnings({ "deprecation", "rawtypes" })
		public void swipeScreenSmall(Direction dir) {
		    System.out.println("swipeScreenSmall(): dir: '" + dir + "'"); // log for which direction

		    // Animation default time:
		    //  - Android: 300 ms
		    //  - iOS: 200 ms
		    // final value depends on your app and could be greater
		    final int ANIMATION_TIME = 200; // ms

		    final int PRESS_TIME = 200; // ms

		    PointOption pointOptionStart, pointOptionEnd;

		    // init screen variables
		    Dimension dims = driver.manage().window().getSize();

		    // init start point = center of screen
		    pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

		    // reduce swipe move into multiplier times comparing to swipeScreen move
		    int mult = 3; // multiplier
		    switch (dir) {
		        case DOWN: // center of footer
		            pointOptionEnd = PointOption.point(dims.width / 2, (dims.height / 2) + (dims.height / 2) / mult);
		            break;
		        case UP: // center of header
		            pointOptionEnd = PointOption.point(dims.width / 2, (dims.height / 2) - (dims.height / 2) / mult);
		            break;
		        case LEFT: // center of left side
		            pointOptionEnd = PointOption.point((dims.width / 2) - (dims.width / 2) / mult, dims.height / 2);
		            break;
		        case RIGHT: // center of right side
		            pointOptionEnd = PointOption.point((dims.width / 2) + (dims.width / 2) / mult, dims.height / 2);
		            break;
		        default:
		            throw new IllegalArgumentException("swipeScreenSmall(): dir: '" + dir.toString() + "' NOT supported");
		    }

		    // execute swipe using TouchAction
		    try {
		        new TouchAction((PerformsTouchActions) driver)
		                .press(pointOptionStart)
		                // a bit more reliable when we add small wait
		                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
		                .moveTo(pointOptionEnd)
		                .release().perform();
		    } catch (Exception e) {
		        System.err.println("swipeScreenSmall(): TouchAction FAILED\n" + e.getMessage());
		        return;
		    }

		    // always allow swipe action to complete
		    try {
		        Thread.sleep(ANIMATION_TIME);
		    } catch (InterruptedException e) {
		        // ignore
		    }
		}
	
}
