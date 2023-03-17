package pageObjects;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResultDetailPage {

	private WebDriver driver;

	@FindBy(how = How.XPATH, using = "((//img[@class='ab-lazy product-card-container__product-image loaded'])[1]")
	private WebElement firstItem;

	@FindBy(how = How.XPATH, using = "//div[@class='quantity-stepper-container']")
	private WebElement addButton;

	@FindBy(how = How.XPATH, using = "//span[@class='menu-nav__cart button__item']")
	private WebElement cartButton;

	@FindBy(how = How.XPATH, using = "//div[@class='mktp-cart-product-card cart-dst-product-card cart-dst-no-x-axis-padding']]")
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
