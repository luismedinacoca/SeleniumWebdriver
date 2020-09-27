package com.stackoverflow.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User navigates to stackoverflow website")
    public void user_navigates_to_stackoverflow_website() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Steps 01: User navigates to stackoverflow website");
    }

    @Given("User clicks on the login button on homepage")
    public void user_clicks_on_the_login_button_on_homepage() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Steps 02: User clicks on the login button on homepage");
    }

    @Given("User enters a valid username")
    public void user_enters_a_valid_username() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Step 03: User enters a valid username");
    }

    @Given("User enters a valid password")
    public void user_enters_a_valid_password() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Step 04: User enters a valid password");
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Step 05: User clicks on the login button");
    }

    @Then("User should be taken to the successful login page")
    public void user_should_be_taken_to_the_successful_login_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Step 06: User should be taken to the successful login page");
    }
}
