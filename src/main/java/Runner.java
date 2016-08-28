import core.MyLogger;
import core.UiSelector;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.apache.log4j.Level;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Huy on 8/2/2016.
 */
public class Runner {
    public static void main(String[] args) throws MalformedURLException {
//        UiSelector temp =  new UiSelector().resourceId("hello").text("test 1");
//        System.out.println("Frfrfr" + temp.toString());
//        MyLogger.log.setLevel(Level.DEBUG);
//        MyLogger.log.debug("Test debug");

        AndroidDriver driver = null;
        try{
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName","Android Emulator");
            caps.setCapability("platformName","Android");
            caps.setCapability("app","C:\\Users\\Huy\\Downloads\\android.speedtest_3.2.22.apk");
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
//        driver.findElementByAndroidUIAutomator("new UiSelector().description(\"Apps\")").click();
            driver.findElementByAndroidUIAutomator(new UiSelector().description("Apps").toString()).click();
//        UiSelector se = new UiSelector();
//        se.resourceId("cfrcr");

            driver.findElementByAndroidUIAutomator("new UiSelector().text(\"ES File Explorer\")").click();
        }finally {
            if (driver != null)
                driver.quit();
        }

    }


}
