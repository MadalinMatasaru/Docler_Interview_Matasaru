Feature: Check Form 
 
Scenario: Check if the Form works
	Given Application is opened
	When User Navigate to Form Page
	And Input name is Madalin
	And Go! button is pressed
	Then Text displayed "Hello Madalin"
 
