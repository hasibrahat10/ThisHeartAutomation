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
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinitions.LoginSteps.pageTitleShouldBe(LoginSteps.java:44)\r\n\tat ✽.Page title should be \"ThisHeart- Dashboard\"(file:///F:/ThisHeartAutomation/src/test/java/features/Login.feature:8)\r\n",
  "status": "failed"
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
  "error_message": "org.openqa.selenium.InvalidArgumentException: invalid argument: File not found : C:\\Users\\rootnext\\Downloads\\scd1.png\n  (Session info: chrome\u003d87.0.4280.141)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-8IIG3HH\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.141, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\asus\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:52645}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 3a9f075015a4534fc093c56478b23ce0\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat pages.MemoriesPage.uploadPhoto(MemoriesPage.java:103)\r\n\tat stepDefinitions.MemoriesSteps.i_fill_add_photo_form_and_click_upload_button(MemoriesSteps.java:19)\r\n\tat ✽.I fill add photo form and click upload button(file:///F:/ThisHeartAutomation/src/test/java/features/Memories.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I should see photo upload status 100%",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iShouldSeePhotoUploadStatus(int)"
});
formatter.result({
  "status": "skipped"
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
  "error_message": "org.openqa.selenium.InvalidArgumentException: invalid argument: File not found : C:\\Users\\rootnext\\Downloads\\samplevideo.mp4\n  (Session info: chrome\u003d87.0.4280.141)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-8IIG3HH\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.141, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\asus\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:52734}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 67dc8f8f8e9ee102461e75b0e83ddebd\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat pages.MemoriesPage.uploadVideo(MemoriesPage.java:166)\r\n\tat stepDefinitions.MemoriesSteps.iFillUpANewVideoFormUsingOption(MemoriesSteps.java:75)\r\n\tat ✽.I fill up a new video form using \"Local Storage\"(file:///F:/ThisHeartAutomation/src/test/java/features/Memories.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I should see video upload successful \"Url upload is success!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.MemoriesSteps.iShouldSeeVideoUploadSuccessful(java.lang.String)"
});
formatter.result({
  "status": "skipped"
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