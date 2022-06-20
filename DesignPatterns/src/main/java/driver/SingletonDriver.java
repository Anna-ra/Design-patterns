package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {
    private static WebDriver driver;

    private SingletonDriver() {
    }

    public static WebDriver getWebDriverInstance() {
        if (driver == null) {
            driver = new ChromeDriver(CapabilitiesHelper.setCapabilities());
        }
        return driver;
    }
}
