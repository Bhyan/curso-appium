package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import screen.FormScreen;
import screen.MenuScreen;

public class FormTest extends BaseTest {

    private final MenuScreen menuScreen = new MenuScreen();

    private final FormScreen formScreen = new FormScreen();

    @Before
    public void setUp() {
        menuScreen.clickForm();
    }

    @Test
    public void shouldFillName() {
        formScreen.fillName("Wagner");

        Assert.assertEquals("Wagner", formScreen.getInputName());
    }

    @Test
    public void shouldFillCombo() {
        formScreen.fillConsole();

        Assert.assertEquals("Nintendo Switch", formScreen.getConsoleText());
    }

    @Test
    public void shouldCheckedSwitchAndCheckbox() {
        formScreen.checkedCheckbox();
        formScreen.checkedSwitch();

        Assert.assertEquals("true", formScreen.attributeCheckedCheckbox("checked"));
        Assert.assertEquals("false", formScreen.attributeCheckedSwitch("checked"));

        formScreen.checkedCheckbox();
        formScreen.checkedSwitch();

        Assert.assertEquals("false", formScreen.attributeCheckedCheckbox("checked"));
        Assert.assertEquals("true", formScreen.attributeCheckedSwitch("checked"));
    }

    @Test
    public void shouldFillForm() {
        formScreen.fillName("Bryan");
        formScreen.fillConsole();
        formScreen.checkedCheckbox();
        formScreen.checkedSwitch();
        formScreen.clickSave();

        Assert.assertEquals("Nome: Bryan", formScreen.getName());
        Assert.assertEquals("Switch: Off", formScreen.getSwitch());
        Assert.assertEquals("Checkbox: Marcado", formScreen.getCheckbox());
        Assert.assertEquals("Console: switch", formScreen.getConsole());
    }

    @Test
    public void shouldChangeDate() {
        formScreen.clickDateInput();
        formScreen.changeDate();

        Assert.assertTrue(formScreen.existDate("20/01/2000"));
    }

    @Test
    public void shouldInteractSeekbar() {
        formScreen.clickSeekbar();

    }
}
