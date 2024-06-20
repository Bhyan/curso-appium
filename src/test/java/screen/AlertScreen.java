package screen;

import core.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AlertScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ALERTA CONFIRM']")
    private WebElement confirmAlertButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ALERTA SIMPLES']")
    private WebElement simpleAlertButton;

    @AndroidFindBy(id = "android:id/alertTitle")
    private WebElement titleAlert;

    @AndroidFindBy(id = "android:id/message")
    private WebElement textAlert;

    @AndroidFindBy(id = "android:id/button2")
    private WebElement confirmButton;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement exitButton;

    public void clickConfirmAlert() {
        confirmAlertButton.click();
    }

    public void clickSimpleAlert() {
        simpleAlertButton.click();
    }

    public String getTitleAlert() {
        return titleAlert.getText();
    }

    public String getTextAlert() {
        return textAlert.getText();
    }

    public void clickConfirm() {
        confirmButton.click();
    }

    public void clickExit() {
        exitButton.click();
    }

    public void clickOutModal() {
        waitForElementVisible(textAlert);
        executeClickLocation(100,150);
    }

    public boolean existModalText(String text) {
        return existElementByText(text);
    }
}
