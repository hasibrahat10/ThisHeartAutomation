Feature: ThisHeart Medical page

  Background:
    Given I am on dashboard page
    And I click on medical link

  @test-addMedical
  Scenario: User can add a medical info
    And I click on add new button
    And I select a medical info and click save button


  @test-removeMedical
  Scenario: User can remove a medical item
    Then I click on remove link
    And I confirm the delete medical item

