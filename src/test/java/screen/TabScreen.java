package screen;

import core.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class TabScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Este é o conteúdo da Aba 1']")
    private WebElement textFirstTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Este é o conteúdo da Aba 2']")
    private WebElement textSecondTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Aba 2']")
    private WebElement secondTab;

    public String getTextFirstTab() {
        return textFirstTab.getText();
    }

    public String getTextSecondTab() {
        return textSecondTab.getText();
    }

    public void clickSecondTab() {
        secondTab.click();
    }
}
