@login
Feature: SignIn Validation

  
  @login_tc2
  Scenario Outline: Validating Login with valid  and invalid credentials
    Given User launches the Login page
    When User enters credentials  with "<Sheetname>" and <RowNumber>
    Then Clicks on Login button and should appropriate alert message

    Examples: 
      | Sheetname    | RowNumber |
      | LoginDetails |         0 |
      | LoginDetails |         1 |
      | LoginDetails |         2 |
      | LoginDetails |         3 |
      | LoginDetails |         4 |

      
  @login_tc3
  Scenario Outline: Validating login with empty fields
    Given User launches the Login page
    When User enters credentials with empty "<Username>" or "<Password>" field
    And Clicks on Login button
    
    Examples: 
      | Username   | Password |
      |            | asap@123 |
      |            |          |
      | trio_test5 |          |
    
    @login_tc4  
   Scenario: Validating Signout
    Given User launches the Login page
    When User enters valid Username "deetest_11" and Password "workpass@1"
    And Clicks on Signout  link
    Then user should be logged out successfully with message "Logged out successfully"
      