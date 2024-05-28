package com.enuygun.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        publish = true,
        glue = "com/enuygun/definitions"
)
public class CucumberRunner {
}