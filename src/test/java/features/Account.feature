Feature: ThisHeart Account Page

  Background:
    Given I am on dashboard page
    And I click on account link

  @test-addAccount
  Scenario: User can add a new account

    And I click on add new account
    Then I fill up the form info and click on save button

  @test-deleteAccount
  Scenario: User can delete an account
    Then I click on delete button
    And I confirm the account delete button
