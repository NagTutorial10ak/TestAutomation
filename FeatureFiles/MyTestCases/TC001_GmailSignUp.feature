#Author: Nagaraju M
# This feature file performs automation on Gmail signup


Feature: Gmail Functionality

  Scenario Outline: Validating the GMAIL SignUp functionality
    Given Launch the browser and application for the testcase "<TestCase>"
    When Enter the FirstName 
    And Enter the LastName
    And Enter the mail id
    And Enter the password
    And Enter the confirm password 
 #   And click on Next
    
    Examples: 
    |TestCase|
		|TC001_GmailSignUp|
		|TC002_GmailSignUp|   
