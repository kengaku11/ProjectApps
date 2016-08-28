package core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Huy on 8/19/2016.
 */
public class Main {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName","Android Emulator");
        caps.setCapability("platformName","Android");
        caps.setCapability("app","C:\\Users\\Huy\\Downloads\\ES File Explorer File Manager_v4.1.2.4_apkpure.com.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
//        driver.findElementByAndroidUIAutomator("new UiSelector().description(\"Apps\")").click();
        driver.findElementByAndroidUIAutomator(new UiSelector().description("Apps").toString()).click();
//        UiSelector se = new UiSelector();
//        se.resourceId("cfrcr");

        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"ES File Explorer\")").click();

        driver.quit();
    }
}
