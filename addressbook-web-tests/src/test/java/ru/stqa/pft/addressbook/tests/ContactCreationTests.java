package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;


public class ContactCreationTests extends TestBase {

	@Test(enabled = false)
	public void testContactCreation() throws Exception {
		List<ContactData> before = app.getUserHelper().getContactList();
		app.getUserHelper().initContactCreation();
		app.getUserHelper().fillUserForm(new ContactData("fname", "test1", "mname", "lname", "nname",
				null,
				"title", "address", "123321", "3211232",
				"12312", "290348", "email@asda.com", "email2@asd.com", "emal3@ads.com",
				"https://google.com", "25", "July", "1984", "12", "July",
				"1984", "address 2", "123123", "notes"), true);
		app.getUserHelper().submitContactCreation();
		app.goTo().goToHomePage();
		List<ContactData> after = app.getUserHelper().getContactList();
		Assert.assertEquals(after.size(), before.size() + 1);

		before.remove(before.size() + 1);
		Assert.assertEquals(before, after);
	}
}
