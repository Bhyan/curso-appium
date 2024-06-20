package core;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import static core.DriverFactory.getDriver;

public class BaseScreen {

    public BaseScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public boolean existElementByText(String text) {
        List<WebElement> elementos = getDriver().findElements(By.xpath("//*[@text='" + text + "']"));
        return !elementos.isEmpty();
    }

    public void waitForElementVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void executeClickLocation(int x, int y) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getDriver().perform(Collections.singletonList(tap));
    }

    public void executeLongClick(WebElement element) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence longPress = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), element.getLocation().x, element.getLocation().y))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), element.getLocation().x, element.getLocation().y))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getDriver().perform(Collections.singletonList(longPress));
    }

    public void scroll(double start, double end) {
        Dimension size = getDriver().manage().window().getSize();

        int axisX = size.width / 2;
        int axisYStart = (int) (size.height * start);
        int axisYEnd = (int) (size.height * end);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), axisX, axisYStart))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(200)))
                .addAction(finger.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), axisX, axisYEnd))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getDriver().perform(Collections.singletonList(sequence));
    }

    public void swipe(double start, double end) {
        Dimension size = getDriver().manage().window().getSize();

        int axisY = size.height / 2;
        int axisXStart = (int) (size.width * start);
        int axisXEnd = (int) (size.width * end);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), axisXStart, axisY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(200)))
                .addAction(finger.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), axisXEnd, axisY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getDriver().perform(Collections.singletonList(sequence));
    }

    public void swipeElement(WebElement element, double start, double end) {
        int axisY = element.getLocation().y + (element.getSize().height / 2);

        int axisXStart = (int) (element.getSize().width * start);
        int axisXEnd = (int) (element.getSize().width * end);

        genericSwipe(axisXStart, axisY, axisXEnd, axisY);
    }

    public void genericSwipe(int startX, int startY, int endX, int endY) {
        PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        Sequence drag = new Sequence(FINGER, 1)
                .addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY))
                .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(FINGER, Duration.ofMillis(500)))
                .addAction(FINGER.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX, endY))
                .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getDriver().perform(Collections.singletonList(drag));
    }

    public void dragNDrop(WebElement start, WebElement end) {
        PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence drag = new Sequence(FINGER, 1)
                .addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(),
                        start.getLocation().getX(), start.getLocation().getY()))
                .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(FINGER, Duration.ofMillis(1000)))
                .addAction(FINGER.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(),
                        end.getLocation().getX(), end.getLocation().getY()))
                .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getDriver().perform(Collections.singletonList(drag));
    }
}
