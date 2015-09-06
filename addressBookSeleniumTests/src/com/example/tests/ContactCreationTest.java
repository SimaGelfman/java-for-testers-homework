package com.example.tests;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
 

  @Test
  public void testNotEmtyContactCreation() throws Exception {
	goToMainPage();
	addNewContact();
	ContactData contact = new ContactData( );
	contact.firstName = "Anya";
	contact.lastName = "Durov";
	contact.address = "Moscow,lenina 12";
	contact.homePhoneNum = "495 386 12 46";
	contact.mobilePhoneNum = "+79131177777";
	contact.workPhoneNum = "+74951188888";
	contact.firstEmail = "AnyaDurov@gmail.com";
	contact.secondEmail = "AnyaDurov@gmail.com";
	contact.birthDay = "19";
	contact.birthMonth = "April";
	contact.birthYear =  "1986";
	contact.groupName = "group name1";
	contact.address2 = "Moscoq";
	contact.home = "Trom";	
	fillContactForm(contact);
	submitNewContact();
  }

  @Test
  public void testEmtyContactCreation() throws Exception {
	goToMainPage();
	addNewContact();
	ContactData contact = new ContactData("","", "", "-", "","", "", "", "-", "-", "", "", "", "");
	fillContactForm(contact);
	submitNewContact();
  }
}
