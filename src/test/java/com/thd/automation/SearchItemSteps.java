package com.thd.automation;

import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchItemSteps extends SeleniumUtils{

    @Before
    public void setup()
    {
        Assert.assertTrue(setUP(), "Error: Unable to instantiate the chrome driver");
                       
    }
    
    @After
    public void cleanup()
    {
        Assert.assertTrue(cleanUP(), "Error: Unable to close the driver");
    }
    
    @Given("^I navigate to the Home Depot page$")
    public void navigateWebPage() throws Throwable {
        
        Assert.assertTrue(navigatePage(), "Error: Unable to navigate to home depot main page.");
    }

    @When("^i enter ([^\"]*) in the search box and click the search button$")
    public void searchItem(String arg1) throws Throwable {
        Assert.assertTrue(searchForItem(arg1), "Error: Unable to search for item");
    }

    @Then("^i should land on the ([^\"]*) landing page$")
    public void verifyLandingPage(String arg2) throws Throwable {
        Assert.assertTrue(validateLandingPage(arg2),"Error:Unable to validate landing page");
    }
}