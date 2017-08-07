Feature: ordering a dress

As a Tester
I need to login 
Inorder to place an order

@order
Scenario Outline: Ordering a dress

Given I open the "URL" on "<browser>"
And I click on "signin"
And I Enter the email
|shanthi.jayaraman7@gmail.com|7@oracle|

And I click on "sign"
And I click on "dress"
And I click on "summer"
And I click on "yellowdress"
And I click on "addtocart"
And I click on "proceed"
And I click on "address"
And I click on "checkout"
And I click on "checkbox"
And I click on "shipping"
And I click on "check"
And I click on "confirm"


Examples:
|browser|
|Chrome|
