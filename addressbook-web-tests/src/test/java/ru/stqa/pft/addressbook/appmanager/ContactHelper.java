package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData;

public class UserHelper extends HelperBase{

	public UserHelper(WebDriver wd) {
		super(wd);
	}

	public void submitUserCreation() {
		click(By.xpath("(//input[@name='submit'])[2]"));
	}

	public void fillUserForm(ContactData userData) {
		type(By.name("firstname"), userData.getFirstname());
		type(By.name("middlename"), userData.getMiddlename());
		type(By.name("lastname"), userData.getLastname());
		type(By.name("nickname"), userData.getNickname());
		type(By.name("photo"), userData.getPhoto());
		type(By.name("title"), userData.getTitle());
		type(By.name("address"), userData.getAddress());
		type(By.name("home"), userData.getHome_phone());
		type(By.name("mobile"), userData.getMobile_phone());
		type(By.name("work"), userData.getWork_phone());
		type(By.name("fax"), userData.getFax());
		type(By.name("email"), userData.getEmail());
		type(By.name("email2"), userData.getEmail2());
		type(By.name("email3"), userData.getEmail3());
		type(By.name("homepage"), userData.getHomepage());
		new Select(wd.findElement(By.name("bday"))).selectByVisibleText(userData.getBday());
		click(By.xpath("//option[@value='25']"));
		click(By.name("bmonth"));
		new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(userData.getBmonth());
		click(By.xpath("//option[@value='July']"));
		type(By.name("byear"), userData.getByear());
		click(By.name("aday"));
		new Select(wd.findElement(By.name("aday"))).selectByVisibleText(userData.getAday());
		click(By.xpath("(//option[@value='11'])[2]"));
		click(By.name("amonth"));
		new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(userData.getAmonth());
		click(By.xpath("(//option[@value='October'])[2]"));
		click(By.name("ayear"));
		type(By.name("ayear"), userData.getAyar());
		click(By.name("new_group"));
		click(By.xpath("//option[@value='[none]']"));
		type(By.name("address2"), userData.getAddress2());
		type(By.name("phone2"), userData.getPhone2());
		type(By.name("notes"), userData.getNotes());
	}

	public void initNewUser() {
		click(By.linkText("add new"));
		click(By.xpath("(//input[@name='quickadd'])[2]"));
	}

	public void selectUser() {
		click(By.xpath("//table[@id='maintable']//tr[@name='entry']//input[@type='checkbox']"));
	}
}
