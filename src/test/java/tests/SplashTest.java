package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import screen.MenuScreen;
import screen.SplashScreen;

public class SplashTest extends BaseTest {

    private final MenuScreen menuScreen = new MenuScreen();

    private final SplashScreen splashScreen = new SplashScreen();

    @Test
    public void shouldWaitSplashPage() {
        menuScreen.clickSplash();

        Assert.assertTrue(splashScreen.isSplashScreenVisible());

        Assert.assertTrue(menuScreen.isMenuVisible());
    }
}
