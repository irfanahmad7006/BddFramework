package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BillingSteps {
    double billingAmount;
    double taxAmount;
    double finalAmount;

    @Given("User is on billing page")
    public void user_is_on_billing_page() {
    }

    @When("User enters billing amount {int}")
    public void user_enters_billing_amount(Integer billingAmount) {
        this.billingAmount=billingAmount;
    }

    @When("User enters tax amount {double}")
    public void user_enters_tax_amount(Double taxAmount) {
        this.taxAmount=taxAmount;
    }

    @When("User enters tax amount {int}")
    public void user_enters_tax_amount(Integer taxAmount) {
        this.taxAmount = taxAmount;
    }

    @When("User click on calculate button")
    public void user_click_on_calculate_button() {

    }

    @Then("it give the final amount {int}")
    public void it_give_the_final_amount(Integer finalAmount) {
        this.finalAmount = this.billingAmount+this.taxAmount;
        Assert.assertTrue(this.finalAmount==finalAmount);
    }


    @Then("it give the final amount {double}")
    public void it_give_the_final_amount(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
