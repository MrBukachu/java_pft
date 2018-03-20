package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

	public ContactHelper(WebDriver wd) {
		super(wd);
	}

	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void submitContactModification() {
		click(By.xpath("//input[@value='Update']"));
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
	}

	public void initContactModification() {

		click(By.xpath("//td[8]/a/img"));
	}

	public void selectContact() {
		click(By.xpath("//table[@id='maintable']//tr[@name='entry']//input[@type='checkbox']"));
	}

	public void createContact(ContactData data) {
		initContactCreation();
		fillUserForm(data, true);
		submitContactCreation();
	}

	public boolean isThereAContact() {
		return isElementPresent(By.xpath("//td[8]/a/img"));
	}

	public void deleteSelectedContact() {
		click(By.xpath("//*[@id=\"content\"]//div[2]/input"));
		isAlertPresent();

		WebDriverWait wait = new WebDriverWait(wd, 3000);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = wd.switchTo().alert();
		alert.accept();

	}

	public int getContactCount() {
		return wd.findElements(By.xpath("//td[8]/a/img")).size();
	}

	public List<ContactData> getContactList() {
		List<ContactData> contacts = new ArrayList<ContactData>();
		List<WebElement> elements = wd.findElements(By.xpath("//table[@id='maintable']//tr[@name='entry']/td[3]"));
		for (WebElement element : elements) {
			String fname = element.getText();
			ContactData contact = new ContactData(fname, null, null, null, null,
					null,
					null, null, null, null, null, null, null,
					null, null, null, null, null, null, null, null, null
					, null, null, null);
			contacts.add(contact);
		}
		return contacts;
	}
}
