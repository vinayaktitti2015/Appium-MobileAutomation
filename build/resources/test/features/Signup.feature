@register
Feature: New user signup process
  As a user
  I want to signup for paytm app

  Background:
    Given user is on application homepage
    When user clicks on login icon
    And user wait for few seconds
    Then user should see "My Orders"
    When user click on create a new account button1
    And user wait for few seconds
    And user hide keyboard

  Scenario: check Successful signup with Valid credentials
    Then user should see "Create a New Paytm Account"
    When user enters mobile number on signup page "9290927171"
    And user enters password "xxxxxxxxxxx"
    And user hide keyboard
    And user click on create new account button2

  @smoke
  Scenario Outline: check validation message for Invalid mobile number
    When user enters mobile number "<Invalid number>"
    And user hide keyboard
    And user click on create new account button2
    Then validation of mobile number should be "<validation message>"

    Examples:
      | Invalid number | validation message               |
      | 4234233422     | Please enter valid Mobile Number |
      | 1231           | Please enter valid Mobile Number |


  @smoke
  Scenario Outline: check validation message for Invalid Password
    When user enters mobile number "9290927170"
    When user enters password "<Invalid number>"
    And user hide keyboard
    And user click on create new account button2
    And user wait for few seconds
    Then The validation message should be "<validation message>"
    And user click Ok button

    Examples:
      | Invalid number | validation message                                          |
      | abcde          | Such common passwords are not allowed.                      |
      | 12345          | Password should be 5-15 length, atleast 1 number/1 alphabet |
      | testprime      | Password should be 5-15 length, atleast 1 number/1 alphabet |

  Scenario: check Password Hide & Show feature
    And user should not see "My Orders"
    And user enters password "test12345"
    And user taps on "Hide"
    Then user should not see "test12345"
    When user taps on "Show"
    Then user should see "test12345"

  Scenario: check Terms & Cond's feature
    And user taps on "Terms & Conditions"
    Then user should see "Legal"

  Scenario: check user navigation on create acct page
    When user taps on "Login to Paytm"
    Then user should see "Paytm wallet is now aprt of Paytm Payments Bank"
    When user taps on "Create a New Account"
    Then user should see "Create a New Paytm Account"












