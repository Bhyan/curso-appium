package screen;

import core.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AccordionScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Opção 1']")
    private WebElement firstOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Esta é a descrição da opção 1']")
    private WebElement textFirstOption;

    public void clickFirstOption() {
        firstOption.click();
    }

    public String getTextFirstOption() {
        return textFirstOption.getText();
    }
}
