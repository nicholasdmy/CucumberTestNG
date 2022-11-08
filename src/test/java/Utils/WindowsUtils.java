package Utils;

import Component.Driver;
import Component.Locator;
import Runners.Run;
import org.openqa.selenium.WebElement;

public class WindowsUtils {
    public static String currentWindoHandle;
    private final Driver driver;

    public WindowsUtils(Driver driver) {
        this.driver = driver;
        currentWindoHandle = driver.getWindowHandle();
    }

    public String getWindowHandleHex (String title) {
        WebElement webElement = Run.desktopSession.getElement(Locator.name(title, driver));
        String windHandleStr = webElement.getAttribute("NativeWindowHandle");
        int winHandleInt = Integer.parseInt(windHandleStr);
        return Integer.toString(winHandleInt);
    }

}
