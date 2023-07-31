package com.appium.config;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumConfig {
	
	
	
	
    public static void main(String[] args)  throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.APP, "D:\\Download\\jforce-announcement1.apk");
        
        URL url=new URL  ("http://localhost:4723");
        
      //  capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "your_app_package");
     ///   capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "your_app_activity");
        // Add more desired capabilities as needed
        
        
        AndroidDriver <WebElement> driver = new AndroidDriver<WebElement>(url,capabilities);
    
    }
}
