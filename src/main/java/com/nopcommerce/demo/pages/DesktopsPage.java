package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DesktopsPage extends Utility {
    //Desktops text, Sortby, Display, selectProductList Locators and it's actions

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-item']")
    List<WebElement> selectProduct;

    public String getDesktopsText(){
        String desktopText =  getTextFromElement(desktopsText);
        log.info("Getting desktop :" +desktopsText.toString());
        return desktopText;
    }
    public void selectProductFromList(String product)
    {
        //Click on product name "Build your own computer"
        for (WebElement productElement : selectProduct) {
            if (productElement.getText().contains(product)) {
                clickOnElement(productElement);
                break;
            }
        }
    }
}
