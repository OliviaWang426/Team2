Feature: safeway Search

  @UI
  Scenario Outline: Search and collect data
    Given user is on the safeway practice site homepage
    When user navigates to the login page
    And user click sign in button
    And user enters username - "oliviawang426@gmail.com" and password - "Ring4261213!"
    And user clicks on the login button
    When user enters text "milk" in search box and submit
    Then user should see "milk" search result is on the page
