Feature: Test loggin  functionality
  @Test
  Scenario: As a user I enter a access criteria in SmartFlow
    Given I am on the loggin page
    When I enter the credentials
    And click enter
    Then the i logged to the page