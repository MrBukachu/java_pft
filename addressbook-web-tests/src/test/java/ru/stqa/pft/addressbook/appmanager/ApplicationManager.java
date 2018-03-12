package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
	FirefoxDriver wd;

	private UserHelper userHelper;
	private SessionHelper sessionHelper;
	private NavigationHelper navigationHelper;
	private GroupHelper groupHelper;


	public void init() {
		System.setProperty("webdriver.gecko.driver", "/Users/denisnikiforov/code/java_pft/addressbook-web-tests/src/test/resources/webdrivers/geckodriver/macos/geckodriver");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.get("http://addressbook.local:8888/index.php");
		groupHelper = new GroupHelper(wd);
		navigationHelper = new NavigationHelper(wd);
		sessionHelper = new SessionHelper(wd);
		userHelper = new UserHelper(wd);
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

	public UserHelper getUserHelper() {
		return userHelper;
	}
}
