@4
Feature: Swag Labs Checkout Products from Cart functionality
Background:
	Given User is on Swag Labs login page

@GoodLoginScenario
Scenario Outline: 1 User should be able to login with valid credentials 
	When User enters username as "<username>"
	When User enters password as "<password>"
	And User clicks on Signin button
	Then User should land on Dashboard page
	And  User will pick 2 random products, click add to cart
	When User will click on cart and view its contents 
	When User lands on cart, remove 1 product
	When User clicks checkout button and lands on checkout page
	And User enters shipping information "<FirstName>" "<LastName>" "<ZipCode>"
	Then User views confirmation page and verifies order information before clicking finish
	Then User arrives at the thank you page and goes back home
	
Examples:
|username|password|FirstName|LastName|ZipCode|
|standard_user |secret_sauce|Tony|Combs|75068|