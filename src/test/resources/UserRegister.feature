Feature: Create Account

  As an user, I want to create an account to place orders.

  Scenario: Account creation fails

    Given The user can access a registration form.
    When The user enters their email, username, and password.
    Then The user receives a fail message if username already exist.
    And An error is returned because the username already exists.


  Scenario: Account creation succeeds

    Given The user can access a registration form.
    When The user enters their email, username, and password.
    Then The user receives a success confirmation after registration.
    And The user is redirected to the homepage after a successful login.