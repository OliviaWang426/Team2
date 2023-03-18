package pageObjects;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Util;

public class ResultDetailPage {

	private WebDriver driver;
	
	

	
	
//	@FindBy(how = How.XPATH, using = "((//img[@class='ab-lazy product-card-container__product-image loaded'])[1]")
//	private WebElement firstItem;
//	
	
	@FindBy(how = How.XPATH, using = "//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")
	private WebElement closeCookies;
	
	@FindBy(how = How.ID, using = "pg136010121")
	private WebElement firstItem;

	@FindBy(how = How.XPATH, using = "//div[@class='quantity-stepper-container']")
	private WebElement addButton;

	@FindBy(how = How.XPATH, using = "//span[@class='menu-nav__cart button__item']")
	private WebElement cartButton;

	@FindBy(how = How.XPATH, using = "//span[@class='menu-nav__cart button__item']")
	private WebElement addedItem;

	public ResultDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void clickDetail() {
//		JavascriptExecutor j = (JavascriptExecutor)driver;
//		j.executeScript("window.scrollBy(0,500)");
		closeCookies.click();
		Util.wait(1);
		firstItem.click();
	}

	public void clickAddButton() {
		addButton.click();
	}

	public void clickCartButton() {
		cartButton.click();
	}

	public void validteItemList() {
		Util.wait(2);
		assertTrue(addedItem.isDisplayed(), "The item is not added to the cart");
	}

}
