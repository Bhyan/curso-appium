package screen;

import core.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwipeListScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//*[@text='Opção 1']/..")
    private WebElement optionOne;

    @AndroidFindBy(xpath = "//*[@text='Opção 1 (+)']")
    private WebElement optionOnePlus;

    @AndroidFindBy(xpath = "//*[@text='Opção 4']/..")
    private WebElement optionFour;

    @AndroidFindBy(xpath = "//*[@text='Opção 4 (-)']")
    private WebElement optionFourPlus;

    @AndroidFindBy(xpath = "//*[@text='Opção 5']")
    private WebElement optionFive;

    @AndroidFindBy(xpath = "//*[@text='Opção 5 (-)']/..")
    private WebElement optionFiveMinus;

    @AndroidFindBy(xpath = "//*[@text='(+)']/..")
    private WebElement plusSignal;

    @AndroidFindBy(xpath = "//*[@text='(-)']/..")
    private WebElement minusSignal;

    public void swipeInElementOneLeft() {
        swipeElement(optionOne, 0.9, 0.1);
    }

    public void swipeInElementFourLeft() {
        swipeElement(optionFour, 0.9, 0.1);
    }

    public void swipeInElementFiveRight() {
        swipeElement(optionFiveMinus, 0.1, 0.9);
    }

    public String getTextOptionOne() {
        return optionOnePlus.getText();
    }

    public String getTextOptionFour() {
        return optionFourPlus.getText();
    }

    public String getTextOptionFive() {
        return optionFive.getText();
    }

    public void clickPlusSignal() {
        plusSignal.click();
    }

    public void clickMinusSignal() {
        minusSignal.click();
    }
}
