Feature: Check Text 
 
Scenario: Check if the title for all sites is "UI Testing Site"
	Given Application is opened
	When User Navigate to Home Page
	Then Text is present