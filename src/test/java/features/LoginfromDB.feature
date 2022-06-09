@Smoke
Feature:  Login functionality
Background:
	Given User is on Youtube login page

@GoodLoginScenario
Scenario Outline: 1 User should be able to login with valid credentials 
	When User enters username as "<username>"
	When User enters password as "<password>"
Then User goes to video as "<vid>"
Then leaves comment on video as "<comment>"

Examples:
|username|password|vid|comment|
|johnyfable|Tableman1!!ok!5|https://youtu.be/VwWU6CZ5lJE| Xull crushes fools|
