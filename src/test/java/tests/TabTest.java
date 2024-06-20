package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import screen.MenuScreen;
import screen.TabScreen;

public class TabTest extends BaseTest {

    private final MenuScreen menuScreen = new MenuScreen();

    private final TabScreen tabScreen = new TabScreen();

    @Test
    public void shouldInteractTabs() {
        menuScreen.clickTabs();

        Assert.assertEquals("Este é o conteúdo da Aba 1", tabScreen.getTextFirstTab());

        tabScreen.clickSecondTab();
        Assert.assertEquals("Este é o conteúdo da Aba 2", tabScreen.getTextSecondTab());
    }
}
