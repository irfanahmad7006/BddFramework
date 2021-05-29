package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
    @Given("User wants to select a {string} car from uber app")
    public void user_wants_to_select_a_car_from_uber_app(String carType) {
        System.out.println("Step 1 "+carType);
    }
    @When("User selects car {string} and pickup point {string} to {string}")
    public void user_selects_car_and_pickup_point_to(String carType, String pickUpPoint, String dropPoint) {
        System.out.println("Step 2 "+carType+" "+pickUpPoint+" "+dropPoint);
    }
    @Then("Driver starts the journey")
    public void driver_starts_the_journey() {
        System.out.println("Step 3");
    }
    @Then("Driver ends the journey")
    public void driver_ends_the_journey() {
        System.out.println("Step 4");
    }
    @Then("User pays {int} rupees")
    public void user_pays_rupees(Integer price) {
        System.out.println("Step 5: "+price);
    }
}
