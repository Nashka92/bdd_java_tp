Feature: Create Account

    As an user, I want to connect to place orders.

    Scenario: Connection to login page is success

        Given The user can access a login page.
        When The user enters their username, and password.
        Then The user receives a fail message if username already exist.
        And An error is returned because the username already exists.


    Scenario: Connection to login page is fail

        Given The user can access a registration form.
        When The user enters their email, username, and password.
        Then The user receives a success confirmation after registration.
        And The user is redirected to the homepage after a successful login.

    Scenario: Password is wrong

        Given The user can access a registration form.
        When The user enters their email, username, and password.
        Then The user receives a success confirmation after registration.
        And The user is redirected to the homepage after a successful login.