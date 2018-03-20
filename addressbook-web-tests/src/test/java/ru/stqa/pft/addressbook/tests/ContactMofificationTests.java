package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactMofificationTests extends TestBase {

	@Test(enabled = false)
	public void testContactModification() throws Exception {

		if (!app.getUserHelper().isThereAContact()) {
			app.getUserHelper().createContact(new ContactData("fname", "test1", "mname", "lname", "nname", null,
					"title", "address", "123321", "3211232",
					"12312", "290348", "email@asda.com", "email2@asd.com", "emal3@ads.com",
					"https://google.com", "25", "July", "1984", "12", "July",
					"1984", "address 2", "123123", "notes"));
		}
		app.goTo().goToHomePage();
		List<ContactData> before = app.getUserHelper().getContactList();
		app.getUserHelper().initContactModification();
		app.getUserHelper().fillUserForm(new ContactData("fname123", "test1", "mname", "lname", "nname", null,
				"title", "address", "123321", "3211232",
				"12312", "290348", "email@asda.com", "email2@asd.com", "emal3@ads.com",
				"https://google.com", "25", "July", "1984", "12", "July",
				"1984", "address 2", "123121233", "notes"), false);
		app.getUserHelper().submitContactModification();
		app.goTo().goToHomePage();
		List<ContactData> after = app.getUserHelper().getContactList();
		Assert.assertEquals(after.size(), before.size());

		before.remove(before.size());
		Assert.assertEquals(before, after);
	}
}
