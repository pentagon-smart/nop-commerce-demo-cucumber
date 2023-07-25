package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    //Comuters text, DesktopsLink, NotebooksLink, SoftwareLink Locators
    //  and create appropriate methods for it.
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktop;

    public String getComputerText(){
        String Comtext = getTextFromElement(computerText);
        log.info("Getting Computer Text : " +computerText);
        return Comtext;
    }
    public void clickOnDesktopLink()
    {
        //Click on Desktops link
        clickOnElement(desktop);
        log.info("Click on desktop link"+ desktop.toString());
    }


}
