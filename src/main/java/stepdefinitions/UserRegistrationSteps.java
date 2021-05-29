package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class UserRegistrationSteps {
    @Given("User is on regisration page")
    public void user_is_on_regisration_page() {
        System.out.println("User Navigates to Registration page");
    }

    @When("User enters following user details")
    public void user_enters_following_user_details(DataTable dataTable) {
        List<List<String>> userList=dataTable.asLists(String.class);
        for (List<String> e: userList){
            System.out.println(e);
        }
    }

    @Then("User registration should be succefull")
    public void user_registration_should_be_succefull() {
        System.out.println("Registration is successfull");
    }

    @When("User enters following user details with columns")
    public void user_enters_following_user_details_with_columns(DataTable dataTable) {
        List<Map<String,String>> listOfMaps = dataTable.asMaps(String.class,String.class);
        System.out.println(listOfMaps);
        for (Map<String,String> e: listOfMaps){
            System.out.println(e.get("FirstName"));
            System.out.println(e.get("LastName"));
            System.out.println(e.get("Email"));
            System.out.println(e.get("Phone"));
            System.out.println(e.get("City"));
        }

    }
}
