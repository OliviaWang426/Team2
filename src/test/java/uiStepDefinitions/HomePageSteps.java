package uiStepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.PageManager;
import utilities.Util;

public class HomePageSteps {

	private PageManager pages = PageManager.getInstance();

	@Then("user is on the safeway practice site homepage")
	public void navigateToHomePage() {
		pages.homePage().navigate();
	}

	@When("user navigates to the login page")
	public void navigateToLoginPage() {
		pages.navbar().navigateToLoginPage();
	}
	
	@When("user click sign in button")
	public void user_click_sign_in_button() {
	    pages.navbar().navigateToSignInPage();
	    Util.wait(3);
	}

	@When("user navigates to the posts page")
	public void navigateToPostsPage() {
		pages.navbar().navigateToPostPage();
		Util.wait(5);
}
}
