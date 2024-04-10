package core;

import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;

import java.time.Duration;

public class BaseNavigation {

    public static String url = "http://shop.pragmatic.bg";

    public static WebDriverWait wait;

    public static void goToPragmaticShop() {
        Browser.driver.get(url);
        wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(10));
    }
}
