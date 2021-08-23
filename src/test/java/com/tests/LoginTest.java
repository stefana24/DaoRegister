package com.tests;

import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import steps.LoginSteps;

public class LoginTest extends BaseTest{
    @Steps
    public LoginSteps loginSteps;

    @Test
    public void loginTest(){
        loginSteps.loginWithValidCredentials();
    }
}
