Feature: Application Login

Scenario: demo
Given first
When second
Then third
And forth

Scenario: Home page default login
Given User is on landing page
When User login to the application with user name "noushin" and password "noushin"
Then Home page is populated
And Cards displayed are "true"



