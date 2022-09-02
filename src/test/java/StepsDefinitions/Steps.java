package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {


    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("the user is on login page");
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("Entered user credentials");
    }
    @And("hits submit")
    public void hits_submit() {
        System.out.println("Hit submit");
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("User logged in successfully");
    }
}
