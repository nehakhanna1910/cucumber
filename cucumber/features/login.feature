Feature: Login Action

  Background: 
    Given User is on Login Page
 @regression @smoke
  Scenario Outline: Successful Login with Valid Credentials
    When User enters "<Username>" and "<Password>"
    And User click on signin Button
    Then Message displayed Login Successfully
    

    Examples:
    |Username|Password|
    |test|test|
    |test1|test1|
    
 