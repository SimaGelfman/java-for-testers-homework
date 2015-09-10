package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.GroupData;
import com.example.tests.TestBase;

public class GroupHelper {

	public void creationNewGroup() {
	    ApplicationManager.driver.findElement(By.name("new")).click();
	}

	public void fillGroupForm(ApplicationManager applicationManager, TestBase base, GroupData group) {
	    ApplicationManager.driver.findElement(By.name("group_name")).clear();
	    ApplicationManager.driver.findElement(By.name("group_name")).sendKeys(group.groupName);
	    ApplicationManager.driver.findElement(By.name("group_header")).clear();
	    ApplicationManager.driver.findElement(By.name("group_header")).sendKeys(group.header);
	    ApplicationManager.driver.findElement(By.name("group_footer")).clear();
	    ApplicationManager.driver.findElement(By.name("group_footer")).sendKeys(group.footer);
	}

	public void submitCreationNewGroup() {
	    ApplicationManager.driver.findElement(By.name("submit")).click();
	}

	public void returnToGroupsPage() {
	    ApplicationManager.driver.findElement(By.linkText("group page")).click();
	}

}
