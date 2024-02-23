package com.curso;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionUsingOptions {

    public static void main(String[] args) throws MalformedURLException {

        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options().
                setDeviceName("Pixel_2").
                setAutomationName("UiAutomator2").
                setApp(appUrl);
        URL url = new URL("http://127.0.0.1:4723");
        AppiumDriver driver = new AndroidDriver(url, options);


        /*
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";

        XCUITestOptions options = new XCUITestOptions().
                setDeviceName("iPhone 13 Pro Max").
                setAutomationName("XCUITest").
                setUdid("FDDAF4BC-2C59-4E30-BC16-B05C16E3D29D").
                setApp(appUrl);
        URL url = new URL("http://127.0.0.1:4723");
        AppiumDriver driver = new IOSDriver(url, options);
        */
    }
}
