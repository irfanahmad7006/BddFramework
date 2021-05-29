package testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/Registration.feature"},
        glue = {"stepdefinitions"},
        plugin = {"pretty",
                "junit: MyReports/report.xml",
                "json: MyReports/report.json",
                "html: MyReports/report"
        },
        publish = true
)
public class UserRegristrationTest {
}
