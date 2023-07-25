package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {
    //Build your own computer Text, Processor Drop Down, Ram drop down,
    //  HDD radios, os radio, software check boxes, Add To Card button, "The product has been added to your shopping cart"
    //  message locators and it's actions
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    WebElement hdd;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_4']")
    WebElement os;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_5']")
    WebElement totalCommander;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartLink;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productMessage;

    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildYourOwnComputer);
        log.info("Click on build your onw comupter:" +buildYourOwnComputer.toString());

    }
    public void selectProcessor(String value){
        selectByVisibleTextFromDropDown(processor, value);
        log.info("Select Process:" +processor.toString());
    }
    public void selectRam(String value){
        selectByVisibleTextFromDropDown(ram,value);
        log.info("Select Ram:" +ram.toString());
    }

    public void selectHDD(String text){
        clickOnElement1(hdd,text);
        log.info("Select HDD:" +hdd.toString());
    }
    public void selectOs(String text){
        clickOnElement1(os,text);
        log.info("Select OS:" + os.toString());
    }
    public void clickOnTotalCommander(String text){
        clickOnElement1(totalCommander,text);
        log.info("Click on total Commander:" + totalCommander.toString());
    }
    public void clickOnAddToCartLink(){
        clickOnElement(addToCartLink);
        log.info("Click on Add to cart:" + addToCartLink.toString());
    }
    public String getProductMessage(){
         String text = getTextFromElement(productMessage);
        log.info("Getting product message: " +productMessage.toString());
        return text;
    }
}
