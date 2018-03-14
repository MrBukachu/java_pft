package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
	WebDriver wd;

	private ContactHelper userHelper;
	private SessionHelper sessionHelper;
	private NavigationHelper navigationHelper;
	private GroupHelper groupHelper;
	private String browser;

	public ApplicationManager(String browser) {
		this.browser = browser;
	}


	public void init() {
//		System.setProperty("webdriver.gecko.driver", "/Users/denisnikiforov/code/java_pft/addressbook-web-tests/src/test/resources/webdrivers/geckodriver/macos/geckodriver");
//		System.setProperty("webdriver.chrome.driver", "/Users/denisnikiforov/code/java_pft/addressbook-web-tests/src/test/resources/webdrivers/chrome/macos/chromedriver");

		if (browser.equals(BrowserType.FIREFOX)) {
			wd = new FirefoxDriver();
		} else if (browser.equals(BrowserType.CHROME)) {
			wd = new ChromeDriver();
		} else if (browser.equals(BrowserType.SAFARI)) {
			wd = new SafariDriver();
		} else {
			System.out.printf("Incompitable Browser TYpe");
		}

		wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		wd.get("http://addressbook.local:8888/index.php");
		groupHelper = new GroupHelper(wd);
		navigationHelper = new NavigationHelper(wd);
		sessionHelper = new SessionHelper(wd);
		userHelper = new ContactHelper(wd);
		sessionHelper.login("admin", "secret");
	}


	public void stop() {
		wd.quit();
	}

	public GroupHelper getGroupHelper() {
		return groupHelper;
	}

	public NavigationHelper getNavigationHelper() {
		return navigationHelper;
	}

	public ContactHelper getUserHelper() {
		return userHelper;
	}
}
