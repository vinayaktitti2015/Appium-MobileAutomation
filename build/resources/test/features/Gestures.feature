@gestures
Feature: Test Gestures

  Background:
    Given user is on application homepage

  Scenario:check swipeVertical
    Then user swipe screen vertical

  Scenario: check swipe Horizontal
    Then user swipe screen horizontal

  Scenario: check LandscapeRightRotation
    Then user rotate device into LandscapeRightRotation

  Scenario: check PortraitRightRotation
    Then user rotate device into PortraitRightRotation

  Scenario: check swipe
    Then user swipe using XY co-ordinates

  Scenario:  check swipe using elements
    Then user swipe from 1st Element to 2nd Element

  Scenario: check scroll to subElement
    Then user scroll to subElement

  Scenario: check swipe using Javascript
    Then user swipe using javascript

  Scenario:  check scroll
    Then user scroll "down"
    And user scroll "up"

