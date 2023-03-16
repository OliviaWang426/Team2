package uiStepDefinitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverManager;
import utilities.PageManager;
import utilities.Util;

public class SafewaySearchSteps {
	private WebDriver driver = DriverManager.getInstance();
	private PageManager pages = PageManager.getInstance();
	

	
	@When("user enters text {string} in search box")
	public void user_enters_text_in_search_box(String Text) {
		pages.homePage().enterSearchInformation(Text);
	}


	@Then("user should see {string} search result is on the page")
	public void user_should_see_search_result_is_on_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}