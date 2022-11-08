package Utils;

import Component.Driver;

public class WaitManager {
    private final Driver driver;

    public WaitManager(Driver driver) { this.driver = driver; }

    public static void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds* 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}