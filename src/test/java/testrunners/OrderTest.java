package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/java/features/Order.feature"},
        glue = {"stepdefinitions"},
        plugin = "pretty"
)
public class OrderTest {
}
