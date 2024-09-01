package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"stepDefinitions"},
        tags = "@SmokeTest",
        publish = true,
        plugin = {"html:src/reports/HTML_report.html",
                "json:src/reports/JSON_report.json",
                "junit:src/reports/XML_Report.xml"
        }
)

public class TestRunner {

}
