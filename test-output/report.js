$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Account.feature");
formatter.feature({
  "name": "ThisHeart Account Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can add a new account",
  "description": "",
  "keyword": "Scenario"
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
  "name": "I click on account link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.DashboardSteps.i_click_on_account_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on add new account",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.AccountSteps.i_click_on_add_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill up the form info and click on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AccountSteps.i_fill_up_the_form_info_and_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/Beneficiary.feature");
formatter.feature({
  "name": "ThisHeart beneficiary page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can add a new beneficiary",
  "description": "",
  "keyword": "Scenario"
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
  "name": "I click on beneficiary link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.DashboardSteps.i_click_on_beneficiary_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on add beneficiary button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.BeneficiarySteps.i_click_on_add_beneficiary_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the beneficiary form info and I click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.BeneficiarySteps.i_enter_the_beneficiary_form_info_and_I_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Text displayed with \"BENEFICIARIES\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.BeneficiarySteps.textDisplayedWith(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/Login.feature");
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
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinitions.LoginSteps.pageTitleShouldBe(LoginSteps.java:44)\r\n\tat ✽.Page title should be \"ThisHeart- Dashboard\"(file:///E:/ThisHeartAutomation/src/test/java/features/Login.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/Medical.feature");
formatter.feature({
  "name": "ThisHeart Medical page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can add a medical info",
  "description": "",
  "keyword": "Scenario"
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
  "name": "I click on medical link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.DashboardSteps.iClickOnMedicalLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on add new button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MedicalSteps.i_click_on_add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a medical info and click save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MedicalSteps.i_select_a_medical_info_and_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/Memories.feature");
formatter.feature({
  "name": "ThisHeart Memories Page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.DashboardSteps.iClickOnMemoriesLink()"
});
formatter.result({
  "status": "passed"
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
formatter.step({
  "name": "I click on add new photo button",
  "keyword": "Then "
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
formatter.scenarioOutline({
  "name": "User can add a new video in memories page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test-addVideo"
    }
  ]
});
formatter.step({
  "name": "I click videos nav link",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on add new video button",
  "keyword": "And "
});
formatter.step({
  "name": "I fill up a new video form using \"\u003coption\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I should see video upload successful \"\u003cstatus\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "option",
        "",
        "status"
      ]
    },
    {
      "cells": [
        "Url or Link",
        "",
        "100%"
      ]
    },
    {
      "cells": [
        "Local Storage",
        "",
        "Url upload is success!"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.DashboardSteps.iClickOnMemoriesLink()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can add a new video in memories page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test-addVideo"
    }
  ]
});
formatter.step({
  "name": "I click videos nav link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iClickVideosNavLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on add new video button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iClickOnAddNewVideoButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill up a new video form using \"Url or Link\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iFillUpANewVideoFormUsingOption(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see video upload successful \"100%\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iShouldSeeVideoUploadSuccessful(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.DashboardSteps.iClickOnMemoriesLink()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can add a new video in memories page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test-addVideo"
    }
  ]
});
formatter.step({
  "name": "I click videos nav link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iClickVideosNavLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on add new video button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iClickOnAddNewVideoButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill up a new video form using \"Local Storage\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iFillUpANewVideoFormUsingOption(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see video upload successful \"Url upload is success!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iShouldSeeVideoUploadSuccessful(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.DashboardSteps.iClickOnMemoriesLink()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can add a letter in memories page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test-addLetter"
    }
  ]
});
formatter.step({
  "name": "I click on letter nav link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iClickOnLetterNavLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on add new letter button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iClickOnAddNewLetterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill add letter form and click save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iFillAddLetterFormAndClickSaveButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/Registration.feature");
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
  "name": "I am on registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.RegisterSteps.iAmOnRegistrationPage()"
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