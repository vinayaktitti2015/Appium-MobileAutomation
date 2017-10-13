Feature: Test app features


  Scenario: check app installed
    Given user is on application homepage
    Then check app installed Successfully

  Scenario: check close appTest
    Given user is on application homepage
    Then check app closed Successfully

  #Scenario: check app Lock & UnLock
    Given user is on application homepage
    Then check device isLocked

  Scenario: check keyboard shown
    Given user is on application homepage
    Then check keyboard activity

  Scenario: check current activity
    Given user is on application homepage
    Then check current activity

