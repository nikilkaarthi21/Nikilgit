Feature: Testing contactus on Automation Practice

As a Tester
I am designing the framework
Inorder to test BDD framework
@contact
Scenario Outline: Click on the contactus
Given I open "SITE" on "<browser>"
And I click on "Contactus"
And I Enter the data from Excel "subject" and "<Heading>"
And I Enter the data from Excel "objectname1" and "<Email>"
And I Enter the data from Excel "objectname2" and "<order>"
And I Enter the data from Excel "objectname3" and "<message>"
And I click on "send"

Examples:
|browser|Email|order|message|Heading|
|Chrome|nikil.kaarthi@gmail.com|312312|hello|Webmaster|
|mozilla|shanthi.jayaraman7@gmail.com|7873828|hi|Webmaster|


