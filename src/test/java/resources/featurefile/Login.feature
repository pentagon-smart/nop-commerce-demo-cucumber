@regression
Feature: Login
  As user I want to login on nop commerce demo website

  Background: I am on homepage
    And I Click on login link

  @smoke
  Scenario: User Should Navigate To Login Page SuccessFully
    When I verify that Welcome, Please Sign In message display

  @sanity
  Scenario: Verify The Error Message With In Valid Credentials
    When I enter email id "poonam123@gmail.com"
    And I enter password "Poonam123"
    And I click on Login button
    Then I verify the Login Error message

  Scenario: Verify That User Should LogIn SuccessFully With Valid Credentials
    When I enter email id "poonam123450@gmail.com"
    And I enter password "poonam123"
    And I click on Login button
    Then Verify that LogOut link is display

  Scenario: Verify That User Should LogOut SuccessFully
    When I enter email id "poonam123450@gmail.com"
    And I enter password "poonam123"
    And I click on Login button
    And I click on logout Link
    Then I Verify that LogIn Link Display



