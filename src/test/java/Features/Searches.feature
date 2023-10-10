Feature: search of various product categories should be possible along with normal product

Scenario: user should be able to search product under the books category

Given I visit the website as guest user
When I select the book option from search dropdown
And I click on the search option
Then I should be going on book search page
But I should not be able to see other products


Scenario: user should be able to search product under the baby category

Given I visit the website as guest user two
When I select the baby products option from search dropdown
And I click on the search option button
Then I should be going on baby product search page
But I should not be able to see other products on page
