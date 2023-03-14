@Login
Feature: Login

  @UI @Regression @Smoke @Happy
  Scenario: Happy path login
    Given user is on the boratech practice site homepage
    When user navigates to the login page
    And user enters username - "123@text.com" and password - "ring1213"
    And user clicks on the login button
    #Then user should be on the dashboard page

  @UI @Regression @Unhappy
  Scenario Outline: Unhappy path login
    Given user is on the boratech practice site homepage
    When user navigates to the login page
    And user enters username - "<username>" and password - "<password>"
    And user clicks on the login button
    Then user should see an error alert with the message - "<errorMessage>"

    Examples: 
      | username                            | password    | errorMessage        |
      | muradil.erkin123@boratechschool.com | Boratech    | Invalid credentials |
      | muradil.erkin@boratechschool.com    | Boratech123 | Invalid credentials |
      | muradil.erkin@hello                 | Boratech123 | Invalid email       |
