$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FBloginDetails.feature");
formatter.feature({
  "name": "Facebook login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login with invaild details in facebook application",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user entering email",
  "keyword": "When "
});
formatter.match({
  "location": "FbDetailsLogin.userEnteringEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entering password",
  "keyword": "And "
});
formatter.match({
  "location": "FbDetailsLogin.userEnteringPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login",
  "keyword": "And "
});
formatter.match({
  "location": "FbDetailsLogin.userClickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to validate user present in error page",
  "keyword": "Then "
});
formatter.match({
  "location": "FbDetailsLogin.toValidateUserPresentInErrorPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});