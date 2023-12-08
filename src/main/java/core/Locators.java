package core;

public class Locators {

    public String myAccount = "//span[contains(text(),'My Account')]/following-sibling ::span";

    public String registerAccountOption = "//li[@class='dropdown open']//a[@href='https://shop.pragmatic.bg/index.php?route=account/register']";

    public String registerAccountForm = "//div[@id='content']/h1";

    public String inputFirstName = "//input[@id='input-firstname']";

    public String inputLastName = "//input[@id='input-lastname']";

    public String inputEmail = "//input[@id='input-email']";

    public String inputTelephone = "//input[@id='input-telephone']";

    public String inputPassword = "//input[@id='input-password']";

    public String inputPasswordConfirm = "//input[@id='input-confirm']";

    public String radioButtonsSelection = "//input[@type='radio']";

    public String inputCheckbox = "//input[@type='checkbox']";

    public String buttonContinue = "//input[@class='btn btn-primary']";

    public String contentPresence = "//div[@id='content']";

    public String accountCreatedConfirmation = "//div[@id='content']/h1";


    public String loginAccountOption = "//li[@class='dropdown open']//a[@href='https://shop.pragmatic.bg/index.php?route=account/login']";

    public String loginAccountForm = "//h2[contains(text(),'Returning Customer')]";

    public String buttonLogin = "//input[@value='Login']";

    public String loginValidationError = "//div[@class='alert alert-danger alert-dismissible']";


    public String myAccountTitle = "//div[@id='content']//h2[1]";


    public String forgottenPasswordLink = "//div[@class='form-group']//a[@href='https://shop.pragmatic.bg/index.php?route=account/forgotten']";

    public String forgottenPasswordPageTitle = "//div[@id='content']//h1";

    public String passwordResetEmailSentConfirmation = "//div[@class='alert alert-success alert-dismissible']";

}
