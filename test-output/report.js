$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Registration.feature");
formatter.feature({
  "name": "Register a new user",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register a valid user with info",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test-register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "click on Advance details btn",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.RegisterSteps.clickOnAdvanceDetailsBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on proceed to safe btn",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.RegisterSteps.clickOnProceedToSafeBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter user valid info",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.RegisterSteps.enter_user_valid_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on register",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.RegisterSteps.click_on_register()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});