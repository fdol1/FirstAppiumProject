package com.curso;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {

    public static void main(String[] args) throws MalformedURLException {


        /*
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("deviceName", "iPhone 13 Pro Max");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("udid", "FDDAF4BC-2C59-4E30-BC16-B05C16E3D29D");
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";
        caps.setCapability("app", appUrl);

        URL url = new URL("http://0.0.0.0:4723");
        AppiumDriver driver = new IOSDriver(url, caps);
        */


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Pixel_2");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("udid", "emulator-5554");
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
        caps.setCapability("app", appUrl);

        URL url = new URL("http://127.0.0.1:4723");

        AppiumDriver driver = new AndroidDriver(url, caps);
    }
}