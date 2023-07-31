/*


package com.appium.config;
import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumServer {

    private static AppiumDriverLocalService appiumService;

    public static void startServer() {
        // Set the path to the Appium node and Appium server
        //String nodePath = "/usr/local/bin/node";
    	
    	String nodePath = "C:/Users/amit.yadav.EXT/AppData/Roaming/npm/node_modules";
        String appiumPath = "/usr/local/bin/appium";

        // Build the Appium server configuration
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.usingDriverExecutable(new File(nodePath));
        builder.withAppiumJS(new File(appiumPath));
        builder.withIPAddress("127.0.0.1");
        builder.usingAnyFreePort();

        // Start the Appium server
        appiumService = builder.build();
        appiumService.start();
    }

    public static void stopServer() {
        // Stop the Appium server
        if (appiumService != null) {
            appiumService.stop();
        }
    }

    public static void main(String[] args) {
        startServer();
        // Perform your tests or operations here
        stopServer();
    }
}

*/
