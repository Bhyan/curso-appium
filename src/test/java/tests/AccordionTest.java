package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import screen.AccordionScreen;
import screen.MenuScreen;

public class AccordionTest extends BaseTest {

    private final MenuScreen menuScreen = new MenuScreen();
    private final AccordionScreen accordionScreen = new AccordionScreen();

    @Test
    public void shouldInteractAccordion() {
        menuScreen.clickAccordion();

        accordionScreen.clickFirstOption();
        Assert.assertEquals("Esta é a descrição da opção 1", accordionScreen.getTextFirstOption());
    }
}
