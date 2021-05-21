Feature: MyFirstFeature
  Scenario: Open browser and Navigate
     Given User opened the Browser
    When User navigated to the app URL
   Then User is able to see application landing page

  Scenario: user is able to search for a product
    Given User opened the browser and navigate to the app URL
    When User search for a new product
    Then Search result for the product is displayed

    Scenario: Finding some cheese
      Given i am on the google search page
      When I search for "Cheese"
      Then the page tile should start with "cheese"