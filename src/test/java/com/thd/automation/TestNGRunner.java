package com.thd.automation;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    plugin={"pretty"},
    glue={"com.thd.automation"},
    features={"src/test/resources"}
    )
public class TestNGRunner extends AbstractTestNGCucumberTests
{
    
}
