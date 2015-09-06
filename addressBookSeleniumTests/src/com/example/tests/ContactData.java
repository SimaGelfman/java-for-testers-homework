package com.example.tests;

public class ContactData {
	public String firstName;
	public String lastName;
	public String address;
	public String homePhoneNum;
	public String mobilePhoneNum;
	public String workPhoneNum;
	public String firstEmail;
	public String secondEmail;
	public String birthDay;
	public String birthMonth;
	public String birthYear;
	public String groupName;
	public String address2;
	public String home;
	
	public ContactData() {
		
	}

	public ContactData(String firstName, String lastName, String address,
			String homePhoneNum, String mobilePhoneNum, String workPhoneNum,
			String firstEmail, String secondEmail, String birthDay,
			String birthMonth, String birthYear, String groupName,
			String address2, String home) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.homePhoneNum = homePhoneNum;
		this.mobilePhoneNum = mobilePhoneNum;
		this.workPhoneNum = workPhoneNum;
		this.firstEmail = firstEmail;
		this.secondEmail = secondEmail;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.groupName = groupName;
		this.address2 = address2;
		this.home = home;
	}
}