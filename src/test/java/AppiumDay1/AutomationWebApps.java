package AppiumDay1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationWebApps {
    AndroidDriver driver;

    @BeforeTest
    public void beforeTest() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);

    }

    @Test
    public void test(){

    }






}
