@SmokeTest1
Feature: feature to test login functionality

  Scenario: Check login is successfully with valid credentials
    Given user is on home page
    
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page