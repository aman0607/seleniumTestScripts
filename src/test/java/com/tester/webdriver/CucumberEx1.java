package com.tester.webdriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by asingh on 1/23/18.
 */
public class CucumberEx1 {


    @Given("^I am officiating a FizzBuzz game$")
    public void I_am_officiating_a_FizzBuzz_game() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
    @When("^the number (\\d+) is played$")
    public void the_number_is_played(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
    @Then("^I should be told the correct answer is \"([^\"]*)\"$")
    public void I_should_be_told_the_correct_answer_is(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
