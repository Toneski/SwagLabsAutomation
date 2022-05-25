@3
Feature: Swag Labs add Products to Cart then verify its contents functionality
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
	When User lands on cart, remove 1 random product
	Then User will click continue shopping to verify return to product page

	
Examples:
|username|password|
|standard_user |secret_sauce|
