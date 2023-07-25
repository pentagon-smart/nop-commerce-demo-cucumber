package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComputerSteps {
    @And("I click on computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerTab();
    }

    @When("I Verify Computer text")
    public void iVerifyComputerText() {
        Assert.assertEquals("Computer text is not displayed", "Computers", new ComputerPage().getComputerText());
    }

    @When("I click on desktop link")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @Then("I Verify Desktops text")
    public void iVerifyDesktopsText() {
        Assert.assertEquals("Desktop text is not displayed","Desktops",new DesktopsPage().getDesktopsText());
    }

    @And("I click on product name {string}")
    public void iClickOnProductName(String product) {
        new BuildYourOwnComputerPage().clickOnBuildYourOwnComputer();

    }

    @And("I Select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);

    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);

    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I Select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().clickOnTotalCommander(software);
    }

    @And("I Click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartLink();
    }

    @And("I Verify message The product has been added to your shopping cart")
    public void iVerifyMessageTheProductHasBeenAddedToYourShoppingCart() {
        Assert.assertEquals("Message is not displayed","The product has been added to your shopping cart", new BuildYourOwnComputerPage().getProductMessage());
    }
}
