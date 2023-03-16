package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SafewayHomePage {
	// Local Variable
	private WebDriver driver;
	private static final String URL = "https://www.safeway.com/";

	// Elements

	// Constructor
	public SafewayHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void navigate() {
		driver.get(URL);
	}

}

