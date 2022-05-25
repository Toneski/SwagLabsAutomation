@5
Feature: Swag Labs open and vist all of Swag Labs social media links functionality
Background:
	Given User is on Swag Labs login page

@GoodLoginScenario
Scenario Outline: 1 User should be able to login with valid credentials 
	When User enters username as "<username>"
	When User enters password as "<password>"
	And User clicks on Signin button
	Then User should land on Dashboard page
	Then User clicks on Twitter link to land on Users Twitter page
	Then User clicks on FaceBook link to land on Users FaceBook page
	Then User clicks on LinkedIn link to land on Users LinkedIn page
Examples:
|username|password|
|standard_user |secret_sauce|
