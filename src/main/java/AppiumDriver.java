import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriver {

    public static AppiumDriver driver;


    public void deviceSetCapability() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("devicesName", "Android SDK built for x86");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");


        cap.setCapability("appPackage", "com.google.android.calculator2");
        cap.setCapability("appActivity", "com.google.android.calculator2.Calculator");


        URL urlOfAppiumServer = new URL ("http://127.0.0.1:4723/wd/hub"); //this is a URL of Appium server
        driver = new URL(urlOfAppiumServer , cap);  /* we need to send our desired capabilities
                                                                        to Appium server */
        System.out.println("Application started...");







}
