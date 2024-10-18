Feature: Search and Navigation of Products

    As a user, I want to search for products to quickly find what I need.

    Scenario: Search for products

        Given: The user can access a search bar.
        When: The user enters a keyword into the search bar.
        Then: The user sees a list of relevant search results.


    As a user, I want to navigate by product categories to discover available items.

    Scenario: Navigate through product categories

        Given: The user can access a category page.
        When: The user clicks on a category.
        Then: The user sees a list of products related to that category.


    As a user, I want to add products to my order.

    Scenario: Add products to order

        Given: The user is viewing a product page.
        When: The user clicks the "Add to order" button.
        Then: The user receives confirmation that the product was added to the order.
        And: If the product is already in the order, the quantity increases by 1.


    As a user, I want to remove products from my order.

     Scenario: Remove products from order

        Given: The user is viewing the order summary.
        When: The user clicks the "Remove" button next to a product.
        Then: The quantity of the product is decreased by 1, or the product is removed from the order if the quantity reaches 0.
        And: An error message is displayed if the product is not in the order.
