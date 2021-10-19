package basePackage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends BaseClass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<AndroidElement> driver= capabilities();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        Dimension count=driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize();
        System.out.println(count);

	}

}
