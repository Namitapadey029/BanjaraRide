package Banjararide2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Banjararide.Ride;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Ride2 extends Ride{
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void Bt() throws IOException, InterruptedException {
		service=startServer();
		driver=capabilities(deviceName,platformName,appPackage,appActivity);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
	@Test(enabled = false,priority = 0)
	public void login() {
		driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();

		//driver.findElements(MobileBy.AndroidUIAutomator("UiSelector().text (\"OK\")")).get(0).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElements(MobileBy.AndroidUIAutomator("UiSelector().text (\"OK\")")).get(1).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElements(MobileBy.AndroidUIAutomator("UiSelector().text (\"Mobile Number\")")).get(0).sendKeys("8009047811");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElements(MobileBy.AndroidUIAutomator("UiSelector().text (\"Full Name\")")).get(0).sendKeys("Namo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElements(MobileBy.AndroidUIAutomator("UiSelector().text (\"Login\")")).get(0).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(MobileBy.className("android.widget.Button")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test(enabled = true,priority = 1)
	public void hirebike() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text (\"BOOK NOW\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text (\"Hire Bike\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Splendor+\"))").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.className("android.widget.ImageView")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"7 days 0 hr\"))").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text (\"15\")")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(enabled = true,priority = 2)
	public void Mytools() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[2]/android.view.ViewGroup")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Bookings\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search\")")).sendKeys("Activa");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Activa 5G\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test(enabled = true,priority = 3)
	public void more() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[3]/android.view.ViewGroup")).click();
		Thread.sleep(10000);
        driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")).click();
		Thread.sleep(10000);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		Thread.sleep(10000);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		Thread.sleep(10000);
		

	}
	@Test(enabled = true,priority = 4)
	public void notification() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")).click();
		Thread.sleep(10000);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		Thread.sleep(10000);
	}
	@Test(enabled = true,priority = 5)
	public void Termandconditions() throws InterruptedException {
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Terms & Conditions\")")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();
		Thread.sleep(10000);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		Thread.sleep(10000);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		Thread.sleep(10000);
	}
	@Test(enabled = true,priority = 6)
	public void callus() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Call Us\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	

}
