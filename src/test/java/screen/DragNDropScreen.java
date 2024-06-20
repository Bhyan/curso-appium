package screen;

import core.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static core.DriverFactory.getDriver;

public class DragNDropScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//*[@text='Esta']")
    private WebElement thisElement;

    @AndroidFindBy(xpath = "//*[@text='e arraste para']")
    private WebElement dragTo;

    @AndroidFindBy(className = "android.widget.TextView")
    private WebElement listElements;

    @AndroidFindBy(xpath = "//*[@text='Faça um clique longo,']")
    private WebElement doingLongClick;

    @AndroidFindBy(xpath = "//*[@text='é uma lista']")
    private WebElement thisIsList;

    public void dragNDropThisToDragTo() {
        dragNDrop(thisElement, dragTo);
    }

    public void dragNDropDoingLongClickToThisIsList() {
        dragNDrop(doingLongClick, thisIsList);
    }

    public String[] getList() {
        waitForElementVisible(thisElement);
        List<WebElement> elements = getDriver().findElements(By.className(listElements.getAttribute("class")));
        String[] list = new String[elements.size()];

        for(int i = 0; i < elements.size(); i++){
            list[i] = elements.get(i).getText();
        }

        return list;
    }
}
