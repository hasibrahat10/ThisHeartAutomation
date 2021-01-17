$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Login ThisHeart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test-login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "click on advance button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.click_on_advance_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on back to safe button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.click_on_back_to_safe_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter user details",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.enter_user_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Skip",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.click_on_Skip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"ThisHeart- Dashboard\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.pageTitleShouldBe(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinitions.LoginSteps.pageTitleShouldBe(LoginSteps.java:43)\r\n\tat ✽.Page title should be \"ThisHeart- Dashboard\"(file:///F:/ThisHeartAutomation/src/test/java/features/Login.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});