package Component;

import Utils.StringUtils;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class Locator {

    private By by;
    private Driver driver;

    private Locator(By by, Driver driver) {
        this.by = by;
        this.driver = driver;
    }

    public static Locator accessibilityId(String accessibilityId, Driver driver) {
        return new Locator(MobileBy.AccessibilityId(accessibilityId), driver);
    }

    public static Locator xpath(String xpath, Driver driver) { return new Locator(By.xpath(xpath), driver); }

    public static Locator className(String className, Driver driver) { return new Locator(By.className(className), driver);}

    public String getLocatorString() { return StringUtils.formatByLocator(this.getBy().toString()); }

    public static Locator name(String name, Driver driver) {return new Locator(By.name(name), driver); }

    public static Locator tagName(String tagName, Driver driver) { return new Locator(By.tagName(tagName), driver); }

    public Driver getDriver() {return driver; }

    public By getBy() {
        return by;
    }

}
