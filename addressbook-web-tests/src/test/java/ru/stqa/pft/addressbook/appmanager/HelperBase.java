package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class HelperBase {
	protected WebDriver wd;

	public HelperBase(WebDriver wd) {
		this.wd = wd;
	}

	protected void click(By locator) {
		wd.findElement(locator).click();
	}

	protected void type(By locator, String text) {
		click(locator);
		wd.findElement(locator).clear();
		wd.findElement(locator).sendKeys(text);

	}

	protected void select(WebElement element){
		new  Select(element);

	}


	public boolean isAlertPresent() {
		try {
			wd.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	protected boolean isElementPresent(By locator) {
		try{
			wd.findElement(locator);
			return true;
		}catch (NoSuchElementException e){
			return false;
		}

	}
}
