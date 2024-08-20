Feature: DemoQa giving inputs to first name and last name text box

Scenario: user entering valid first name and last name 
Given user opening web browser and maximizing it
When  user launching web application
And user entering "VIGNESHWARAN" in first name text box
And  user entering "K" in last name text box
Then user closing the web application and browser

