Feature: Check Title 
 
Scenario: Check if the title for all sites is "UI Testing Site"
	Given Application is opened
	When User Navigate to Home Page
	And User Navigate to Form Page
	And User Navigate to UITesting Page
	Then Title displayed "UI Testing Site"
 
