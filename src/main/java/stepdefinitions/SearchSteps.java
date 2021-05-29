package stepdefinitions;

import AmazonTestImplementation.Product;
import AmazonTestImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps {
    Product product;
    Search search;
    @Given("User is on search field")
    public void user_is_on_search_field() {
        System.out.println("User is on search field");
    }

    @When("User searches for {string} with price {int}")
    public void user_searches_for_with_price(String product, Integer price) {
        System.out.println("Product is: "+product+" at price $"+price);
        this.product = new Product(product,price);
    }

    @Then("System displays the product {string}")
    public void system_displays_the_product(String product) {
        System.out.println(product+" is displayed");
        search = new Search();

        String name =search.displayProduct(this.product);
        System.out.println(name);
        Assert.assertEquals(name,product);
    }
}
