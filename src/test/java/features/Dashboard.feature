Feature: ThisHeart Dashboard Pages

  Background:
    Given I am on dashboard page
    Then I click on search button

  @test-searchAllItems
  Scenario: User search all items
    Then I click on all search button
    And I click on search button see all list

  @test-searchMemoryItems
  Scenario: User able to search memory items
    Then I click on search button
    Then I click on click by name and click on memories item
    And  I click on search button see the list

