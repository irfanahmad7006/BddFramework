package testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/Uber.feature"},
        glue = {"stepdefinitions"},
        tags = "@Sanity or @Smoke or @Regression",
//        tags = "not @Regression",
//        tags = "@Sanity and @Smoke",
        plugin = {"pretty",
                "json: MyReports/report.json",
                "junit: MyReports/report.xml",
                "html: MyReports/report",
        },
        publish = true// for cloud reporting
//        ,monochrome = true //for console alignments just incase
        ,dryRun = false //just incase any stepdef is not created and give you which step def is missing
//        ,strict = true // if you want ignore
)
public class UberTest {
//mvn test -Dcucumber.filter.tags="@Smoke or @Regression" from cmd line
}
