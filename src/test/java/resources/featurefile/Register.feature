@regression
Feature: Registration
  As user I want to register on nop commerce demo website

  Background: I am on Homepage
    And I Click on Register Link

  @smoke
  Scenario: Verify User Should Navigate To Register Page Successfully

    When I Verify 'Register' text

  @sanity
  Scenario: Verify That FirstName LastName Email Password And Confirm Password Fields Are Mandatory

    When I click on REGISTER button
    And I Verify the error message "First name is required."
    And I Verify the last name error message "Last name is required."
    And I Verify the email error message "Email is required."
    And Verify the error message "Password is required."
    Then I  Verify the error msg "Password is required."


  Scenario:Verify That User Should Create Account Successfully

    When I Select gender "Female"
    And I Enter firstname 'Poonam'
    And I Enter lastname 'Ramavat'
    And I Select day '26'
    And I Select month 'June'
    And I Select year '1991'
    And I Enter email 'poonam123450@gmail.com'
    And I Enter password 'poonam123'
    And I Enter Confirm Password 'poonam123'
    And I click on REGISTER button
    Then I Verify message "Your registration completed"
