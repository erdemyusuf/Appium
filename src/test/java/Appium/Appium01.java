package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.clipboard.ClipboardContentType.URL;

public class Appium01 {
    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

//        capabilities.setCapability("platformName","Android");
//        capabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Administrator\\Desktop\\Appium\\Appium\\src\\Apps\\gestureTool.apk");
        capabilities.setCapability("appPackage", "com.davemac327.gesture.tool");
        capabilities.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");

        //appPackage ve appActivity bilgilerini APK info uygulaması ile veya cmd üzerinden  adb shell ve diğer komutlar ile buluruz

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


    }
}
