package driver;

import org.openqa.selenium.remote.DesiredCapabilities;

import static constants.Constants.PATH_TO_WEBDRIVER;
import static constants.Constants.WEBDRIVER_TYPE;

public class CapabilitiesHelper {

    public static DesiredCapabilities setCapabilities() {
        System.setProperty(WEBDRIVER_TYPE, PATH_TO_WEBDRIVER);
        return DesiredCapabilities.chrome();
    }

}
