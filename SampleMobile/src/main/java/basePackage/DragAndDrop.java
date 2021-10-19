package basePackage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;

public class DragAndDrop extends BaseClass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver= capabilities();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
        WebElement source=driver.findElements(By.className("android.view.View")).get(0);
        WebElement destination=driver.findElements(By.className("android.view.View")).get(1);
        TouchAction action=new TouchAction(driver);
        //long press from source ,move to destination and release
        action.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release()
        .perform();
        
        

	}

}
