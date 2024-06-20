package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {
    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        if(driver == null) {
            createDriver();
        }
        return driver;
    }

    private static void createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("app", "/Users/bryanbrito/IdeaProjects/QAzando/src/main/resources/CTAppium_2_0.apk");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName","uiautomator2");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void killDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
