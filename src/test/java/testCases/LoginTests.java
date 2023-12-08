package testCases;

import core.BaseNavigation;
import core.BaseTest;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    /**
     * Registration of a new account.
     */
    @Test(priority = 0)
    public void registerNewAccount() {
        BaseNavigation.goToPragmaticShop();
        basePage.click(locators.myAccount);
        basePage.explicitWait(locators.registerAccountOption);
        basePage.click(locators.registerAccountOption);
        basePage.explicitWait(locators.registerAccountForm);
        basePage.verifyRegisterAccountFormTitle(textData.registerAccountFormTitle);
        basePage.type(locators.inputFirstName, textData.firstName);
        basePage.type(locators.inputLastName, textData.lastName);
        basePage.type(locators.inputEmail, textData.email);
        basePage.type(locators.inputTelephone, textData.telephone);
        basePage.type(locators.inputPassword, textData.password);
        basePage.type(locators.inputPasswordConfirm, textData.password);
        basePage.verifyRadioButtonSelection(locators.radioButtonsSelection);
        basePage.click(locators.inputCheckbox);
        basePage.verifyCheckBoxSelection(locators.inputCheckbox);
        basePage.click(locators.buttonContinue);
        basePage.explicitWait(locators.contentPresence);
        basePage.verifyRegisteredAccountConfirmation(textData.registeredAccountConfirmation);
    }

    /**
     * Login with newly registered account credentials in the registerNewAccount test.
     */
    @Test(priority = 1)
    public void successfulLogin() {
        BaseNavigation.goToPragmaticShop();
        basePage.click(locators.myAccount);
        basePage.explicitWait(locators.loginAccountOption);
        basePage.click(locators.loginAccountOption);
        basePage.explicitWait(locators.loginAccountForm);
        basePage.verifyLoginAccountFormTitle(textData.loginAccountFormTitle);
        basePage.type(locators.inputEmail, textData.email);
        basePage.type(locators.inputPassword, textData.password);
        basePage.click(locators.buttonLogin);
        basePage.explicitWait(locators.myAccountTitle);
        basePage.verifyAccountDashboardTitle(textData.accountDashboardTitle);
    }

    /**
     * Login with invalid credentials (correct email and incorrect password).
     */
    @Test(priority = 2)
    public void invalidLogin() {
        BaseNavigation.goToPragmaticShop();
        basePage.click(locators.myAccount);
        basePage.explicitWait(locators.loginAccountOption);
        basePage.click(locators.loginAccountOption);
        basePage.explicitWait(locators.loginAccountForm);
        basePage.verifyLoginAccountFormTitle(textData.loginAccountFormTitle);
        basePage.type(locators.inputEmail, textData.email);
        basePage.type(locators.inputPassword, textData.invalidPassword);
        basePage.click(locators.buttonLogin);
        basePage.explicitWait(locators.loginValidationError);
        basePage.verifyLoginAccountFailureMessage(textData.loginAccountFailureMessage);
    }

    /**
     * Password reset process when forgotten password option is selected.
     */
    @Test(priority = 3)
    public void forgottenPassword() {
        BaseNavigation.goToPragmaticShop();
        basePage.click(locators.myAccount);
        basePage.explicitWait(locators.loginAccountOption);
        basePage.click(locators.loginAccountOption);
        basePage.explicitWait(locators.loginAccountForm);
        basePage.verifyLoginAccountFormTitle(textData.loginAccountFormTitle);
        basePage.click(locators.forgottenPasswordLink);
        basePage.explicitWait(locators.forgottenPasswordPageTitle);
        basePage.verifyForgottenPasswordPageTitle(textData.forgottenPasswordPageTitle);
        basePage.type(locators.inputEmail, textData.email);
        basePage.click(locators.buttonContinue);
        basePage.explicitWait(locators.passwordResetEmailSentConfirmation);
        basePage.verifyPasswordResetEmailSentConfirmation(textData.passwordResetEmailSentConfirmation);
    }
}
