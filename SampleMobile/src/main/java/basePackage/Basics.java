package basePackage;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends BaseClass {
	
	
	public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<AndroidElement> driver= capabilities();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//xpath,id,className,UIautomatorviewer
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
	driver.findElement(By.id("android:id/checkbox")).click();
	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	driver.findElement(By.className("android.widget.EditText")).sendKeys("password");
	driver.findElements(By.className("android.widget.Button")).get(1).click();
	
	}

}
