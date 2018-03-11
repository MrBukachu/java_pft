package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;


public class UserCreationTests extends TestBase {

	@Test
	public void testUntitledTestCase() throws Exception {
		app.initNewUser();
		app.fillUserForm(new UserData("fname", "mname", "lname", "nname",
				"title", "address", "home phone", "mobile_phone",
				"work email", "fax", "email", "email2", "emal3",
				"https://google.com", "25", "July", "1984", "12", "July",
				"1984","address 2", "phone 2", "notes"));
		app.submitUserCreation();
		app.returnToHomePage();
	}


}
