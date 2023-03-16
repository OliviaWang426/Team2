package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Util;

public class SafewaySearchPage {

	// Local Variable
	private WebDriver driver;
	private static final String URL = "https://www.safeway.com/";

	// Elements
	@FindBy(how = How.ID, using = "skip-main-content")
	private WebElement searchField;
	@FindBy(how = How.XPATH, using = "(//*[name()='path'])[9]")
	private WebElement searchButton;
	@FindBy(how = How.XPATH, using = "//h1[@class='search--title']")
	private WebElement searchResult;
	// Constructor
	public SafewaySearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void navigate() {
		driver.get(URL);
	}
	public void enterSearchInformation(String searchInformation) {
		searchField.sendKeys(searchInformation);
		searchField.submit();
		Util.wait(3);
	}

	public void clickSearchButton() {
		searchButton.click();
	}


}


