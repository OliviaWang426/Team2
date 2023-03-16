package utilities;

import org.openqa.selenium.WebDriver;

import pageObjects.*;

public class PageManager {

	private static PageManager pageManager;
	private WebDriver driver;

	
	private SafewayLoginPage loginPage;
	private SafewayHomePage safewayhomepage;
	private SafewaySearchPage safewaysearchPage;
	private SafewaySearchResultPage safewaysearchresultpage;
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


	public SafewayLoginPage loginPage() {
		if (loginPage == null) {
			loginPage = new SafewayLoginPage(driver);
		}
		return loginPage;
	}
	public SafewaySearchPage safewaysearchPage() {
		if (safewaysearchPage== null) {
			safewaysearchPage = new SafewaySearchPage(driver);
		}
		return safewaysearchPage;
		}
	
	
		public Navbar navbar() {
			if (navbar == null) {
				navbar = new Navbar(driver);
			}
			return navbar;
		}
		public SafewayHomePage safewayhomepage() {
			if (safewayhomepage == null) {
				safewayhomepage= new SafewayHomePage(driver);
			}
			return safewayhomepage;
		}
		
		public CommonPage commonPage() {
			if (commonPage == null) {
				commonPage = new CommonPage(driver);
			}
			return commonPage;
		}

		public SafewaySearchResultPage safewaysearchresultpage() {
			if (safewaysearchresultpage == null) {
				safewaysearchresultpage = new  SafewaySearchResultPage(driver);
			}
			return safewaysearchresultpage;
		}

}


