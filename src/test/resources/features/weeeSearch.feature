Feature: weee Search

  @UI
  Scenario Outline: Search and collect data
    Given user is on the veee practice site homepage
    When user navigates to the login page
    And user click sign in button
    And user enters username - "oliviawang426@gmail.com" and password - "Ring4261213!"
    And user clicks on the login button
    When user search for some items
    Then user should see some search results
  
