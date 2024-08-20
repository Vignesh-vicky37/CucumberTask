Feature: DemoQa registration

  @DemoQareg
  Scenario: User registering with valid data in demoqa web application
    When User clicking new user button
    And User entering "VIGNESHWARAN" in firstname text box
    And User entering "K" in lastname text box
    And User entering "VICKY" in username text box
    And User entering "java@123" in password text box
    And User clicking checkbox im not robot
    And User clciking register button

  @DemoQaLogin
  Scenario: User logging in with registered data
    When user entering registered "VICKY" in username textbox
    And user entering registered "java@123" in password text box
    And User clicking login button in demoqa login page

  @DemoQaregExcel
  Scenario: Users registering with valid data in demoqa web application
    When Users clicking new user button
    And Users entering in firstname text box
    And Users entering in lastname text box
    And Users entering in username text box
    And Users entering in password text box
    And Users clicking checkbox im not robot
    And Users clciking register button

  @DemoQaLoginExcel
  Scenario: Users logging in with registered data
    When users entering registered in username textbox
    And users entering registered in password text box
    And Users clicking login button in demoqa login page

  @DemodQaSO
  Scenario Outline: user leaving atleast one text box empty
    When User entering "<firstName>" in firstname box
    And User entering "<lastName>" in lastname box
    And User entering "<userNmae>" in username box
    And User entering "<passWord>" in password box

    Examples: 
      | firstName | lastName | userNmae | passWord |
      | Vignesh   | K        | Vicky    |          |
      | Vignesh   | K        |          | java@123 |
      | Vignesh   |          | vicky    | java@123 |
      |           | K        | Vicky    | java@123 |

  @DemoQas2
  Scenario: User registering valid data in demoqa web application
    When User giving input in firstname text box
    And User giving input in lastname text box
    And User giving input in username text box
    And User giving input in password text box
    And User clicking im not robot
    And User then clciking register button
