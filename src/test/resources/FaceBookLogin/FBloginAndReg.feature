@page2
Feature: User creating new account and log in
Background:
  @FBreg
  Scenario: User creating new account with required data
    When User clicking create new account button in log in screen
    Then To validate whether user present in account creation page
    When User entering firstname "VIGNESHWARAN"
    And User entering surname "K"
    And User entering mobile no or email address "Java@examples.com"
    And User entering new password "JavaSele@123"
    And user selecting date of birth from day,month and year drop down
    And User selecting gender from radio button provided

  @FBlogin
  Scenario: User logging in with registered data
    When user entering registered username in username text box "Java@examples.com"
    And user entering registered password in password text box "JavaSele@123"
    And User clicks login button

  @FBregExcel
  Scenario: User creating new account with required data from Excel
    When User clicking create new account button
    Then To validate whether the user present in account creation page
    When User entering firstname
    And User entering surname
    And User entering mobile no or email address
    And User entering new password
    And user selecting date of birth from day,month and year drop down
    And User selecting gender from radio button provided

  @FBloginExcel
  Scenario: User logging in with registered data by using excel
    When User entering username in username text box
    And User entering password in password text box
    And User now clicks login button

  @fbinva
  Scenario: user logining in with invalid data
    When user launcing chrome browser and maximizing
    And user launing url
    And user entering invaild email
    And user enterin invalidd password
    And user clicking login
    Then to validate whether user is redirected to error page
    And user
