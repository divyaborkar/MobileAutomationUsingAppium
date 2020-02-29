package AppiumDay1.POM;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Test_Calc {

    AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);

        //For native app
        desiredCapabilities.setCapability("appPackage","com.android.calculator2");
        desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }


}
