package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

	@Test
	public void test_group_creation() throws Exception {
		app.goToGroupPage();
		app.initGroupCreation();
		app.fillGroupForm(new GroupData("test1", "test2", "footer"));
		app.submitGroupCreation();
		app.goToGroupPage();
	}

}
