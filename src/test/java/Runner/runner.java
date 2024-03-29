package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
      // plugin={"html:target/cucumber-reports-smoke.html",
      //         "json:target/json-reports/cucumber.json",
      //         "junit:target/xml-report/cucumber.xml",
      // },
        plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        tags= "@endToEnd",
        dryRun = false
)

public class runner{

}