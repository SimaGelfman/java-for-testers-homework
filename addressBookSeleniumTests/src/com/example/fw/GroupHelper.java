package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.GroupData;
import com.example.tests.TestBase;

public class GroupHelper extends HelperBase{

	public GroupHelper(ApplicationManager manager) {
		super(manager);
		
	}

	public void creationNewGroup() {
	    click(By.name("new"));
	}

	

	public void fillGroupForm(GroupData group) {
	    type(By.name("group_name"), group.groupName);
	    type(By.name("group_header"), group.header);
	    type(By.name("group_footer"), group.footer);
	}


	public void submitCreationNewGroup() {
	    click(By.name("submit"));
	}

	public void returnToGroupsPage() {
	    click(By.linkText("group page"));
	}

	public void deleteGroup(int index) {
		selectGroupByIndex(index); 
		click(By.name("delete"));
	}

	private void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name = 'selected[]'][" + index + "]"));
	}

	public void initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));		
	}

	public void submitGroupModification() {
		click(By.name("update"));		
	}

}
