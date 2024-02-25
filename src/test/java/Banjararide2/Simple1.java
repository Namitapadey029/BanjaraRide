package Banjararide2;

import org.testng.annotations.AfterTest;

import Banjararide.Ride;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Simple1 extends Ride {
	AndroidDriver<AndroidElement> driver;

	@AfterTest
	public void tearDown(){
		service.stop();

	}


}
