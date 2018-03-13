package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(WebDriver wd) {
		super(wd);
	}

	public void goToGroupPage() {
		if (isElementPresent(By.tagName("h1")) && wd.findElement(By.tagName("h1")).equals("Groups")
				&& isElementPresent(By.tagName("new"))) {
			return; // exit from current method
		}
		click(By.linkText("groups"));
	}

	public void goToHomePage() {
		if (isElementPresent(By.id("maintable"))) {
			return; // exit from current method
		}
		wd.get("http://addressbook.local:8888/index.php");
	}


}
