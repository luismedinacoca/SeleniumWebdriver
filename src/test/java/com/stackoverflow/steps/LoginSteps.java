package com.stackoverflow.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    @Before()
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Webdrivers\\geckodriver.exe");
        this.driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @Given("User navigates to stackoverflow website")
    public void user_navigates_to_stackoverflow_website() {
        driver.get("https://stackoverflow.com");
    }

    @Given("User clicks on the login button on homepage")
    public void user_clicks_on_the_login_button_on_homepage() {
        driver.findElement(By.xpath("//a[contains(text(), 'Log in')]")).click();
    }

    @Given("User enters a valid username")
    public void user_enters_a_valid_username() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("luismedinacoca@gmail.com");
    }

    @Given("User enters a valid password")
    public void user_enters_a_valid_password() {
        driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Ensenada2008");
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        driver.findElement(By.xpath(".//*[@id='submit-button']")).click();
    }

    @Then("User should be taken to the successful login page")
    public void user_should_be_taken_to_the_successful_login_page() throws InterruptedException {
        Thread.sleep(3000);
        WebElement askQuestionButton = driver.findElement(By.xpath("//a[contains(text(), 'Ask Question')]"));
        Assert.assertEquals(true, askQuestionButton.isDisplayed());
    }

    @After()
    public void close(){
        this.driver.quit();
    }
}
