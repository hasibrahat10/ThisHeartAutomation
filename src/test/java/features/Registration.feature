Feature: Register a new user

  @test-register
  Scenario: Register a valid user with info
    Given I am on registration page
    Then Enter user valid info
    Then click on register
