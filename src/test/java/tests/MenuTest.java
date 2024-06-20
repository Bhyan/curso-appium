package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import screen.MenuScreen;

public class MenuTest extends BaseTest {

    private final MenuScreen menuScreen = new MenuScreen();

    @Test
    public void shouldFindHiddenOption() {
        menuScreen.scroll(0.9, 0.1);

        menuScreen.clickHiddenMenu();

        Assert.assertEquals("Você achou essa opção", menuScreen.getTextAlert());

        menuScreen.clickOkButton();

    }
}
