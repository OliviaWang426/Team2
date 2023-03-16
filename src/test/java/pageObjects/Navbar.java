package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Navbar {
	

	// Local Variable
	private WebDriver driver;

	// Elements
	@FindBy(how = How.XPATH, using = "//span[@class='button__item menu-nav__profile-button-sign-in-up d-none d-lg-inline-block dst-sign-in-up']")
	private WebElement loginLink;
	@FindBy(how = How.ID, using = "sign-in-modal-link")
	private WebElement SigninLink;
	@FindBy(how = How.ID, using = "skip-main-content")
	private WebElement SearchLink;
	@FindBy(how = How.XPATH, using = "//a[@href='/posts']")
	private WebElement postsLink;

	// Constructor
	public Navbar(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void navigateToPostPage() {
		postsLink.click();
	}

	public void navigateToLoginPage() {
		loginLink.click();
		
	}

	public void navigateToSignInPage() {
		SigninLink.click();
	}
	
	public void navigateToSearchPage() {
		SearchLink.click();
	}
}




