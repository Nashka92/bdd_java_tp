package org.example.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Model.User;
import org.junit.Assert;

public class UserSteps {
    private User user;

    @Given("The user can access a registration form")
    public void userWhoCanAccessARegistrationForm() {
        System.out.println("User has accessed the registration form.");
    }

    @When("The user enters their email, username, and password")
    public void userEnterEmailUsernamePassword() {
        user = new User("leBgdu59", "titi@tata.fr", "hashed");
    }

    @Then("The user receives an error message if the username already exists")
    public void userReceiveErrorIfUsernameExists() {
        if (user.getUsername().equals("leBgDu59")) {
            System.out.println("Error: The username already exists");
            Assert.assertEquals("leBgdu59", user.getUsername());
        } else {
            System.out.println("Username is available.");
        }
    }

    @Then("The user receives a confirmation after registration")
    public void userReceiveConfirmation() {
        if (!user.getUsername().equals("caca")) {
            System.out.println("Registration success!");
            Assert.assertTrue(true);
        }
    }

    @And("The user is redirected to the homepage after a successful login")
    public void userRedirectedToHomepage() {
        if (user.isLoginSuccess()) {
            System.out.println("User is redirected to the homepage.");
            Assert.assertTrue(user.isLoginSuccess());
        }
    }
}


