@generic
Feature: test generic functions
  As a user
  I want to test for paytm app

  Background:
    Given user is on application homepage
    When user clicks on login icon
    And user wait for few seconds
    Then user should see "My Orders"
    When user click on create a new account button1
    And user wait for few seconds


  Scenario: check replaceValueTest
    Then user should see "Create a New Paytm Account"
    When user enters mobile number "9290927171" and replace with "9618318571"
    And user enters password "xxxxxxxxxxx"
    And user hide keyboard
    And user click on create new account button2

  Scenario: check pressKeyBack
    When user enters mobile number "2323233232"
    And user navigate back
    Then user enters mobile number "4343434343"

  Scenario: check AppStringsTest
    And user hide keyboard
    Then The text "Login to Paytm" should be visible