$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:case1/log.feature");
formatter.feature({
  "name": "Singup in testme App",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Singup successful",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user lanch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "register.user_lanch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open TestMeApp",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_open_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user in the home page",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the SingUp link",
  "keyword": "When "
});
formatter.match({
  "location": "register.user_click_the_SingUp_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username as \"samasp1234\" in User Name field",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_enter_username_as_in_User_Name_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter firstname as \"san\" in First Name field",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_enter_firstname_as_in_First_Name_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter lastname  as \"asp\" in Last Name field",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_enter_lastname_as_in_Laat_Name_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter  password  as \"Sanasp007\" in Password field",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_enter_password_as_in_Password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user re enter password  as \"Sanasp007\" in Confirm Password field",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_re_enter_password_as_in_Confirm_Password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click  in Genter field",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_enter_clicks_on_in_Genter_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter email as \"abcd1234@gamiul.com\" in E-Mail field",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_enter_email_as_in_E_Mail_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter phone number as \"1234567890\" in Mobile Number field",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_enter_phone_number_as_in_Mobile_Number_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters  date as \"09/05/2019\" in DOB field",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_enters_date_as_in_DOB_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter address as \"chennai\" in Address field",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_enter_address_as_in_Address_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select security question  Security Question field",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_select_security_question_Security_Question_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Answer as \"san\" in Answer field",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_enter_Answer_as_in_Answer_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Register Button",
  "keyword": "Then "
});
formatter.match({
  "location": "register.user_click_the_Register_Button()"
});
formatter.result({
  "status": "passed"
});
});