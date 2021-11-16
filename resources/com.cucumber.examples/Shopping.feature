Feature: Shopping for a product
  Scenario: See a thumbnail image for each product
    Given I am logged into application
    When I click the product's list page
    Then I see a list of thumbnails
    When I click on the desired product
    Then I see full picture of the product
    And I see product details

  Scenario Outline: Search for a product by category
    Given I am logged into application
    When I search by category < category>
    Then I see products from the selected category
    Examples:
      | category  |
      | Furniture |
      | Phones    |

  Scenario: Add to cart from the detail page
  Given

  Scenario: Select the product quantity

