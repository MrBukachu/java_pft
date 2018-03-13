package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(WebDriver wd) {
		super(wd);
	}

	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void submitContactModification() {
		click(By.name("update"));
	}

	public void fillUserForm(ContactData contactData, Boolean creation) {
		type(By.name("firstname"), contactData.getFirstname());
		type(By.name("middlename"), contactData.getMiddlename());
		type(By.name("lastname"), contactData.getLastname());
		type(By.name("nickname"), contactData.getNickname());

		// todo
		//		type(By.name("photo"), contactData.getPhoto());// doesn'' work in firefox

		type(By.name("title"), contactData.getTitle());
		type(By.name("address"), contactData.getAddress());
		type(By.name("home"), contactData.getHome_phone());
		type(By.name("mobile"), contactData.getMobile_phone());
		type(By.name("work"), contactData.getWork_phone());
		type(By.name("fax"), contactData.getFax());
		type(By.name("email"), contactData.getEmail());
		type(By.name("email2"), contactData.getEmail2());
		type(By.name("email3"), contactData.getEmail3());
		type(By.name("homepage"), contactData.getHomepage());
		new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getBday());
		click(By.xpath("//option[@value='25']"));
		click(By.name("bmonth"));
		new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getBmonth());
		click(By.xpath("//option[@value='July']"));
		type(By.name("byear"), contactData.getByear());
		click(By.name("aday"));
		new Select(wd.findElement(By.name("aday"))).selectByVisibleText(contactData.getAday());
		click(By.xpath("(//option[@value='11'])[2]"));
		click(By.name("amonth"));
		new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(contactData.getAmonth());
		click(By.xpath("(//option[@value='October'])[2]"));
		click(By.name("ayear"));
		type(By.name("ayear"), contactData.getAyar());
		if (creation) {
			new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
		} else {
			Assert.assertFalse(isElementPresent(By.name("new_group")));
		}
		type(By.name("address2"), contactData.getAddress2());
		type(By.name("phone2"), contactData.getPhone2());
		type(By.name("notes"), contactData.getNotes());
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
		click(By.xpath("//input[@name='quickadd']"));
	}

	public void initContactModification() {

		click(By.xpath("//td[8]/a/img"));
	}

	public void selectUser() {
		click(By.xpath("//table[@id='maintable']//tr[@name='entry']//input[@type='checkbox']"));
	}
}
