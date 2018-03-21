package ru.stqa.pft.addressbook.tests.groups;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

	protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

	@BeforeSuite
	public void setUp() throws Exception {
		app.init();
	}


	@AfterSuite(alwaysRun = true)
	public void tearDown() throws Exception {
		app.stop();
	}
//
//	@BeforeTest
//	public void setUp() throws Exception {
//		app.init();
//	}
//
//
//	@AfterTest(alwaysRun = true)
//	public void tearDown() throws Exception {
//		app.stop();
//	}

}
