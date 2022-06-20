package abstractclasses.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    public WebDriver driver;
    public WebDriverWait explicitWait;
    private String pageUrl;
    private String pageUrlPattern;

    protected AbstractPage(WebDriver webdriver, WebDriverWait webDriverWait) {
        this.driver = webdriver;
        this.explicitWait = webDriverWait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public String setPageUrlPattern(String pageUrlPattern) {
        return this.pageUrlPattern = pageUrlPattern;
    }

    public String getPageUrlPattern() {
        return pageUrlPattern;
    }
}
