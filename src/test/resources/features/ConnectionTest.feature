Feature: Test WiFi/ Airplane mode

  Scenario: check wifi connection
    Given user is on application homepage
    Then check connection set to Wifi


  Scenario: check Airplane mode
    Given user is on application homepage
    Then check connection set to Airplane

  Scenario: check Connection for All
    Given user is on application homepage
    Then check connection set to All