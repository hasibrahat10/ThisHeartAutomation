Feature: ThisHeart beneficiary page

  Background:
    Given I am on dashboard page
    And I click on beneficiary link

  @test-addBeneficiary
  Scenario: User can add a new beneficiary
    And I click on add beneficiary button
    And I enter the beneficiary form info and I click on save button
    Then Text displayed with "BENEFICIARIES"


  @test-deleteBeneficiary
  Scenario: User can delete a beneficiary
    And I click on beneficiary delete button
    And I confirm the beneficiary delete item

  @test-editBeneficiary
  Scenario: User can edit a beneficiary
    And I click on edit beneficiary button
    Then I enter the beneficiary edit form info
    Then I click on save changes button




