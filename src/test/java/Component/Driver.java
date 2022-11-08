package Component;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import static io.appium.java_client.internal.CapabilityHelpers.getCapability;

public class Driver {

    private WindowsDriver<?> windowsDriver;

    public Driver(URL url, DesiredCapabilities desiredCapabilities) {
        windowsDriver = new WindowsDriver<>(url, desiredCapabilities);
    }

    public static Driver instatiateSession(DesiredCapabilities desiredCapabilities) {
        try {
            return new Driver(new URL("http://127.0.0.1:4723"), desiredCapabilities);
        } catch (MalformedURLException e){
            e.printStackTrace();
            throw new RuntimeException("Could not instatiate session");
        }
    }

    public String getCapability(String key) { return (String) getWindowsDriver().getCapabilities().getCapability(key);}


    public void sendKey(Keys key) { getWindowsDriver().getKeyboard().sendKeys(key); }

    public WindowsDriver getWindowsDriver() { return windowsDriver; }


    public List<WebElement> findElements(Locator locator) {
        By by = locator.getBy();
        return (List<WebElement>) windowsDriver.findElements(by);
    }

    public String getWindowHandle() {
        return windowsDriver.getWindowHandle();
    }

    public WebElement findElementByAccessibilityId(String accessibilityId) {
        return windowsDriver.findElementByAccessibilityId(accessibilityId);
    }

    public WebElement getElement(Locator locator) {
        By by =  locator.getBy();
        return windowsDriver.findElement(by);
    }

    public WebElement findElementByName (String name) { return windowsDriver.findElementByName(name); }

    public Set<String> getWindowHandles() { return windowsDriver.getWindowHandles(); }

    public WebDriver.Options manage() { return windowsDriver.manage(); }

    public WebDriver.TargetLocator switchTo() { return windowsDriver.switchTo(); }

    public void quit() {windowsDriver.quit(); }

    public File getScreenshotAs(OutputType<File> file) {return windowsDriver.getScreenshotAs(file);}
}