package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @And("I Click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @When("I verify that Welcome, Please Sign In message display")
    public void iVerifyThatWelcomePleaseSignInMessageDisplay() {
        Assert.assertEquals("Welcome message is not displayed","Welcome, Please Sign In!",new LoginPage().verifyWelcomeMessage());
    }

    @When("I enter email id {string}")
    public void iEnterEmailId(String email) {
        new LoginPage().enterEmail(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickLoginButton();
    }

    @Then("I verify the Login Error message")
    public void iVerifyTheLoginErrorMessage() {
        Assert.assertEquals("Error message not found","Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found",new LoginPage().verifyErrorMessageText());
    }

    @Then("Verify that LogOut link is display")
    public void verifyThatLogOutLinkIsDisplay() {
        Assert.assertEquals("Log out is not displayed","Log out",new HomePage().verifyLogoutLinkText());
    }

    @And("I click on logout Link")
    public void iClickOnLogoutLink() {
        new HomePage().clickOnLogoutLink();
    }

    @Then("I Verify that LogIn Link Display")
    public void iVerifyThatLogInLinkDisplay() {
        Assert.assertEquals("Login is not displayed","Log in", new HomePage().verifyLoginLinkText());
    }
}
