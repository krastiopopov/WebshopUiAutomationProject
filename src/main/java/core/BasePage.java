package core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.Browser;

public class BasePage {

    Locators locators = new Locators();

    /**
     * Explicit wait, which ensures the visibility of the WebElement.
     * Locator provided as parameter.
     *
     * @param locator The locator for the WebElement, which you need to be visible.
     */
    public void explicitWait(String locator) {
        BaseNavigation.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    /**
     * Clicks on a WebElement
     *
     * @param locator The locator for the WebElement.
     */
    public void click(String locator) {
        Browser.driver.findElement(By.xpath(locator)).click();
    }

    /**
     * Types text in a WebElement.
     * Locator and text provided as parameters.
     *
     * @param locator The locator of the WebElement, in which you need to type the text.
     * @param textToType The text, which you need to type in the particular WebElement.
     */
    public void type(String locator, String textToType) { Browser.driver.findElement(By.xpath(locator)).sendKeys(textToType); }

    /**
     * Gets the text from a WebElement.
     * Locator provided as parameter.
     *
     * @param locator The locator of the WebElement, which text you need to get.
     * @return The text from the located WebElement as a string.
     */
    public String getElementText(String locator) {
        return Browser.driver.findElement(By.xpath(locator)).getText();
    }

    /**
     * Asserts if the expected Register Account Form Title is equal to the actual Register Account Form Title displayed.
     *
     * @param expectedRegisterAccountFormTitle The expected Register Account Form Title.
     */
    public void verifyRegisterAccountFormTitle(String expectedRegisterAccountFormTitle) {

        String actualRegisterAccountFormTitle = getElementText(locators.registerAccountForm);
        Assert.assertEquals(actualRegisterAccountFormTitle, expectedRegisterAccountFormTitle);
    }

    /**
     * Assert that a Radio Button is selected.
     *
     * @param locator Radio button locator.
     */
    public void verifyRadioButtonSelection(String locator) { Assert.assertTrue(Browser.driver.findElement(By.xpath(locator)).isSelected()); }

    /**
     * Assert that the Check Box is selected.
     *
     * @param locator The locator of the Check Box.
     */
    public void verifyCheckBoxSelection(String locator) { Assert.assertTrue(Browser.driver.findElement(By.xpath(locator)).isSelected()); }

    /**
     * Asserts if the expected Register Account Confirmation is equal to the actual Register Account Confirmation message displayed.
     *
     * @param expectedRegisteredAccountConfirmation The expected Register Account Confirmation message.
     */
    public void verifyRegisteredAccountConfirmation(String expectedRegisteredAccountConfirmation) {
        String actualRegisteredAccountConfirmation = getElementText(locators.accountCreatedConfirmation);
        Assert.assertEquals(actualRegisteredAccountConfirmation, expectedRegisteredAccountConfirmation);
    }


    /**
     * Asserts if the expected Login Account Form Title is equal to the actual Login Account Form Title displayed.
     *
     * @param expectedLoginAccountFormTitle The expected Login Account Form Title.
     */
    public void verifyLoginAccountFormTitle(String expectedLoginAccountFormTitle) {
        String actualLoginAccountFormTittle = getElementText(locators.loginAccountForm);
        Assert.assertEquals(actualLoginAccountFormTittle, expectedLoginAccountFormTitle);
    }

    /**
     * Asserts if the expected Login Account Failure Message is equal to the actual Login Account Failure Message displayed.
     *
     * @param expectedLoginAccountFailureMessage The expected Login Account Failure Message.
     */
    public void verifyLoginAccountFailureMessage(String expectedLoginAccountFailureMessage) {
        String actualLoginAccountFailureMessage = getElementText(locators.loginValidationError);
        Assert.assertEquals(actualLoginAccountFailureMessage, expectedLoginAccountFailureMessage);
    }


    /**
     * Asserts if the expected Account Dashboard Title is equal to the actual Account Dashboard Title displayed.
     *
     * @param expectedAccountDashboardTitle The expected Account Dashboard Title.
     */
    public void verifyAccountDashboardTitle(String expectedAccountDashboardTitle) {
        String actualAccountDashboardTitle = getElementText(locators.myAccountTitle);
        Assert.assertEquals(actualAccountDashboardTitle, expectedAccountDashboardTitle);
    }


    /**
     * Asserts if the expected Forgotten Password Page Title is equal to the actual Forgotten Password Page Title displayed.
     *
     * @param expectedForgottenPasswordPageTitle The expected Forgotten Password Page Title.
     */
    public void verifyForgottenPasswordPageTitle(String expectedForgottenPasswordPageTitle) {
        String actualForgottenPasswordPageTitle = getElementText(locators.forgottenPasswordPageTitle);
        Assert.assertEquals(actualForgottenPasswordPageTitle, expectedForgottenPasswordPageTitle);
    }

    /**
     * Asserts if the expected Password Reset Email Confirmation is equal to the actual Password Reset Email Confirmation message displayed.
     *
     * @param expectedPasswordResetEmailSentConfirmation The expected Password Reset Email Confirmation message.
     */
    public void verifyPasswordResetEmailSentConfirmation(String expectedPasswordResetEmailSentConfirmation) {
        String actualPasswordResetEmailSentConfirmation = getElementText(locators.passwordResetEmailSentConfirmation);
        Assert.assertEquals(actualPasswordResetEmailSentConfirmation, expectedPasswordResetEmailSentConfirmation);
    }
}
