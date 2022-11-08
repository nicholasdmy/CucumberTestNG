package Runners;

import Component.Driver;
import Configuration.EnumApp;
import Utils.WindowsUtils;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static Component.CapabilitiesKeys.APP;
import static Utils.WaitManager.waitSeconds;

@CucumberOptions(
        features = {"src/test/features/"},
        glue = {"StepsDefinitions"}
)

public class Run extends AbstractTestNGCucumberTests{

    public static Driver desktopSession;
    public static Driver driver;

    private static DesiredCapabilities setCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("plataformName", "Windows");
        capabilities.setCapability("deviceName", "WindowsPC");
        capabilities.setCapability("ms:waitForAppLaunch", "50");
        return capabilities;
    }

    protected static void setDescription() {
        waitSeconds(5);
        DesiredCapabilities desktopCapabilities = setCapabilities();
        desktopCapabilities.setCapability(APP, "Root");
        desktopSession =  Driver.instatiateSession(desktopCapabilities);
    }

    protected static void setLeagueOfLegendsSession() {
        waitSeconds(5);
        String winHandleHex = new WindowsUtils(desktopSession).getWindowHandleHex(EnumApp.LEAGUE_OF_LEGENDS.getName());
        DesiredCapabilities leagueCapabilities = setCapabilities();
        leagueCapabilities.setCapability("appTopLevelWindow", winHandleHex);
        driver = Driver.instatiateSession(leagueCapabilities);
        waitSeconds(5);
        driver.switchTo().window(driver.getWindowHandle());
    }

}
