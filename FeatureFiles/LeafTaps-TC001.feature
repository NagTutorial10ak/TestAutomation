#Author: Anusha Jakkala

Feature: LeafTaps Application
	
	@Leaf
	Scenario Outline: Test Login
		Given Launch the application for testcase "<TestCase Number>"
		When Verify user able to enter the userName
		And verify user able to enter the password
		And verify user able to click on the login button
	#	Then user should be successfully logged into the application
		
		
		Examples: 
	    | TestCase Number  |
	    |TC001_LeafTaps|
	    |TC002_LeafTaps|
	    
	