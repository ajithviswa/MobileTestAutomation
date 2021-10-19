package basePackage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingToElement extends BaseClass{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
      
		AndroidDriver<AndroidElement> driver= capabilities();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ScrollBars\"))");
		
	}

}
