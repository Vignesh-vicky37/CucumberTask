Feature: Faccebook login funtionality testing

  @FBvaild
  Scenario: To validate login functionality with valid email and valid password
    When User entering valid id "java@example.com" in email text box
    And User entering valid password "java@123" in password text box
    And User clicking login button

  @FBempty
  Scenario Outline: To validate login functionality with empty email and password
    When User entering email "<emailId>" to email field
    And  User entering password "<passWord>" to password field
    And  User now clicking login button
    Then To validate whether user has redirected to error page

    Examples: 
      | emailId       | passWord |
      | java@examples |          |
      |               | java@123 |
      |               |          |

   @FBexcel
   Scenario: TO validate login functionality with invalid email and password
   When user entering invalid id in email text box
   And  user entering invaild password in password text box
   And user clicking login btn
   Then validating whether user has redirected to error page