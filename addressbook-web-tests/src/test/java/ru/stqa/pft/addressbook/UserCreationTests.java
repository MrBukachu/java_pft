package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

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
		app.wd.get("http://addressbook.local:8888/index.php");
	}

	private void submitUserCreation() {
		app.wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
	}

	private void fillUserForm(UserData userData) {
		app.wd.findElement(By.name("firstname")).click();
		app.wd.findElement(By.name("firstname")).clear();
		app.wd.findElement(By.name("firstname")).sendKeys(userData.getFirstname());
		app.wd.findElement(By.name("middlename")).click();
		app.wd.findElement(By.name("middlename")).clear();
		app.wd.findElement(By.name("middlename")).sendKeys(userData.getMiddlename());
		app.wd.findElement(By.name("lastname")).click();
		app.wd.findElement(By.name("lastname")).clear();
		app.wd.findElement(By.name("lastname")).sendKeys(userData.getLastname());
		app.wd.findElement(By.name("nickname")).click();
		app.wd.findElement(By.name("nickname")).clear();
		app.wd.findElement(By.name("nickname")).sendKeys(userData.getNickname());
		app.wd.findElement(By.name("title")).click();
		app.wd.findElement(By.name("title")).clear();
		app.wd.findElement(By.name("title")).sendKeys(userData.getTitle());
		app.wd.findElement(By.name("address")).click();
		app.wd.findElement(By.name("address")).clear();
		app.wd.findElement(By.name("address")).sendKeys(userData.getAddress());
		app.wd.findElement(By.name("home")).click();
		app.wd.findElement(By.name("home")).clear();
		app.wd.findElement(By.name("home")).sendKeys(userData.getHome_phone());
		app.wd.findElement(By.name("mobile")).clear();
		app.wd.findElement(By.name("mobile")).sendKeys(userData.getMobile_phone());
		app.wd.findElement(By.name("work")).click();
		app.wd.findElement(By.name("work")).clear();
		app.wd.findElement(By.name("work")).sendKeys(userData.getWork_phone());
		app.wd.findElement(By.name("fax")).click();
		app.wd.findElement(By.name("fax")).clear();
		app.wd.findElement(By.name("fax")).sendKeys(userData.getFax());
		app.wd.findElement(By.name("email")).click();
		app.wd.findElement(By.name("email")).click();
		app.wd.findElement(By.name("email")).clear();
		app.wd.findElement(By.name("email")).sendKeys(userData.getEmail());
		app.wd.findElement(By.name("email2")).click();
		app.wd.findElement(By.name("email2")).clear();
		app.wd.findElement(By.name("email2")).sendKeys(userData.getEmail2());
		app.wd.findElement(By.name("email3")).clear();
		app.wd.findElement(By.name("email3")).sendKeys(userData.getEmail3());
		app.wd.findElement(By.name("homepage")).clear();
		app.wd.findElement(By.name("homepage")).sendKeys(userData.getHomepage());
		app.wd.findElement(By.name("bday")).click();
		new Select(app.wd.findElement(By.name("bday"))).selectByVisibleText(userData.getBday());
		app.wd.findElement(By.xpath("//option[@value='25']")).click();
		app.wd.findElement(By.name("bmonth")).click();
		new Select(app.wd.findElement(By.name("bmonth"))).selectByVisibleText(userData.getBmonth());
		app.wd.findElement(By.xpath("//option[@value='July']")).click();
		app.wd.findElement(By.name("byear")).click();
		app.wd.findElement(By.name("byear")).clear();
		app.wd.findElement(By.name("byear")).sendKeys(userData.getByear());
		app.wd.findElement(By.name("aday")).click();
		new Select(app.wd.findElement(By.name("aday"))).selectByVisibleText(userData.getAday());
		app.wd.findElement(By.xpath("(//option[@value='11'])[2]")).click();
		app.wd.findElement(By.name("amonth")).click();
		new Select(app.wd.findElement(By.name("amonth"))).selectByVisibleText(userData.getAmonth());
		app.wd.findElement(By.xpath("(//option[@value='October'])[2]")).click();
		app.wd.findElement(By.name("ayear")).click();
		app.wd.findElement(By.name("ayear")).clear();
		app.wd.findElement(By.name("ayear")).sendKeys(userData.getAyar());
		app.wd.findElement(By.name("new_group")).click();
		app.wd.findElement(By.xpath("//option[@value='[none]']")).click();
		app.wd.findElement(By.name("address2")).click();
		app.wd.findElement(By.name("address2")).clear();
		app.wd.findElement(By.name("address2")).sendKeys(userData.getAddress2());
		app.wd.findElement(By.name("phone2")).click();
		app.wd.findElement(By.name("phone2")).clear();
		app.wd.findElement(By.name("phone2")).sendKeys(userData.getPhone2());
		app.wd.findElement(By.name("notes")).click();
		app.wd.findElement(By.name("notes")).clear();
		app.wd.findElement(By.name("notes")).sendKeys(userData.getNotes());
	}

	private void initNewUser() {
		app.wd.findElement(By.linkText("add new")).click();
		app.wd.findElement(By.xpath("(//input[@name='quickadd'])[2]")).click();
	}

}
