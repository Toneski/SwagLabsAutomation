@6
Feature: Swag Labs SideMenu functionality
Background:
	Given User is on Swag Labs login page

@GoodLoginScenario
Scenario Outline: 1 User should be able to login with valid credentials 
	When User enters username as "<username>"
	When User enters password as "<password>"
	And User clicks on Signin button
	Then User should land on Dashboard page
	When User clicks Sidemenu it should open
	And User clicks About and lands on About page
	When User clicks back arrow and returned to home page
	Then User clicks cart to land on cart
	When User clicks Sidemenu it should open	
	And User clicks All Items and lands on All Items
	When User clicks Sidemenu it should open
	Then User clicks Logout and user is logged out
Examples:
|username|password|
|standard_user |secret_sauce|
