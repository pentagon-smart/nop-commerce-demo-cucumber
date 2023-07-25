package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    // Email, password, Login Button and "Welcome, Please Sign In!" text Locators
    //  and create appropriate methods for it.

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement actualWelcomeText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enterEmail;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement enterPassword;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement clickLoginBtn;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement actualErrorMessage;
    public String verifyWelcomeMessage()
    {
        String welcometxt = getTextFromElement(actualWelcomeText);
        log.info("Getting welcome msg: " +actualErrorMessage.toString());
        return welcometxt;
    }
    public void enterEmail(String email)
    {
        //Enter EmailId
        sendTextToElement(enterEmail,email);
        log.info("Enter email : " +enterEmail.toString());
    }
    public void enterPassword(String password)
    {
        //Enter Password
        sendTextToElement(enterPassword,password);
        log.info("Enter email : " +enterPassword.toString());
    }
    public void clickLoginButton()
    {
        //Click on Login Button
        clickOnElement(clickLoginBtn);
        log.info("Click login btn: " +clickLoginBtn.toString());
    }
    public String verifyErrorMessageText()
    {
        //Verify that the Error message
        String txtmsg = getTextFromElement(actualErrorMessage);
        log.info("Getting error message" +actualErrorMessage.toString());
        return txtmsg;
    }
}
