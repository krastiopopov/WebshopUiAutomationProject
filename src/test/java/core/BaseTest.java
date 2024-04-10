package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;

public class BaseTest {

    public BasePage basePage = new BasePage();

    public Locators locators = new Locators();

    public TextData textData = new TextData();

    @BeforeMethod
    public void setupBrowser() {
        Browser.setup();
    }

    @AfterMethod
    public void quitBrowser() {
        Browser.quit();
    }
}
