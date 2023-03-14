package utilities;

import org.openqa.selenium.WebDriver;

import pageObjects.*;

public class PageManager {

	private static PageManager pageManager;
	private WebDriver driver;

	
	private LoginPage loginPage;
	private HomePage homePage;
	private Navbar navbar;
	private CommonPage commonPage;
	private PageManager(WebDriver driver) {
		this.driver = driver;
	}

	public static PageManager getInstance() {
		if (pageManager == null) {
			pageManager = new PageManager(DriverManager.getInstance());
		}
		return pageManager;
	}

	public static void cleanup() {
		if (pageManager != null) {
			pageManager = null;
		}
	}


	public LoginPage loginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage(driver);
		}
		return loginPage;
	}


	public HomePage homePage() {
		if (homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
		
	}
		public Navbar navbar() {
			if (navbar == null) {
				navbar = new Navbar(driver);
			}
			return navbar;
		}
		
		public CommonPage commonPage() {
			if (commonPage == null) {
				commonPage = new CommonPage(driver);
			}
			return commonPage;
		}

}


