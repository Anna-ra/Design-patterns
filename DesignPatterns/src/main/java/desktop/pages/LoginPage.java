package desktop.pages;

import abstractclasses.page.AbstractPage;
import desktop.fragments.NavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends AbstractPage {

    @FindBy(css = ".user-nav-wrap")
    WebElement rootElement;
    @FindBy(css = "ap_email")
    WebElement signInEmailField;
    @FindBy(id = "ap_password")
    WebElement signInPasswordField;
    @FindBy(css = "#auth-show-password-checkbox")
    WebElement showPasswordCheckbox;
    @FindBy(xpath = "//div[contains(@class,'a-row auth-visible-password-container')]/span[normalize-space(text())]")
    WebElement passwordText;
    @FindBy(id = "signInSubmit")
    WebElement signInSubmitButton;
    protected NavigationBar navigationBar;
    private static final String URL = "https://www.bookdepository.com/account/login/to/account";

    public LoginPage(final WebDriver driver, final WebDriverWait webDriverWait){
        super(driver, webDriverWait);
        PageFactory.initElements(driver, this);
        this.navigationBar = new NavigationBar(rootElement);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public void fillSignInForm(String email, String password) {
        explicitWait.until(ExpectedConditions.elementToBeClickable(signInEmailField)).click();
        explicitWait.until(ExpectedConditions.visibilityOf(signInEmailField)).sendKeys(email);
        explicitWait.until(ExpectedConditions.elementToBeClickable(signInPasswordField)).sendKeys(email);
        signInSubmitButton.click();
    }

    public void clickOnShowPasswordCheckbox() {
        showPasswordCheckbox.click();
    }

    public String getPasswordFromTheField() {
       return passwordText.getText();
    }

    @Override
    public String getPageUrl() {
        return URL;
    }
}
