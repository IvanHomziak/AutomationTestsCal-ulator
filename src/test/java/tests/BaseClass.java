package tests;

import io.cucumber.java.hu.De;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    @BeforeTest
    public void setup() {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName","ANDROID");
        caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability("platformVersion","10");


    }

    @AfterTest
    public void tierDown() {

    }
}
