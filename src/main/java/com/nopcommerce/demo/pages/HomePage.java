package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    // All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My account link and LogOut link locatores
    //  and create appropriate methods for it.

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyText ;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerButton ;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement actualLogoutLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement clickLogoutBtn;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement actualTextLoginLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement clickOnComputerTab;
    public void clickOnComputerTab()
    {
        //Click on Computer tab
        clickOnElement(clickOnComputerTab);
        log.info("Click on computer tab"+ clickOnComputerTab.toString());
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
        log.info("Click in on register" +registerButton.toString());
    }
    public String getText(){
       String text = getTextFromElement(verifyText);
        log.info("Getting text" +verifyText);
        return text;

    }
    public void clickOnLoginLink()
    {
        //Click on login link
        clickOnElement(loginLink);
        log.info("Click in on loginLink" +loginLink.toString());
    }
    public String verifyLogoutLinkText()
    {
        //Verify that LogOut link is display
        String logoutlink = getTextFromElement(actualLogoutLink);
        log.info("Getting log out link" + actualLogoutLink.toString());
        return logoutlink;
    }
    public void clickOnLogoutLink()
    {
        //Click on LogOut Link
        clickOnElement(clickLogoutBtn);
        log.info("Click in on Logout" +clickLogoutBtn.toString());
    }
    public String verifyLoginLinkText()
    {
        String loginlink = getTextFromElement(actualTextLoginLink);
        //Verify that LogIn Link Display
        log.info("Getting Login link" + actualTextLoginLink.toString());
        return loginlink;
    }
}
