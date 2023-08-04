Feature: To searc Macys Search Functionality.

  Scenario: Validate Search functionality is working.
    Given open browser
    And then open macys.com
    When user enters text in the search box
    And hits enter
    Then he should the typed text in the search results
