package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import screen.AlertScreen;
import screen.MenuScreen;

public class AlertTest extends BaseTest {

    private final MenuScreen menuScreen = new MenuScreen();

    private final AlertScreen alertScreen = new AlertScreen();

    @Before
    public void setUp() {
        menuScreen.clickAlert();
    }

    @Test
    public void shouldConfirmAlert() {
        alertScreen.clickConfirmAlert();
        Assert.assertEquals("Info", alertScreen.getTitleAlert());
        Assert.assertEquals("Confirma a operação?", alertScreen.getTextAlert());

        alertScreen.clickConfirm();
        Assert.assertEquals("Info", alertScreen.getTitleAlert());
        Assert.assertEquals("Confirmado", alertScreen.getTextAlert());

        alertScreen.clickExit();
    }

    @Test
    public void shouldClickOut() {
        alertScreen.clickSimpleAlert();
        alertScreen.clickOutModal();

        Assert.assertFalse(alertScreen.existModalText("Pode clicar no OK ou fora da caixa para sair"));
    }
}
