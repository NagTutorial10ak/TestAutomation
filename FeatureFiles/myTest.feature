#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: I'm Testing the FACEBOOK application SIGN UP


  Scenario Outline: Validating the sign up functionality of FaceBook
    Given Launch the application for testcase "<TestCase Number>"
    When Click on the Create New Account
    And Enter the firstName as "<firstName>"
    And Enter the surName
    
 Examples: 
      |TestCase Number|firstName|
      |TC001_FACEBOOK|My Name|
