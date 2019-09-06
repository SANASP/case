
Feature: Singup in testme App


  Scenario: Singup successful
    Given user lanch the browser
    And   user open TestMeApp
    And   user in the home page
    When user click the SingUp link
    And user enter username as "samasp1234" in User Name field
    And user enter firstname as "san" in First Name field
    And user enter lastname  as "asp" in Last Name field    
   And user enter  password  as "Sanasp007" in Password field
   And user re enter password  as "Sanasp007" in Confirm Password field
   And user click  in Genter field
   And user enter email as "abcd1234@gamiul.com" in E-Mail field
   And user enter phone number as "1234567890" in Mobile Number field
   And user enters  date as "09/05/2019" in DOB field
   And user enter address as "chennai" in Address field
   And user select security question  Security Question field
   And user enter Answer as "san" in Answer field
   Then user click the Register Button


 