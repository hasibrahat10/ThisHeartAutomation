Feature: ThisHeart Update profile

  Background:
    Given I am on dashboard page
    Then I click on profile name
    And I click on update profile

  @test-updateProfilePhoto
  Scenario: User can update profile photo
    And I choose profile image
    And Click upload button

  @test-updateProfilePassword
  Scenario: Update password for the profile
    Then I have enter the password info
    Then I click on update button






