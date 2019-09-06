
Feature: Title of your feature
  I want to use this template for my feature file

   Scenario Outline: Title of your scenario outline
    Given user lanch the browser
    And   user open TestMeApp
    And   user in the home page
    And   user enter "<user name>" in user name field
    And   user enter "<Password>" in password field
    Then  click the login button
    And search head in search field
    And select the headphone
    And user try to access payment page
    Examples: 
      | user name     | Password  | 
      |  Lalitha    |  Password123 | 