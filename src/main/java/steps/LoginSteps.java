package steps;

import net.thucydides.core.annotations.Step;
import pages.HeaderPage;
import pages.LoginPage;

public class LoginSteps {
    private LoginPage loginPage;
    private HeaderPage headerPage;

    @Step
    public void loginWithValidCredentials(){
        headerPage.clickOnAccount();
        headerPage.clickOnALinkFromAccount("Log In");
        loginPage.logIn();
        //assert
    }
}
