package pageObjects;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Util;

public class ResultDetailPage {

	private WebDriver driver;

	@FindBy(how = How.XPATH, using = "(//div[@class='product-card-container__image-container mt-3'])[1]")
	private WebElement firstItem;

	@FindBy(how = How.XPATH, using = "//div[@class='product-btn product-btn--without-ar full-loading']")
	private WebElement addButton;

	@FindBy(how = How.XPATH, using = "(//*[name()='svg'][@class='svg-icon svg-icon-Cart-red'])[1]")
	private WebElement cartButton;

	@FindBy(how = How.XPATH, using = "(//div[@class='btn product-btn__add'])")
	private WebElement addedItem;

	public ResultDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void clickDetail() {
		firstItem.click();
		
	}

	public void clickAddButton() {
		addButton.click();
	}

	public void clickCartButton() {
		cartButton.click();
	}

	public void validteItemList() {
		assertTrue(addedItem.isDisplayed(), "The item is added to the cart");
	}

}
