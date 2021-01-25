Feature: ThisHeart Dashboard Pages

  Background:
    Given I am on dashboard page

  @test-searchMemoryItems
  Scenario: User able to search memory items
    Then I click on search button
    Then I click on click by name and click on memories item
    And  I click on search button see the list

