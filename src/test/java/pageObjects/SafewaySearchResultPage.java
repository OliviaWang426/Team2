package pageObjects;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SafewaySearchResultPage {
	
	// Local Variable
		private WebDriver driver;
//		Elements
	@FindBy(how= How.XPATH,using="//h1[@class='search--title']")
	private WebElement searchResult;

	// Constructor ?
	public SafewaySearchResultPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void validate(String expectedInfo) {
		assertTrue(searchResult.getText().contains(expectedInfo), "the serch information is not contains");
	}

}

		
	


