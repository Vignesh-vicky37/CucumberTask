Feature: Facebook login

  Scenario: login with invaild details in facebook application
    When user entering email
    And user entering password
    And user click login
    Then to validate user present in error page
    
