Feature: loginTest
Scenario: login with valid data

Given open chrome brower 
When navigate to orangehrm application
Then enter the user details
And logout from the application
And quit the browser
