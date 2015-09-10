package com.example.tests;

import org.openqa.selenium.By;

public class GroupData {
	public String groupName;
	public String header;
	public String footer;

	public GroupData() {
	}
	public GroupData(String groupName, String header, String footer) {
		this.groupName = groupName;
		this.header = header;
		this.footer = footer;
	}
	
}