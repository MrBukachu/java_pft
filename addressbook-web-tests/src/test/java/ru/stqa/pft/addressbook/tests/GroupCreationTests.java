package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

	@Test
	public void test_group_creation() throws Exception {
		app.getNavigationHelper().goToGroupPage();
		app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
		app.getGroupHelper().submitGroupCreation();
		app.getNavigationHelper().goToGroupPage();
	}

}
