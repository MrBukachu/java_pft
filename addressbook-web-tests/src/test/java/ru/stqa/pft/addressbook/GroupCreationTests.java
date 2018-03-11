package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupCreationTests {
	FirefoxDriver wd;

//  private WebDriver wd;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/denisnikiforov/code/java_pft/addressbook-web-tests/src/test/resources/webdrivers/geckodriver/macos/geckodriver");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		wd.get("http://addressbook.local:8888/index.php");
		login("admin", "secret");

	}

	private void login(String username, String password) {
		wd.findElement(By.name("user")).click();
		wd.findElement(By.name("user")).clear();
		wd.findElement(By.name("user")).sendKeys(username);
		wd.findElement(By.name("pass")).click();
		wd.findElement(By.name("pass")).clear();
		wd.findElement(By.name("pass")).sendKeys(password);
		wd.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Test
	public void test_group_creation() throws Exception {
		GoToGroupPage();
		initGroupCreation();
		fillGroupForm(new GroupData("test1", "test2", "footer"));
		submitGroupCreation();
		returnToGroupPage();
	}

	private void returnToGroupPage() {
		wd.findElement(By.linkText("group page")).click();
	}

	private void submitGroupCreation() {
		wd.findElement(By.name("submit")).click();
	}

	private void fillGroupForm(GroupData groupData) {
		wd.findElement(By.name("group_name")).click();
		wd.findElement(By.name("group_name")).clear();
		wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
		wd.findElement(By.name("group_header")).clear();
		wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
		wd.findElement(By.name("group_footer")).clear();
		wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
	}

	private void initGroupCreation() {
		wd.findElement(By.name("new")).click();
	}

	private void GoToGroupPage() {
		wd.findElement(By.linkText("groups")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		wd.quit();
	}

	public static boolean isAlertPresent(FirefoxDriver wd) {
		try {
			wd.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

}
