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
	

	
	@When("user enters text {string} in search box and the submit")
	public void user_enters_text_in_search_box(String Text) {
		pages.safewaysearchPage().enterSearchInformation(Text);
	}


	@Then("user should see {string} search results on the page")
	public void user_should_see_search_result_is_on_the_page(String expectedInfo) {
        pages.safewaysearchresultpage().validate(expectedInfo);
	}

}