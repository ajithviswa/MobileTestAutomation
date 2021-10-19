package basePackage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class MobileGestures extends BaseClass {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver= capabilities();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        WebElement elementList=driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
        TouchAction actions=new TouchAction(driver);
        actions.tap(tapOptions().withElement(element(elementList))).perform();
        driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
        WebElement elementList2=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        actions.longPress(longPressOptions().withElement(element(elementList2)).withDuration(ofSeconds(2))).release().perform();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("android:id/title")).getText());
        
	}

}
