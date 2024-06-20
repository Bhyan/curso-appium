package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import screen.ClickScreen;
import screen.MenuScreen;

public class ClickTest extends BaseTest {

    private final MenuScreen menuScreen = new MenuScreen();

    private final ClickScreen clickScreen = new ClickScreen();

    @Before
    public void setUp() {
        menuScreen.clickMenuClick();
    }

    @Test
    public void longClickTest() {
        clickScreen.longClick();

        Assert.assertEquals("Clique Longo", clickScreen.getTextInput());
    }

    @Test
    public void doubleClickTest() {
        clickScreen.doubleClick();

        Assert.assertEquals("Duplo Clique", clickScreen.getTextInput());
    }
}
