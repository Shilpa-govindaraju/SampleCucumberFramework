Feature: CopperEgg login feature
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Login Page
	When Title of login page is "CopperEgg"
	Then User enters "<userName>" and "<password>"
	And Click on Login Button
	Then User is on home page
		
		Examples:
		| userName | password | 
		| govindaraju.shilpa@gmail.com | copperegg |