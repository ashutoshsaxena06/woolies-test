@smoke @regression
Feature: product checkout feature

  Scenario: checkout t-shirts product
    Given I am on shopping home page
    When I navigate to "t-shirts" from "women" tab
    Then I should be able to see products
    When I add first item to the cart
    Then validate pop up product successfully added to your shopping cart
    And validate the item details
      | Total products | Total shipping | Total | Description                 | Quantity | Size |
      |                |                |       | Faded Short Sleeve T-shirts |          |      |
    When I click on continue shopping
    And search for item "PRINTED DRESS"
    And sort by lowest first price
    And I add first item to the cart
    Then validate pop up product successfully added to your shopping cart
    And validate the item details
      | Total products | Total shipping | Total | Description                 | Quantity | Size |
      |                |                |       | Faded Short Sleeve T-shirts |          |      |
    When I click on proceed to checkout
    Then validate cart summary with items
      | Total products | Total shipping | Total | Description                 | Quantity | Size |
      |                |                |       | Faded Short Sleeve T-shirts |          |      |



