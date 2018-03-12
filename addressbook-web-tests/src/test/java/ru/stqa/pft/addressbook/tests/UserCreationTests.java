package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;


public class UserCreationTests extends TestBase {

	@Test
	public void testUserCreation() throws Exception {
		app.getUserHelper().initNewUser();
		app.getUserHelper().fillUserForm(new UserData("fname", "mname", "lname", "nname",
				"title", "address", "123321", "3211232",
				"12312", "290348", "email@asda.com", "email2@asd.com", "emal3@ads.com",
				"https://google.com", "25", "July", "1984", "12", "July",
				"1984","address 2", "123123", "notes"));
		app.getUserHelper().submitUserCreation();
		app.getNavigationHelper().goToHomePage();
	}


}
