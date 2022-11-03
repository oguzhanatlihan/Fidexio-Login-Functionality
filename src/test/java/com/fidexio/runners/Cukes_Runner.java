package com.fidexio.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
//                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "html:target/cucumber-report.html"

        },
        features = "src/test/resources/features",
        glue = "com/fidexio/step_definitions",
        dryRun = false,
        tags = "logout"

)
public class Cukes_Runner {

}
