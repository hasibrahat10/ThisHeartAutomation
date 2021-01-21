Feature: ThisHeart beneficiary page

  Scenario: User can add a new beneficiary
    Given I am on dashboard page
    Then I click on beneficiary link
    And I click on add beneficiary button
    And I enter the beneficiary form info and I click on save button
    Then Text displayed with "BENEFICIARIES"




