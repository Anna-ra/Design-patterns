package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaiter {

    public static WebDriverWait setExplicitWait(WebDriver driver, int delay) {
        return new WebDriverWait(driver, delay);
    }
}
