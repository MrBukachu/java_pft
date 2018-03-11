package ru.stqa.pft.addressbook;


import org.testng.annotations.*;


public class GroupCreationTests extends TestBase {

	@Test
	public void test_group_creation() throws Exception {
		goToGroupPage();
		initGroupCreation();
		fillGroupForm(new GroupData("test1", "test2", "footer"));
		submitGroupCreation();
		goToGroupPage();
	}

}
