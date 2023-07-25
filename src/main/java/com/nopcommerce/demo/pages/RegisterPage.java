package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends Utility {
    //Register Text, male female radio, Firstname, lastname, Date of Birth drop downs, email,
    //  Password, Confirm Password, Register Button, "First name is required.","Last name is required.",
    //  "Email is required.","Password is required.", "Password is required." error message,
    //  "Your registration completed" message, "CONTINUE" button
    //  Locators and it's actions

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement actualTextRegister;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement clickRegisterButton;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement actualFirstNameText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement actualLastNameText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement actualEmailText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement actualPasswordText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement actualConfirmPasswordText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='gender']")
    List<WebElement> selectGender;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement enterFirstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement enterLastName;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement selectDay;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement selectMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement selectYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enterEmail;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement enterPassword;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement enterConfirmPassword;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement verifyRegisterCompleteText;

    public String verifyTextRegister()
    {
        //Verify "Register" text

        return getTextFromElement(actualTextRegister);
    }
    public void clickOnRegisterButton()
    {
        //Click on "REGISTER" button
        clickOnElement(clickRegisterButton);
        log.info("Click on register button" +clickRegisterButton.toString());
    }
    public String verifyTextFirstName(String text)
    {
        //Verify the error message "First name is required."
        text = getTextFromElement(actualFirstNameText);
        log.info("Getting First name" + actualFirstNameText.toString());
        return text;
    }
    public String verifyTextLastName(String text)
    {
        //Verify the error message "Last name is required."
        text = getTextFromElement(actualLastNameText);
        log.info("Getting last name" + actualLastNameText.toString());
        return text;
    }
    public String verifyTextEmail(String text)
    {
        //Verify the error message "Email is required."
        text = getTextFromElement(actualEmailText);
        log.info("Getting email" + actualLastNameText.toString());
        return text;
    }
    public String verifyTextPassword(String text)
    {
        //Verify the error message "Password is required."
        text = getTextFromElement(actualPasswordText);
        log.info("Getting email" + actualLastNameText.toString());
        return text;
    }
    public String verifyTextConfirmPassword(String text)
    {
        //Verify the error message "Password is required."
        text = getTextFromElement(actualConfirmPasswordText);
        log.info("Getting password" + actualConfirmPasswordText.toString());
        return text;
    }
    public void selectGender(String gender)
    {
        //Select gender "Female"
        for (WebElement genderElement : selectGender) {
            if (genderElement.getText().contains(gender)) {
                clickOnElement(genderElement);
                break;
            }
        }
        log.info("Select gender" +selectGender.toString());
    }
    public void enterFirstName(String fName)
    {
        //Enter firstname
        sendTextToElement(enterFirstName,fName);
        log.info("Enter firstname " + enterFirstName.toString());
    }
    public void enterLastName(String lName)
    {
        //Enter lastname
        sendTextToElement(enterLastName,lName);
        log.info("Enter Lastname " + enterLastName.toString());
    }
    public void selectDay(String day)
    {
        //Select day
        selectByVisibleTextFromDropDown(selectDay,day);
        log.info("Enter day " + selectDay.toString());
    }
    public void selectMonth(String month)
    {
        //Select month
        selectByVisibleTextFromDropDown(selectMonth,month);
        log.info("Enter month " + selectMonth.toString());
    }
    public void selectYear(String year)
    {
        //Select year
        selectByVisibleTextFromDropDown(selectYear,year);
        log.info("Enter year " + selectYear.toString());
    }
    public void enterEmail(String email)
    {
        //Enter email
        sendTextToElement(enterEmail,email);
        log.info("Enter email " + enterEmail.toString());
    }
    public void enterPassword(String password)
    {
        //Enter password
        sendTextToElement(enterPassword,password);
        log.info("Enter password " + enterPassword.toString());
    }
    public void enterConfirmPassword(String confirmPassword)
    {
        //Enter Confirm Password
        sendTextToElement(enterConfirmPassword,confirmPassword);
        log.info("Enter confirm password " + enterConfirmPassword.toString());
    }
    public String verifyRegisterTextCompleted()
    {
        //Verify "Register" text
        String regText = getTextFromElement(verifyRegisterCompleteText);
        log.info("Getting complete text " + verifyRegisterCompleteText.toString());
        return regText;
    }

}
