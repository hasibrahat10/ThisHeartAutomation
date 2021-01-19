Feature: ThisHeart Memories Page

  Background:
    Given I am on dashboard page
    And I click on memories link

  @test-addPhoto
  Scenario: User can add a new photo in memories page
    Then I click on add new photo button
    And I fill add photo form and click upload button
    Then I should see photo upload status 100%

  @test-addVideo
  Scenario Outline: User can add a new video in memories page
    Then I click videos nav link
    And I click on add new video button
    And I fill up a new video form using "<option>"
    Then I should see video upload successful "<status>"

    Examples:
      | option        |  | status                 |
      | Url or Link   |  | 100%                   |
      | Local Storage |  | Url upload is success! |

  @test-addLetter
  Scenario: User can add a letter in memories page
    Then I click on letter nav link
    And I click on add new letter button
    And I fill add letter form and click save button




