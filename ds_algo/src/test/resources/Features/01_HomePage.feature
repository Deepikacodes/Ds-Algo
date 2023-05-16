@home
Feature: GetStarted button  and HomePage

  @home_tc1  @home_tc
  Scenario: User navigates to HomePage of ds-algo application
    Given User launches ds-algo portal link
    When User clicks on the Get Started button
    Then User should be redirected to HomePage

  @home_tc2 @home_tc
  Scenario Outline: User is on Home page and clicks on Get Started button on HomePage without sign in
    Given User launches HomePage
    When User clicks on Get Started button "<option>" on HomePage without login
    Then User should get warning message "You are not logged in"

    Examples: 
      | option         |
      | Arrays         |
      | Data Structures|
      | Linked List    |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
  
  @home_tc3 @home_tc
  Scenario Outline: User is on Home page and clicks on dropdown without sign in
    Given User launches HomePage
    When User clicks on dropdown "<value>" without login
    Then User should get warning message "You are not logged in"

    Examples: 
      | value       |
      | Arrays      |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |

  @home_tc4 @home_tc
  Scenario: User opens Home page and clicks on Signin
    Given User launches HomePage
    When User clicks on SignIn link
    Then User  should be  redirected to Login page
  
   @home_tc5 @home_tc
  Scenario: User opens Home page and clicks on Register
    Given User launches HomePage
    When User clicks on Register link
    Then User should be redirected to Register form
