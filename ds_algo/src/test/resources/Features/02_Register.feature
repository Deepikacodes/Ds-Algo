@Register
Feature: Register

  @Register_tc1 @test
  Scenario: Navigating to Register page from ds-algo portal
    Given User launches ds-algo portal link
    When User clicks on the Get Started button
    And Clicks on Register link
    Then User should be successfully navigated to Register page

  @Register_tc2 @test
  Scenario: Navigating to Login page from Register page
    Given User launches Register page
    When User clicks on Login link
    Then User should be successfully navigated to Login page

  @Register_tc3 @test1
  Scenario: Successful registration with valid credentials
    Given User launches Register page
    When User enters following  valid credentials
      | Username   | Password  | Password confirmation |
      | test_dee9  | auto@136  | auto@136              |
      | trio_test9 | regpass12 | regpass12             |
    And Clicks on the Register button
    Then User should be  able to  successfully register and see the success message "New Account Created."

  @Register_tc4 @test
  Scenario: Validating registration with empty fields
    Given User launches Register page
    When User clicks on Register button without entering Username and password
    Then User should see a pop-up text "Please fill out this field." below Username field

  @Register_tc5 @test
  Scenario Outline: Validating registration with valid username and  empty password field
    Given User launches Register page
    When User clicks on Register button entering  valid "<Username>" and empty  Password field
    Then User should see a pop-up text "Please fill out this field." under Password field

    Examples: 
      | Username   |
      | deetest_11 |

  @Register_tc6 @test
  Scenario Outline: Validating registration with valid Username, Password  and  empty Password  confirmation field
    Given User launches Register page
    When User clicks  on Register button entering valid " <Username>" ,"<Password>" and empty  Password confirmation field
    Then User should  see a pop-up text under password confirmation field "Please fill out this field."

    Examples: 
      | Username   | Password |
      | deetest_11 | asap@123 |

   @Register_tc7 @test
  Scenario Outline: Validating registration with empty Username, valid Password  and Password  confirmation field
    Given User launches Register page
    When User clicks  on Register button entering valid " <Password>" ,"<Password confirmation>" and empty Username field
    Then User should see a pop-up text "Please fill out this field." below Username field

    Examples: 
      | Password   | Password confirmation|
      | deetest_11 | deetest_11           |
      
  @Register_tc8 @test
  Scenario Outline: Validate password mismatch
    Given User launches Register page
    When User clicks  on Register button entering input fields "<Username>","<Password>","< Password confirmation>"
    Then User should  see the error message "password_mismatch:The two password fields didn’t match."

    Examples: 
      | Username   | Password | Password confirmation |
      | deetest_11 | asap@123 | asap@1234             |

  