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

  @test-viewLetter
  Scenario: User can view a letter from the list
    Then I click on letter nav link
    Then I click on view button and click close button


  @test-editLetter
  Scenario: User can edit a letter in memories
    Then I click on letter nav link
    And I click on edit button
    Then I enter the edit letter info
    And I click on save changes button.

  @test-searchLetter
  Scenario: User can search a letter item
    Then I click on letter nav link
    And I enter the search text as "worry" in the search box
    And Search result will be "worry"


  @test-addAudio
  Scenario: User can add an audio in memories page
    Then I click on recordings nav link
    And I click on add new record
    And I fill up the audio form
    Then I should see audio upload status 100%

  @test-deletePhoto
  Scenario: I want to delete a photo
    Then I click on an item
    Then I confirm the delete button
    Then I see the success message "Image has been deleted successfully!"

  @test-deleteVideo
  Scenario: I want to delete a video
    Then I click videos nav link
    Then I click on a video item
    Then I confirm the video delete button

  @test-deleteLetter
  Scenario: I want to delete a letter item
    Then I click on letter nav link
    Then I click on a letter item
    Then I confirm the letter delete button


  @test-deleteRecord
  Scenario: I want to delete a record item
    Then I click on recordings nav link
    Then I click on a record item
    Then I confirm the record delete button
















