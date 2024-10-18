Feature: Create Account and Login

    As an user, I want to create an account to place orders.

    Scenario: Account creation fails

        Given: The user can access a registration form.
        When: The user enters their email, username, and password.
        Then: The user receives a confirmation after registration.
        And: An error is returned because the username already exists.

    As an user, I want to create an account to place orders.

    Scenario: Account creation succeeds

        Given: The user can access a registration form.
        When: The user enters their email, username, and password.
        Then: The user receives an error message if the login fails.
        And: The user is redirected to the homepage after a successful login.