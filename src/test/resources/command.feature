Feature: Ordering command

    As a user, I want to place an order.

    Scenario: Place an order

        Given: The user can access an order form.
        When: The user completes the order form and submits it.
        Then: The user receives a confirmation of the order.
        And: An error message is displayed if the order does not exist.