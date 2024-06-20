package screen;

import core.BaseScreen;
import core.DriverFactory;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static core.DriverFactory.getDriver;

public class FormScreen extends BaseScreen {

    @AndroidFindBy(accessibility = "nome")
    private WebElement nameInput;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nome: Bryan']")
    private WebElement name;

    @AndroidFindBy(accessibility = "console")
    private WebElement consoleCombo;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Nintendo Switch']")
    private WebElement consoleSelect;

    @AndroidFindBy(xpath = "//android.widget.Spinner/android.widget.TextView")
    private WebElement consoleTextView;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Console: switch']")
    private WebElement consoleValue;

    @AndroidFindBy(className = "android.widget.CheckBox")
    private WebElement checkbox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Checkbox: Marcado']")
    private WebElement checkboxValue;

    @AndroidFindBy(accessibility = "switch")
    private WebElement switchInput;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Switch: Off']")
    private WebElement switchValue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SALVAR']")
    private WebElement saveButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='01/01/2000']")
    private WebElement dateInput;

    @AndroidFindBy(accessibility = "20 January 2000")
    private WebElement twentyThDate;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement okButtonDate;

    @AndroidFindBy(accessibility = "slid")
    private WebElement seekbar;

    public void fillName(String name) {
        nameInput.sendKeys(name);
    }

    public String getInputName() {
        return nameInput.getText();
    }

    public String getName() {
        return name.getText();
    }

    public void fillConsole() {
        consoleCombo.click();
        consoleSelect.click();
    }

    public String getConsoleText() {
        return consoleTextView.getText();
    }

    public String getConsole() {
        return consoleValue.getText();
    }

    public void checkedCheckbox() {
        checkbox.click();
    }

    public void checkedSwitch() {
        switchInput.click();
    }

    public String getSwitch() {
        return switchValue.getText();
    }

    public String getCheckbox() {
        return checkboxValue.getText();
    }

    public String attributeCheckedCheckbox(String att) {
        return checkbox.getAttribute(att);
    }

    public String attributeCheckedSwitch(String att){
        return switchInput.getAttribute(att);
    }

    public void clickSave() {
        saveButton.click();
    }

    public void clickDateInput() {
        dateInput.click();
    }

    public boolean existDate(String text) {
        return existElementByText(text);
    }

    public void changeDate() {
        twentyThDate.click();
        okButtonDate.click();
    }

    public void clickSeekbar() {
        seekbar.click();
    }
}
