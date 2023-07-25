package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterSteps {



    @And("I Click on Register Link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterButton();
    }


    @When("I Verify {string} text")
    public void iVerifyRegisterText(String text) {
        Assert.assertEquals("Register is not displayed",text,new HomePage().getText());
    }

    @And("I click on REGISTER button")
    public void iClickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I Verify the error message {string}")
    public void iVerifyTheErrorMessage(String text) {
        Assert.assertEquals("First name text not found",text,new RegisterPage().verifyTextFirstName(text));
    }
    @And("I Verify the last name error message {string}")
    public void iVerifyTheLastNameErrorMessage(String text) {
        Assert.assertEquals("Last name text not found",text,new RegisterPage().verifyTextLastName(text));
    }

    @And("I Verify the email error message {string}")
    public void iVerifyTheEmailErrorMessage(String text) {
        Assert.assertEquals("Email text not found",text,new RegisterPage().verifyTextEmail(text));
    }

    @And("Verify the error message {string}")
    public void verifyTheErrorMessage(String text) {
        Assert.assertEquals("Password text not found",text,new RegisterPage().verifyTextPassword(text));
    }

    @Then("I  Verify the error msg {string}")
    public void iVerifyTheErrorMsg(String text) {
        Assert.assertEquals("Confirm Password text not found",text,new RegisterPage().verifyTextConfirmPassword(text));
    }

    @And("I Select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGender(gender);
    }



    @And("I Enter firstname {string}")
    public void iEnterFirstnamePoonam(String fname) {
        new RegisterPage().enterFirstName(fname);
    }

    @And("I Enter lastname {string}")
    public void iEnterLastnameRamavat(String lname) {
        new RegisterPage().enterLastName(lname);
    }

    @And("I Select day {string}")
    public void iSelectDay(String day) {
        new RegisterPage().selectDay(day);
    }

    @And("I Select month {string}")
    public void iSelectMonthJune(String month) {
        new RegisterPage().selectMonth(month);
    }

    @And("I Select year {string}")
    public void iSelectYear(String year) {
        new RegisterPage().selectYear(year);
    }

    @And("I Enter email {string}")
    public void iEnterEmailPoonamGmailCom(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I Enter password {string}")
    public void iEnterPasswordPoonam(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I Enter Confirm Password {string}")
    public void iEnterConfirmPasswordPoonam(String cpassword) {
        new RegisterPage().enterConfirmPassword(cpassword);
    }
    @Then("I Verify message {string}")
    public void iVerifyMessage(String text) {
        Assert.assertEquals("Text is not displayed",text,new RegisterPage().verifyRegisterTextCompleted());
    }


}
