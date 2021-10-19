package basePackage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class SwipeClock extends BaseClass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver= capabilities();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        driver.findElement(By.xpath("//*[@content-desc='9']")).click();
        WebElement elementlist=driver.findElement(By.xpath("//*[@content-desc='15']"));
        WebElement elementlist2=driver.findElement(By.xpath("//*[@content-desc='45']"));
        TouchAction action=new TouchAction(driver);
        //long press for 2 seconds and move to another element and then release the element
        action.longPress(longPressOptions().withElement(element(elementlist)).withDuration(ofSeconds(2)))        		
        .moveTo(element(elementlist2)).release().perform();
        		
        		
	}

}
