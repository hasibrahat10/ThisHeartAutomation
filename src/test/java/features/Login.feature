Feature: Login ThisHeart

  @test-login
  Scenario: Login with valid credentials
    Then Enter user details
    And Click on login
    Then Click on Skip
    Then Page title should be "ThisHeart- Dashboard"


  @test-loginDriven
  Scenario Outline: Login Data Driven
    Then User enter Email as "<email>" and Password as "<password>"
    And Click on login
    Then Click on Skip
    Then Page title should be "ThisHeart- Dashboard"
    Then Click on profile name
    When User click on Log out link
    And Confirm the logout
    Then Page title should be "ThisHeart-Login"


    Examples:
      | email             | password     |
      | demot@yopmail.com | hasib12345;; |
      | demot@gmail.com   | hasib12345;; |
