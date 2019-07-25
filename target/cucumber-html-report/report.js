$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "CopperEgg login feature",
  "description": "",
  "id": "copperegg-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "copperegg-login-feature;successful-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Title of login page is \"CopperEgg\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enters \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "copperegg-login-feature;successful-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 10,
      "id": "copperegg-login-feature;successful-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "govindaraju.shilpa@gmail.com",
        "copperegg"
      ],
      "line": 11,
      "id": "copperegg-login-feature;successful-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8047133922,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "copperegg-login-feature;successful-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Title of login page is \"CopperEgg\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enters \"govindaraju.shilpa@gmail.com\" and \"copperegg\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 14346667890,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CopperEgg",
      "offset": 24
    }
  ],
  "location": "LoginStepDefinition.title_of_login_page_is_copperegg(String)"
});
formatter.result({
  "duration": 160222373,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "govindaraju.shilpa@gmail.com",
      "offset": 13
    },
    {
      "val": "copperegg",
      "offset": 48
    }
  ],
  "location": "LoginStepDefinition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 588322447,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.click_on_Login_Button()"
});
formatter.result({
  "duration": 4983055841,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.User_is_on_home_page()"
});
formatter.result({
  "duration": 222742787,
  "status": "passed"
});
formatter.after({
  "duration": 923154481,
  "status": "passed"
});
});