package com.example.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{
	
@Test
	public void modifySomeGroup(){
		app.getNavigationHelper().goToMainPage();
		app.getNavigationHelper().openGroupsPage();
		app.getGroupHelper().initGroupModification(1);
		GroupData group;
		group.name = "new name";
		app.getGroupHelper().fillGroupForm(group);
		app.getGroupHelper().submitGroupModification();
		app.getNavigationHelper().openGroupsPage();

	}

}