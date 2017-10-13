@recharge
Feature: Mobile Recharge feature

  Scenario: check Valid  mobile prepaid
    Given user is on application homepage
    When user selects "Mobile Prepaid"
    And user wait for few seconds
    Then user should see "Mobile Recharge or Bill Payment"
    And user should see "Instant payment from your Paytm balance"
    And The Prepaid option should select by default
    And user enters mobile number on mobile prepaid page "9618318571"
    Then user should see "Airtel - Andhra Pradesh"
    When user enters amount "200"
    And user hide keyboard
    When user select fastforward
    And click on proceed to pay button
    Then user should see "Login to Paytm"

  Scenario: check InValid  mobile prepaid
    Given user is on application homepage
    When user selects "Mobile Prepaid"
    Then user should see "Mobile Recharge or Bill Payment"
    And user should see "Instant payment from your Paytm balance"
    And The Prepaid option should select by default
    And user enters mobile number on mobile prepaid page "343434333"
    And user click on current operator
    And user wait for few seconds
    And user selects "Airtel"
    And user selects "Andhra Pradesh"
    Then user should see "Airtel - Andhra Pradesh"
    When user enters amount "200"
    And user hide keyboard
    Then user should see "Proceed to Pay 200"
    When click on proceed to pay button
    Then user should see "Please Enter a Valid Mobile Number"










