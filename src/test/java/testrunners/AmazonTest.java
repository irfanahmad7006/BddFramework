package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/Search.feature"},
        glue = {"stepdefinitions","hooks"},
        tags = "@Smoke or @Regression",
        plugin = "pretty"
)
public class AmazonTest {
}
