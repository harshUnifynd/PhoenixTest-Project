package test;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CreateDriverSession 
{
    public static AppiumDriver InitializeDriver(String platform) throws Exception
    {
    	DesiredCapabilities caps=new DesiredCapabilities();
    	caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
    	caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
    	caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
    	caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
    	caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
//    	caps.setCapability("avd", "Pixel_2");
//    	caps.setCapability("avdLaunchTimeout", "180000");
    	String appurl= "C:\\Users\\Lenovo\\OneDrive\\Desktop\\PhoenixApp_MavenProject\\src\\main\\resources\\app-stagingPro-debug-20220427.apk";
    	caps.setCapability(MobileCapabilityType.APP, appurl);
    	
    	URL url=new URL("http://0.0.0.0:4723/wd/hub");
    	
    	//AppiumDriver driver=new AndroidDriver(url,caps);
    	//System.out.println("Session id: " +driver.getSessionId());
    	
		return new AndroidDriver(url, caps);
    	
    }

}
