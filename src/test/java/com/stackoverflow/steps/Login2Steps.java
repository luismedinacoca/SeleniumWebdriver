package com.stackoverflow.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login2Steps {

    @Given("User navigates to stackoverflow website2")
    public void user_navigates_to_stackoverflow_website2() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Step 01");
    }

    @Given("User clicks on the login button on homepage2")
    public void user_clicks_on_the_login_button_on_homepage2() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Step 02");
    }

    @Given("User enters a valid username2")
    public void user_enters_a_valid_username2() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Step 03");
    }

    @Given("User enters a valid password2")
    public void user_enters_a_valid_password2() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Step 04");
    }

    @When("User clicks on the login button2")
    public void user_clicks_on_the_login_button2() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Step 05");
    }

    @Then("User should be taken to the successful login page2")
    public void user_should_be_taken_to_the_successful_login_page2() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Step 06");
    }
}
