Feature: E2E Test
Description: The purpose of this feature to automate one online application


Scenario: Login to the Application
Given I am on the login page
And I enter the username as 'Sumit'
And I enter the password as 'ghh'
And I do the needful required for successful login
When I click on login button 
Then I logged in successfully
