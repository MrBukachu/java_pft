package ru.stqa.pft.addressbook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	protected final ApplicationManager app = new ApplicationManager();

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws Exception {
		app.init();

	}


	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		app.stop();
	}

}
