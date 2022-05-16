package test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Login_Page {
	
	public static void main(String[] args) throws Exception {
 	AppiumDriver driver = CreateDriverSession.InitializeDriver("Android");
		
		Thread.sleep(4000);
		MobileElement Location = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/btnPickMall");
		Location.click();
		
		Thread.sleep(4000);
		MobileElement Locate = (MobileElement) driver.findElementByClassName("android.widget.Button");
		Locate.click();

		Thread.sleep(4000);
		MobileElement SelectCity = (MobileElement) driver.findElementByClassName("android.widget.FrameLayout");
		SelectCity.click();

		/*
		 * Thread.sleep(4000); MobileElement citymumbaibtn = (MobileElement)
		 * driver.findElementByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.TextView"
		 * ); citymumbaibtn.click();
		 */


		
		Thread.sleep(4000);
		MobileElement SelectMall = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/mall_2");
		SelectMall.click();

		Thread.sleep(4000); 
		MobileElement Mobno = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/btnContinue");
		Mobno.click();
		
		Thread.sleep(4000); 
		MobileElement Mobno1 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/etMobileNumber");
		Mobno1.click();
		
		Thread.sleep(4000); 
		Mobno1.sendKeys("9717445211");

		Thread.sleep(2000); 
		TouchAction tc= new TouchAction(driver);
		tc.tap(PointOption.point(944, 1647)).perform();

		Thread.sleep(4000);
		MobileElement verifybtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/btnVerify");
		verifybtn.click();
		
		
		Thread.sleep(4000);
		MobileElement verifyotp1 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/et_otp_1");
		verifyotp1.sendKeys("4");
		
		MobileElement verifyotp2 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/et_otp_2");
		verifyotp2.sendKeys("4");
		
		MobileElement verifyotp3 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/et_otp_3");
		verifyotp3.sendKeys("5");
		
		MobileElement verifyotp4 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/et_otp_4");
		verifyotp4.sendKeys("2");
		
		MobileElement verifyotp5 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/et_otp_5");
		verifyotp5.sendKeys("1");
		
		MobileElement verifyotp6 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/et_otp_6");
		verifyotp6.sendKeys("1");
		
		Thread.sleep(4000);
		MobileElement verifyotpbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/btnVerify");
		verifyotpbtn.click();
		
		  		 
		
		
		
		
		
		
		
	}

}

