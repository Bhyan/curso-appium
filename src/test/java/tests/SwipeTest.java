package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import screen.MenuScreen;
import screen.SwipeListScreen;
import screen.SwipeScreen;

public class SwipeTest extends BaseTest {

    private final MenuScreen menuScreen = new MenuScreen();

    private final SwipeScreen swipeScreen = new SwipeScreen();

    private final SwipeListScreen swipeListScreen = new SwipeListScreen();

    @Test
    public void shouldInteractSwipe() {
        menuScreen.clickSwipeMenu();

        Assert.assertEquals("a esquerda", swipeScreen.getTextLeft());
        swipeScreen.swipe(0.9, 0.1);
        Assert.assertEquals("E veja se", swipeScreen.getTextCenter());
        swipeScreen.clickLeftButton();
        Assert.assertEquals("Chegar até o fim!", swipeScreen.getTextFinal());
        swipeScreen.swipe(0.1, 0.9);
        swipeScreen.clickRightButton();
        Assert.assertEquals("a esquerda", swipeScreen.getTextLeft());
    }

    @Test
    public void shouldInteractSwipeList() {
        menuScreen.clickSwipeListMenu();

        swipeListScreen.swipeInElementOneLeft();
        swipeListScreen.clickPlusSignal();

        Assert.assertEquals("Opção 1 (+)", swipeListScreen.getTextOptionOne());

        swipeListScreen.swipeInElementFourLeft();
        swipeListScreen.clickMinusSignal();

        Assert.assertEquals("Opção 4 (-)", swipeListScreen.getTextOptionFour());

        swipeListScreen.swipeInElementFiveRight();

        Assert.assertEquals("Opção 5", swipeListScreen.getTextOptionFive());
    }
}
