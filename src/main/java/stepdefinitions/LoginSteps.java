package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("User is on Application landing page")
    public void user_is_on_application_landing_page() {

    }
    @When("User clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
        System.out.println("Step 1");
    }
    @Then("User is displayed login screen")
    public void user_is_displayed_login_screen() {
        System.out.println("Step 2");
    }
    @When("User enters {string} in username field")
    public void user_enters_in_username_field(String string) {
        System.out.println("Step 3");
    }
    @When("User enters {string} in password field")
    public void user_enters_in_password_field(String string) {
        System.out.println("Step 4");
    }
    @When("User clicks on button")
    public void user_clicks_on_button() {
        System.out.println("Step 5");
    }
    @Then("user gets login failed error message")
    public void user_gets_login_failed_error_message() {
        System.out.println("Step 6");
    }
}
