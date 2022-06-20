package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractFragment {

    @FindBy(css = "a[href='/account/login/to/account']:first-child")
    WebElement signInOrJoinIcon;

    public NavigationBar(WebElement rootElement) {
        super(rootElement);
    }

    public void clickOnSignInOrJoinIcon () {
            signInOrJoinIcon.click();
        }
}
