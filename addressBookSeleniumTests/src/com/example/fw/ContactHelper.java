package com.example.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.ContactData;
import com.example.tests.TestBase;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void addNewContact() {
		click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contact) {
		type(By.name("firstname"), contact.firstName);
		type(By.name("lastname"), contact.lastName);
		type(By.name("address"), contact.address);
		type(By.name("home"), contact.homePhoneNum);
		type(By.name("mobile"), contact.mobilePhoneNum);
		type(By.name("work"), contact.workPhoneNum);
		type(By.name("email"), contact.firstEmail);
		type(By.name("email2"), contact.secondEmail);	      
	    selectByText(By.name("bday"), contact.birthDay);
	    selectByText(By.name("bmonth"), contact.birthMonth);
	    type(By.name("byear"), contact.birthYear);
	    //selectByText(By.name("new_group"), contact.groupName);
	    type(By.name("address2"), contact.address2);
	    type(By.name("phone2"), contact.home);
	   	}

	private void selectByText(By locator, String text) {
		new Select(driver.findElement(locator)).selectByVisibleText(text);
	}

	public void submitNewContact() {
		click(By.name("submit"));
	}

	public void initGroupModification(int i) {
	//	click(By.xpath(//input))
		
	}

	public void submitGroupModification() {
		// TODO Auto-generated method stub
		
	}

}
