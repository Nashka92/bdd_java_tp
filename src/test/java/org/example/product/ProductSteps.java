package org.example.product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class ProductSteps {

    private List<Product> productList;

    public ProductSteps() {
        productList = new ArrayList<>();


        productList.add(new Product("Ordinateur", "Multimédia", 10));
        productList.add(new Product("Ecouteurs", "Multimédia", 25));
        productList.add(new Product("T-shirt", "Vêtement", 50));
        productList.add(new Product("Livre", "Librairie", 5));
        productList.add(new Product("Bible", "Librairie", 100));
        productList.add(new Product("Etagère","Ammeublement", 5 ));
        productList.add(new Product("Lampe à chevet", "Ammeublement", 3));
    }

    @Given("The user can access a search bar")
    public void userCanAccessSearchBar() {

    }

    @When("The user enters a keyword {string} into the search bar")
    public void userEnterKeyword(){

    }


    @Then("The user can access a category page")
    public void userCanAccessCategoryPage() {

    }



}


