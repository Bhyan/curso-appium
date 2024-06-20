package screen;

import core.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ClickScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Clique Longo']")
    private WebElement longClickButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Clique duplo']")
    private WebElement doubleClickButton;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[3]")
    private WebElement valueInput;

    public void longClick() {
        executeLongClick(longClickButton);
    }

    public String getTextInput() {
        return valueInput.getText();
    }

    public void doubleClick() {
        doubleClickButton.click();
        doubleClickButton.click();
    }
}
