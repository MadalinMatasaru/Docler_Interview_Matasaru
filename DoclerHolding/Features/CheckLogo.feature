Feature: Check Logo 
 
Scenario: Check if the logo is present on all pages
	Given Application is opened
	When User Navigate to Home Page
	Then Logo is displayed
	When User Navigate to Form Page
	Then Logo is displayed
	When User Navigate to UITesting Page
	Then Logo is displayed
 
