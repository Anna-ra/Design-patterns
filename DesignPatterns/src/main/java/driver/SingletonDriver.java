package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SingletonDriver {
    private static WebDriver driver;

    public SingletonDriver() {
    }

    public static WebDriver getWebDriverInstance() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.setCapability("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}
