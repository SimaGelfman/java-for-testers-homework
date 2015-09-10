package com.example.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.ContactData;
import com.example.tests.TestBase;

public class ContactHelper {

	public void addNewContact() {
		ApplicationManager.driver.findElement(By.linkText("add new")).click();
	}

	public void fillContactForm(ApplicationManager applicationManager, TestBase base, ContactData contact) {
		ApplicationManager.driver.findElement(By.name("firstname")).clear();
	    ApplicationManager.driver.findElement(By.name("firstname")).sendKeys(contact.firstName);
	    ApplicationManager.driver.findElement(By.name("lastname")).clear();
	    ApplicationManager.driver.findElement(By.name("lastname")).sendKeys(contact.lastName);
	    ApplicationManager.driver.findElement(By.name("address")).clear();
	    ApplicationManager.driver.findElement(By.name("address")).sendKeys(contact.address);
	    ApplicationManager.driver.findElement(By.name("home")).clear();
	    ApplicationManager.driver.findElement(By.name("home")).sendKeys(contact.homePhoneNum);
	    ApplicationManager.driver.findElement(By.name("mobile")).clear();
	    ApplicationManager.driver.findElement(By.name("mobile")).sendKeys(contact.mobilePhoneNum);
	    ApplicationManager.driver.findElement(By.name("work")).clear();
	    ApplicationManager.driver.findElement(By.name("work")).sendKeys(contact.workPhoneNum);
	    ApplicationManager.driver.findElement(By.name("email")).clear();
	    ApplicationManager.driver.findElement(By.name("email")).sendKeys(contact.firstEmail);
	    ApplicationManager.driver.findElement(By.name("email2")).clear();
	    ApplicationManager.driver.findElement(By.name("email2")).sendKeys(contact.secondEmail);
	    new Select(ApplicationManager.driver.findElement(By.name("bday"))).selectByVisibleText(contact.birthDay);
	    new Select(ApplicationManager.driver.findElement(By.name("bmonth"))).selectByVisibleText(contact.birthMonth);
	    ApplicationManager.driver.findElement(By.name("byear")).clear();
	    ApplicationManager.driver.findElement(By.name("byear")).sendKeys(contact.birthYear);
	    new Select(ApplicationManager.driver.findElement(By.name("new_group"))).selectByVisibleText(contact.groupName);
	    ApplicationManager.driver.findElement(By.name("address2")).clear();
	    ApplicationManager.driver.findElement(By.name("address2")).sendKeys(contact.address2);
	    ApplicationManager.driver.findElement(By.name("phone2")).clear();
	    ApplicationManager.driver.findElement(By.name("phone2")).sendKeys(contact.home);
	}

	public void submitNewContact() {
		ApplicationManager.driver.findElement(By.name("submit")).click();
	}

}
