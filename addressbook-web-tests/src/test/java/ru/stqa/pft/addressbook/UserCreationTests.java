package ru.stqa.pft.addressbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;


public class UserCreationTests extends TestBase {

	@Test
	public void testUntitledTestCase() throws Exception {
		initNewUser();
		fillUserForm(new UserData("test1", "test2", "test3", "test4", "test5", "test7", "912987346", "9187364", "2345235", "2345325", "test@dsfs.com", "asdad@asd.com", "asldjaos@asodk.com", "https://google.com", "25", "July", "1984", "11", "October", "2018", "Norilsk", "home Norilsk", "notes test"));
		submitUserCreation();
		returnToHomePage();
	}

	private void returnToHomePage() {
		wd.get("http://addressbook.local:8888/index.php");
	}

	private void submitUserCreation() {
		wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
	}

	private void fillUserForm(UserData userData) {
		wd.findElement(By.name("firstname")).click();
		wd.findElement(By.name("firstname")).clear();
		wd.findElement(By.name("firstname")).sendKeys(userData.getFirstname());
		wd.findElement(By.name("middlename")).click();
		wd.findElement(By.name("middlename")).clear();
		wd.findElement(By.name("middlename")).sendKeys(userData.getMiddlename());
		wd.findElement(By.name("lastname")).click();
		wd.findElement(By.name("lastname")).clear();
		wd.findElement(By.name("lastname")).sendKeys(userData.getLastname());
		wd.findElement(By.name("nickname")).click();
		wd.findElement(By.name("nickname")).clear();
		wd.findElement(By.name("nickname")).sendKeys(userData.getNickname());
		wd.findElement(By.name("title")).click();
		wd.findElement(By.name("title")).clear();
		wd.findElement(By.name("title")).sendKeys(userData.getTitle());
		wd.findElement(By.name("address")).click();
		wd.findElement(By.name("address")).clear();
		wd.findElement(By.name("address")).sendKeys(userData.getAddress());
		wd.findElement(By.name("home")).click();
		wd.findElement(By.name("home")).clear();
		wd.findElement(By.name("home")).sendKeys(userData.getHome_phone());
		wd.findElement(By.name("mobile")).clear();
		wd.findElement(By.name("mobile")).sendKeys(userData.getMobile_phone());
		wd.findElement(By.name("work")).click();
		wd.findElement(By.name("work")).clear();
		wd.findElement(By.name("work")).sendKeys(userData.getWork_phone());
		wd.findElement(By.name("fax")).click();
		wd.findElement(By.name("fax")).clear();
		wd.findElement(By.name("fax")).sendKeys(userData.getFax());
		wd.findElement(By.name("email")).click();
		wd.findElement(By.name("email")).click();
		wd.findElement(By.name("email")).clear();
		wd.findElement(By.name("email")).sendKeys(userData.getEmail());
		wd.findElement(By.name("email2")).click();
		wd.findElement(By.name("email2")).clear();
		wd.findElement(By.name("email2")).sendKeys(userData.getEmail2());
		wd.findElement(By.name("email3")).clear();
		wd.findElement(By.name("email3")).sendKeys(userData.getEmail3());
		wd.findElement(By.name("homepage")).clear();
		wd.findElement(By.name("homepage")).sendKeys(userData.getHomepage());
		wd.findElement(By.name("bday")).click();
		new Select(wd.findElement(By.name("bday"))).selectByVisibleText(userData.getBday());
		wd.findElement(By.xpath("//option[@value='25']")).click();
		wd.findElement(By.name("bmonth")).click();
		new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(userData.getBmonth());
		wd.findElement(By.xpath("//option[@value='July']")).click();
		wd.findElement(By.name("byear")).click();
		wd.findElement(By.name("byear")).clear();
		wd.findElement(By.name("byear")).sendKeys(userData.getByear());
		wd.findElement(By.name("aday")).click();
		new Select(wd.findElement(By.name("aday"))).selectByVisibleText(userData.getAday());
		wd.findElement(By.xpath("(//option[@value='11'])[2]")).click();
		wd.findElement(By.name("amonth")).click();
		new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(userData.getAmonth());
		wd.findElement(By.xpath("(//option[@value='October'])[2]")).click();
		wd.findElement(By.name("ayear")).click();
		wd.findElement(By.name("ayear")).clear();
		wd.findElement(By.name("ayear")).sendKeys(userData.getAyar());
		wd.findElement(By.name("new_group")).click();
		wd.findElement(By.xpath("//option[@value='[none]']")).click();
		wd.findElement(By.name("address2")).click();
		wd.findElement(By.name("address2")).clear();
		wd.findElement(By.name("address2")).sendKeys(userData.getAddress2());
		wd.findElement(By.name("phone2")).click();
		wd.findElement(By.name("phone2")).clear();
		wd.findElement(By.name("phone2")).sendKeys(userData.getPhone2());
		wd.findElement(By.name("notes")).click();
		wd.findElement(By.name("notes")).clear();
		wd.findElement(By.name("notes")).sendKeys(userData.getNotes());
	}

	private void initNewUser() {
		wd.findElement(By.linkText("add new")).click();
		wd.findElement(By.xpath("(//input[@name='quickadd'])[2]")).click();
	}

}
