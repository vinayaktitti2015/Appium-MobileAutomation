$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TopUp.feature");
formatter.feature({
  "line": 2,
  "name": "Mobile Recharge feature",
  "description": "",
  "id": "mobile-recharge-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@recharge"
    }
  ]
});
formatter.before({
  "duration": 29726872892,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "check Valid  mobile prepaid",
  "description": "",
  "id": "mobile-recharge-feature;check-valid--mobile-prepaid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on application homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user selects \"Mobile Prepaid\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user wait for few seconds",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should see \"Mobile Recharge or Bill Payment\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should see \"Instant payment from your Paytm balance\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "The Postpaid option should select by default",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters mobile number on mobile prepaid page \"9618318571\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should see \"Airtel - Andhra Pradesh\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters amount \"200\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user hide keyboard",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user select fastforward",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user should see \"Proceed to Pay\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on proceed to pay button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user should see \"Login to Paytm\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_stepdefs.user_is_on_application_homepage()"
});
formatter.result({
  "duration": 1653499954,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobile Prepaid",
      "offset": 14
    }
  ],
  "location": "SignUp_stepdefs.user_selects(String)"
});
formatter.result({
  "duration": 1235890279,
  "status": "passed"
});
formatter.match({
  "location": "Predefined_stepDefs.user_should_wait_for_fewseconds()"
});
formatter.result({
  "duration": 1002355459,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobile Recharge or Bill Payment",
      "offset": 17
    }
  ],
  "location": "Predefined_stepDefs.user_should_see(String)"
});
formatter.result({
  "duration": 2924999872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Instant payment from your Paytm balance",
      "offset": 17
    }
  ],
  "location": "Predefined_stepDefs.user_should_see(String)"
});
formatter.result({
  "duration": 137938817,
  "status": "passed"
});
formatter.match({
  "location": "TopUp_stepdefs.the_Postpaid_option_should_select_by_default()"
});
formatter.result({
  "duration": 151941879,
  "error_message": "java.lang.AssertionError: Postpaid is Not selected: \r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat pageObjects.TopUp_pageobjects.isPostpaidSelected(TopUp_pageobjects.java:73)\r\n\tat stepDefinitions.TopUp_stepdefs.the_Postpaid_option_should_select_by_default(TopUp_stepdefs.java:33)\r\n\tat ✽.And The Postpaid option should select by default(TopUp.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "9618318571",
      "offset": 50
    }
  ],
  "location": "TopUp_stepdefs.should_enter_mobile_number(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Airtel - Andhra Pradesh",
      "offset": 17
    }
  ],
  "location": "Predefined_stepDefs.user_should_see(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 20
    }
  ],
  "location": "TopUp_stepdefs.user_enters_amount(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Predefined_stepDefs.user_hide_keyboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TopUp_stepdefs.should_check_fastforward()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Proceed to Pay",
      "offset": 17
    }
  ],
  "location": "Predefined_stepDefs.user_should_see(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TopUp_stepdefs.click_on_proceed_to_pay_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Login to Paytm",
      "offset": 17
    }
  ],
  "location": "Predefined_stepDefs.user_should_see(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page is null");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 7246399188,
  "status": "passed"
});
formatter.before({
  "duration": 27341680760,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "check InValid  mobile prepaid",
  "description": "",
  "id": "mobile-recharge-feature;check-invalid--mobile-prepaid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user is on application homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "user selects \"Mobile Prepaid\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user should see \"Mobile Recharge or Bill Payment\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user should see \"Instant payment from your Paytm balance\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "The Prepaid option should select by default",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user enters mobile number on mobile prepaid page \"343434333\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user click on current operator",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user wait for few seconds",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user selects \"Airtel\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user selects \"Andhra Pradesh\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user should see \"Airtel - Andhra Pradesh\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user enters amount \"200\"",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user hide keyboard",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user should see \"Proceed to Pay 200\"",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "click on proceed to pay button",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user should see \"Please Enter a Valid Mobile Number\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_stepdefs.user_is_on_application_homepage()"
});
formatter.result({
  "duration": 2554022841,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobile Prepaid",
      "offset": 14
    }
  ],
  "location": "SignUp_stepdefs.user_selects(String)"
});
formatter.result({
  "duration": 669596522,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobile Recharge or Bill Payment",
      "offset": 17
    }
  ],
  "location": "Predefined_stepDefs.user_should_see(String)"
});
formatter.result({
  "duration": 3529090633,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Instant payment from your Paytm balance",
      "offset": 17
    }
  ],
  "location": "Predefined_stepDefs.user_should_see(String)"
});
formatter.result({
  "duration": 166502553,
  "status": "passed"
});
formatter.match({
  "location": "TopUp_stepdefs.the_Prepaid_option_should_select_by_default()"
});
formatter.result({
  "duration": 191242775,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "343434333",
      "offset": 50
    }
  ],
  "location": "TopUp_stepdefs.should_enter_mobile_number(String)"
});
formatter.result({
  "duration": 5097980047,
  "status": "passed"
});
formatter.match({
  "location": "TopUp_stepdefs.should_click_operator()"
});
formatter.result({
  "duration": 770064712,
  "status": "passed"
});
formatter.match({
  "location": "Predefined_stepDefs.user_should_wait_for_fewseconds()"
});
formatter.result({
  "duration": 999444093,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Airtel",
      "offset": 14
    }
  ],
  "location": "SignUp_stepdefs.user_selects(String)"
});
formatter.result({
  "duration": 1624470758,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Andhra Pradesh",
      "offset": 14
    }
  ],
  "location": "SignUp_stepdefs.user_selects(String)"
});
formatter.result({
  "duration": 880522168,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Airtel - Andhra Pradesh",
      "offset": 17
    }
  ],
  "location": "Predefined_stepDefs.user_should_see(String)"
});
formatter.result({
  "duration": 1610011195,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 20
    }
  ],
  "location": "TopUp_stepdefs.user_enters_amount(String)"
});
formatter.result({
  "duration": 4180967663,
  "status": "passed"
});
formatter.match({
  "location": "Predefined_stepDefs.user_hide_keyboard()"
});
formatter.result({
  "duration": 581049406,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Proceed to Pay 200",
      "offset": 17
    }
  ],
  "location": "Predefined_stepDefs.user_should_see(String)"
});
formatter.result({
  "duration": 1474491407,
  "error_message": "java.lang.AssertionError: Expected Text not found on screen\u003e\u003e\u003e Proceed to Pay 200 expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:93)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:512)\r\n\tat org.testng.Assert.assertTrue(Assert.java:41)\r\n\tat stepDefinitions.Predefined_stepDefs.user_should_see(Predefined_stepDefs.java:40)\r\n\tat ✽.Then user should see \"Proceed to Pay 200\"(TopUp.feature:36)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TopUp_stepdefs.click_on_proceed_to_pay_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Please Enter a Valid Mobile Number",
      "offset": 17
    }
  ],
  "location": "Predefined_stepDefs.user_should_see(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page is null");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 7064295819,
  "status": "passed"
});
});