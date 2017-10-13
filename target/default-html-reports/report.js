$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GenericFunctions.feature");
formatter.feature({
  "line": 2,
  "name": "test generic functions",
  "description": "As a user\r\nI want to test for paytm app",
  "id": "test-generic-functions",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@generic"
    }
  ]
});
formatter.before({
  "duration": 33959789841,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "user is on application homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login icon",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user wait for few seconds",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should see \"My Orders\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user click on create a new account button1",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user wait for few seconds",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user hide keyboard",
  "keyword": "And "
});
formatter.match({
  "location": "SignUp_stepdefs.user_is_on_application_homepage()"
});
formatter.result({
  "duration": 1454225907,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_stepdefs.user_clicks_on_login_icon()"
});
formatter.result({
  "duration": 813968391,
  "status": "passed"
});
formatter.match({
  "location": "Predefined_stepDefs.user_should_wait_for_fewseconds()"
});
formatter.result({
  "duration": 1008096641,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Orders",
      "offset": 17
    }
  ],
  "location": "Predefined_stepDefs.user_should_see(String)"
});
formatter.result({
  "duration": 75132203,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_stepdefs.user_click_on_create_a_new_account()"
});
formatter.result({
  "duration": 185815306,
  "status": "passed"
});
formatter.match({
  "location": "Predefined_stepDefs.user_should_wait_for_fewseconds()"
});
formatter.result({
  "duration": 999258512,
  "status": "passed"
});
formatter.match({
  "location": "Predefined_stepDefs.user_hide_keyboard()"
});
formatter.result({
  "duration": 1443552829,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "check replaceValueTest",
  "description": "",
  "id": "test-generic-functions;check-replacevaluetest",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "user should see \"Create a New Paytm Account\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enters mobile number \"9290927171\" and replace with \"9618318571\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters password \"xxxxxxxxxxx\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user hide keyboard",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user click on create new account button2",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Create a New Paytm Account",
      "offset": 17
    }
  ],
  "location": "Predefined_stepDefs.user_should_see(String)"
});
formatter.result({
  "duration": 874478601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9290927171",
      "offset": 27
    },
    {
      "val": "9618318571",
      "offset": 57
    }
  ],
  "location": "SignUp_stepdefs.should_replace_value(String,String)"
});
formatter.result({
  "duration": 18322552033,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xxxxxxxxxxx",
      "offset": 22
    }
  ],
  "location": "SignUp_stepdefs.user_enters_password(String)"
});
formatter.result({
  "duration": 10070767321,
  "status": "passed"
});
formatter.match({
  "location": "Predefined_stepDefs.user_hide_keyboard()"
});
formatter.result({
  "duration": 635929324,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_stepdefs.user_click_on_create_new_account()"
});
formatter.result({
  "duration": 1444182965,
  "status": "passed"
});
formatter.after({
  "duration": 6092590025,
  "status": "passed"
});
});