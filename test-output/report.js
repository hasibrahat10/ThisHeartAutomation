$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Memories.feature");
formatter.feature({
  "name": "ThisHeart Memories Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can add a new photo in memories page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test-addPhoto"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on dashboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.DashboardSteps.iAmOnDashboardPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on memories link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.DashboardSteps.iClickOnMemoriesLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on add new photo button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.i_click_on_add_new_photo_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill add photo form and click upload button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.i_fill_add_photo_form_and_click_upload_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see photo upload status 100%",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iShouldSeePhotoUploadStatus(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});