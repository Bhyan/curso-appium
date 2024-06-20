package screen;

import core.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SplashScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Splash!']")
    private WebElement textSplashScreen;

    public boolean isSplashScreenVisible() {
        return textSplashScreen.isDisplayed();
    }
}
