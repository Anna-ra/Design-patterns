package loginPageTests;

import desktop.pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constants.DELAY;
import static constants.Constants.EXPECTED_URL;
import static driver.SingletonDriver.getWebDriverInstance;
import static org.junit.Assert.assertTrue;
import static utils.WebDriverWaiter.setExplicitWait;

public class CheckNavbarTest {
    private WebDriver driver;
    private WebDriverWait explicitWait;

    @Before
    public void preCondition() {
        driver = getWebDriverInstance();
        explicitWait = setExplicitWait(driver, DELAY);
        driver.manage().window().maximize();
        driver.get(EXPECTED_URL);
    }

    @Test
    @DisplayName("Verify that navigation bar is present and clickable")
    public void checkNavBar() {
        LoginPage loginPage = new LoginPage(driver, explicitWait);
        assertTrue(loginPage.getNavigationBar().getRootElement().isDisplayed());
        assertTrue(loginPage.getNavigationBar().getRootElement().isEnabled());
    }

    @After
    public void postCondition() {
        driver.close();
    }
}
