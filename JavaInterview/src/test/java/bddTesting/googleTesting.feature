Feature: Test google application


Scenario: Google url validation
Given user launches "https://www.google.com/"
When user enters "Testing" in the google search box
Then print the url
And close the browser

Scenario: Google title validation
Given user launches "https://www.google.com/"
When user enters "Testing" in the google search box
Then print the title
And close the browser