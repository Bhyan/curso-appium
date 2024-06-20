package screen;

import core.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MenuScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//*[@text='Formulário']")
    private WebElement menuForm;

    @AndroidFindBy(xpath = "//*[@text='Splash']")
    private WebElement menuSplash;

    @AndroidFindBy(xpath = "//*[@text='Alertas']")
    private WebElement menuAlert;

    @AndroidFindBy(xpath = "//*[@text='Abas']")
    private WebElement menuTabs;

    @AndroidFindBy(xpath = "//*[@text='Accordion']")
    private WebElement menuAccordion;

    @AndroidFindBy(xpath = "//*[@text='Cliques']")
    private WebElement menuClick;

    @AndroidFindBy(xpath = "//*[@text='Opção bem escondida']")
    private WebElement menuHidden;

    @AndroidFindBy(xpath = "//*[@text='Swipe']")
    private WebElement menuSwipe;

    @AndroidFindBy(xpath = "//*[@text='Swipe List']")
    private WebElement menuSwipeList;

    @AndroidFindBy(xpath = "//*[@text='Drag and drop']")
    private WebElement menuDragNDrop;

    @AndroidFindBy(id = "android:id/message")
    private WebElement textAlert;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement okButton;

    public void clickForm() {
        menuForm.click();
    }

    public boolean isMenuVisible() {
        waitForElementVisible(menuForm);

        return menuForm.isDisplayed();
    }

    public void clickSplash(){
        menuSplash.click();
    }

    public void clickAlert(){
        menuAlert.click();
    }

    public void clickTabs() {
        menuTabs.click();
    }

    public void clickAccordion() {
        menuAccordion.click();
    }

    public void clickMenuClick() {
        menuClick.click();
    }

    public void clickHiddenMenu() {
        menuHidden.click();
    }

    public void clickSwipeMenu() {
        menuSwipe.click();
    }

    public void clickSwipeListMenu() {
        menuSwipeList.click();
    }

    public void clickDragNDropMenu() {
        menuDragNDrop.click();
    }

    public String getTextAlert() {
        return textAlert.getText();
    }

    public void clickOkButton() {
        okButton.click();
    }
}
