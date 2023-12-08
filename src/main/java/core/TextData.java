package core;

import org.apache.commons.lang3.RandomStringUtils;

public class TextData {

    public String registerAccountFormTitle = "Register Account";

    public String firstName = "Krastio";

    public String lastName = "Popov";

    public final String email = RandomStringUtils.randomAlphabetic(8) + "@" + RandomStringUtils.randomAlphabetic(5) + ".com";

    public String telephone = "0888123456";

    public String password = "parola34!";

    public String registeredAccountConfirmation = "Your Account Has Been Created!";


    public String loginAccountFormTitle = "Returning Customer";

    public String accountDashboardTitle = "My Account";


    public String invalidPassword = "greshnaparola";

    public String loginAccountFailureMessage = "Warning: No match for E-Mail Address and/or Password.";


    public String forgottenPasswordPageTitle = "Forgot Your Password?";

    public String passwordResetEmailSentConfirmation = "An email with a confirmation link has been sent your email address.";

}
