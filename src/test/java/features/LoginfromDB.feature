@Smoke
Feature: Swag Labs Login functionality
Background:
	Given User is on Swag Labs login page

@GoodLoginScenario
Scenario Outline: 1 User should be able to login with valid credentials 
	When User enters username as "<username>"
	When User enters password as "<password>"
	And User clicks on Signin button
	Then User should land on Dashboard page
Examples:
|username|password|
|standard_user |secret_sauce|
