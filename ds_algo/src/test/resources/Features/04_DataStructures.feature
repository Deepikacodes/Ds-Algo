@dstest
Feature: Data Structures-Intro

  Background: User is signed in to the ds-algo application
    Given User launches ds-algo portal link
    When User clicks on the Get Started button
    And User clicks on SignIn link
    When User enters valid username "deetest_11", password "workpass@1" and clicks on Login button
    Then User should be redirected to HomePage

  Scenario: Validating Data Structures Introduction page
    When User clicks on the 'Get Started' button in the Data Structures panel
    Then User is navigated to Data Structures Introduction page
    When User clicks on the Time Complexity link
    Then User is navigated to the Time Complexity page
    When User clicks on  the Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When User enters valid python code
      | print("Data Structures Introduction Module") |
    And click on run button
    Then User should see the valid output
