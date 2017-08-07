Feature: Login test
As a tester
I need to enter the user name and password
In order to enter in the site

@signin
Scenario Outline: Login test

Given I open the "URL" on "<browser>"
And I click on "signin"
And I Enter the "email" as "<emailid>"
And I Enter the "password" as "<pwd>"
And I click on "sign"

Examples:
|browser|emailid|pwd|
|Chrome|shanthi.jayaraman7@gmail.com|7@oracle|
