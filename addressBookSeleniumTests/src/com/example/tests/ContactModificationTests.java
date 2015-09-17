package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{
	
	@Test
	public void modifySomeContact(){
		app.getNavigationHelper().goToMainPage();
		app.getContactHelper().initGroupModification(1);
		ContactData contact = new ContactData();
		contact.firstName = "New Contact Name";
		app.getContactHelper().submitGroupModification();
		app.getNavigationHelper().goToMainPage();
		
		}

}
