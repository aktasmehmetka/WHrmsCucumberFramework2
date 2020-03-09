$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Invalid Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@login"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open bowser and navigated to the HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.i_open_bowser_and_navigated_to_the_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see syntax logo",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.i_see_syntax_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid username valid passowrd",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.i_enter_invalid_username_valid_passowrd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.i_see_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.i_close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});