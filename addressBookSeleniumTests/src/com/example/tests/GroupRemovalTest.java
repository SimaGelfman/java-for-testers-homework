package com.example.tests;

import org.testng.annotations.Test;

public class GroupRemovalTest extends TestBase{
	
	@Test
	public void deleteGroup(){
		app.getNavigationHelper().goToMainPage();
		app.getNavigationHelper().openGroupsPage();
		app.getGroupHelper().deleteGroup(1);
		app.getNavigationHelper().openGroupsPage();
	}

}
