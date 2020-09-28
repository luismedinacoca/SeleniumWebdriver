package com.webdriveruniversity.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ContactUsSteps {

    WebDriver driver;

    @Before()
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Webdrivers\\geckodriver.exe");
        this.driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @Given("I access webdriveruniversity")
    public void i_access_webdriveruniversity() {
        System.out.println("I access webdriveruniversity");
    }

    @When("I click on the contact us button")
    public void i_click_on_the_contact_us_button() {
        System.out.println("I click on the contact us button");
    }

    @When("I enter a valid firstname")
    public void i_enter_a_valid_firstname() {
        System.out.println("I enter a valid firstname");
    }

    @When("I enter a valid lastname")
    public void i_enter_a_valid_lastname() {
        System.out.println("I enter a valid lastname");
    }

    @When("I enter a valid email address")
    public void i_enter_a_valid_email_address() {
        System.out.println("I enter a valid email address");
    }

    @When("I enter comments")
    public void i_enter_comments() {
        System.out.println("I enter comments");
    }

    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
        System.out.println("I click on the submit button");
    }

    @Then("the information should successfully be submitted via the contact us form")
    public void the_information_should_successfully_be_submitted_via_the_contact_us_form() {
        System.out.println("the information should successfully be submitted via the contact us form");
    }

    @When("I enter a non valid firstname")
    public void i_enter_a_non_valid_firstname() {
        System.out.println("I enter a non valid firstname");
    }

    @When("I enter a non valid lastname")
    public void i_enter_a_non_valid_lastname() {
        System.out.println("I enter a non valid lastname");
    }

    @When("I enter a non valid email address")
    public void i_enter_a_non_valid_email_address() {
        System.out.println("I enter a non valid email address");
    }
}