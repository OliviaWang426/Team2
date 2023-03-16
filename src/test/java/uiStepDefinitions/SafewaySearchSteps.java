package uiStepDefinitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverManager;

public class SafewaySearchSteps {
	private WebDriver driver = DriverManager.getInstance();
	private String searchTerm;

	
	
	
	@When("user search for some items")
	public void user_search_for_some_items() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should see some search results")
	public void user_should_see_some_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

