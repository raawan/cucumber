package com.somefeauture.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    //Use cucumber to bind feature file steps to java code
    @Given("the user is on the login page")
    public void user_on_login_page() {
        System.out.println("step 1 : the user is on the login page");
    }

    @When("the user enters valid credentials")
    public void user_enter_valid_credentials() {
        System.out.println("step 2 : the user enters valid credentials");
    }

    @Then("the user should be able to view thier account balance")
    public void user_should_see_account_bal() {
        System.out.println("step 3 : the user should be able to view thier account balance");
    }

}