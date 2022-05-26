@s
Feature: Swag Labs Product Filter functionality
Background:
	Given User is on Swag Labs login page

@GoodLoginScenario
Scenario Outline: User should be able to filter Products by alphabetical order & price range
	When User enters username as "<username>"
	When User enters password as "<password>"
	And User clicks on Signin button
	Then User should land on Dashboard page
	When User clicks right hand dropdown and selects Name (Z to A)
	When User clicks right hand dropdown and selects Name (A to Z)
	When User clicks right hand dropdown and selects Price (high to low)
	When User clicks right hand dropdown and selects Price (low to high)
	Examples:
|username|password|Name (Z to A)|Name (A to Z)|
|standard_user |secret_sauce|Name (Z to A)|Name (A to Z)|
