@regression
Feature: Computer Build
  As user I want to build computer on nop commerce demo website

  Background: I am on Homepage
    And I click on computer tab

  @smoke
  Scenario: Verify User Should Navigate To Computer Page Successfully
    When I Verify Computer text

  @sanity
  Scenario: Verify User Should Navigate To Desktops Page Successfully
    When I click on desktop link
    Then I Verify Desktops text


  Scenario Outline: Verify That User Should Build You Own Computer And Add Them To Cart Successfully
    When I click on desktop link
    And I click on product name "Build your own computer"
    And I Select processor "<processor>"
    And I Select RAM "<ram>"
    And I Select HDD "<hdd>"
    And I Select OS "<os>"
    And I Select Software "<software>"
    And I Click on ADD TO CART Button
    And I Verify message The product has been added to your shopping cart

    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |
