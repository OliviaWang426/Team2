Feature: Add to Cart

  @UI
  Scenario Outline: Add search item to cart
    Given user is on the safeway practice site homepage
    When user navigates to the login page
    And user click sign in button
    And user enters username - "oliviawang426@gmail.com" and password - "Ring4261213!"
    And user clicks on the login button
    When user enters text "milk" in search box and the submit
    Then user should see "milk" search result is on the page
    Then click on the product to view its details
    And click on the Add to Cart button
    And go to the cart page to verify that the product is listed in the cart
