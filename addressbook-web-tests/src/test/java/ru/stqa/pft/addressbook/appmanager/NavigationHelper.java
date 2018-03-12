package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

	public NavigationHelper(WebDriver wd) {
		super(wd);
	}

	public void goToGroupPage() {
		click(By.linkText("groups"));
	}

	public void goToHomePage() {
		wd.get("http://addressbook.local:8888/index.php");
	}
}
