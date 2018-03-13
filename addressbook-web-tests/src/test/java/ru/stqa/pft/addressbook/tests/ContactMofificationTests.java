package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactMofificationTests extends TestBase {
	@Test
	public void testUserModification() throws Exception {
		app.getUserHelper().initContactModification();
		app.getUserHelper().fillUserForm(new ContactData("fname", null, "mname", "lname", "nname", null,
				"title", "address", "123321", "3211232",
				"12312", "290348", "email@asda.com", "email2@asd.com", "emal3@ads.com",
				"https://google.com", "25", "July", "1984", "12", "July",
				"1984", "address 2", "123123", "notes"), false);
		app.getUserHelper().submitContactModification();
		app.getNavigationHelper().goToHomePage();
	}
}