package uiStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import utilities.DriverManager;
import utilities.PageManager;
import utilities.Util;

public class SearchDetailSteps {
	private WebDriver driver = DriverManager.getInstance();
	private PageManager pages = PageManager.getInstance();

	@Then("click on the product to view its details")
	public void click_on_the_product_to_view_its_details() {
		pages.resultDetailPage().clickDetail();
		Util.wait(3);

	}

	@Then("click on the Add to Cart button")
	public void click_on_the_add_to_cart_button() {
		pages.resultDetailPage().clickAddButton();
		Util.wait(3);
		pages.resultDetailPage().clickCartButton();
		Util.wait(3);
	}

	@Then("go to the cart page to verify that the product is listed in the cart")
	public void go_to_the_cart_page_to_verify_that_the_product_is_listed_in_the_cart() {
		pages.resultDetailPage().validteItemList();
		Util.wait(3);
	}
}
