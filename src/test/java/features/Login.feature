Feature: Login ThisHeart

  @test-login
  Scenario: Login with valid credentials
    Then click on advance button
    Then click on back to safe button
    Then Enter user details
    And Click on login
    Then Click on Skip
    Then Page title should be "ThisHeart- Dashboard"