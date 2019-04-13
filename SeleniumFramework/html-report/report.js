$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/SendEmailMessage.feature");
formatter.feature({
  "name": "As a user I should be able to Send a custom email to the application support center",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Send a Message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Navigate to My Store Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SendEmailStepDef.user_Navigate_to_My_Store_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Contact Us Page",
  "keyword": "When "
});
formatter.match({
  "location": "SendEmailStepDef.user_Click_on_Contact_Us_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill Up all the info and Send Email",
  "keyword": "Then "
});
formatter.match({
  "location": "SendEmailStepDef.user_fill_Up_all_the_info_and_Send_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});