package screen;

import core.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='a esquerda']")
    private WebElement textLeft;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='E veja se']")
    private WebElement textCenter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chegar até o fim!']")
    private WebElement textFinal;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='›']")
    private WebElement buttonLeft;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='‹']")
    private WebElement buttonRight;

    public String getTextLeft() {
        return textLeft.getText();
    }

    public String getTextCenter() {
        return textCenter.getText();
    }

    public String getTextFinal() {
        return textFinal.getText();
    }

    public void clickLeftButton() {
        buttonLeft.click();
    }

    public void clickRightButton() {
        buttonRight.click();
    }
}
