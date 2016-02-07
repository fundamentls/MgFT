Feature: Add to cart

  As a costumer

  I want to view the contents of my bag prior to checkout

  Background: Setup to test add produt to cart
    Given I am at the shop homepage
    And I head to a product page

  Scenario: Add item to bag and view cart
    Given I have added an item to my cart
    When I view the contents of my cart
    Then I should see the contents of the cart include the item