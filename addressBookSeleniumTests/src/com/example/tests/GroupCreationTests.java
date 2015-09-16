package com.example.tests;

import java.util.regex.Pattern;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.getNavigationHelper().goToMainPage();
    app.getNavigationHelper().openGroupsPage();
    app.getGroupHelper().creationNewGroup();
    GroupData group = new GroupData();
    group.groupName = "group name1";
    group.header = "header1";
    group.footer = "footer1";
	app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitCreationNewGroup();
    app.getGroupHelper().returnToGroupsPage();
  }

@Test
public void testEmptyGroupCreation() throws Exception {
	app.getNavigationHelper().goToMainPage();
    app.getNavigationHelper().openGroupsPage();
    app.getGroupHelper().creationNewGroup();
    app.getGroupHelper().fillGroupForm(new GroupData ("", "", ""));
    app.getGroupHelper().submitCreationNewGroup();
    app.getGroupHelper().returnToGroupsPage();
  }
}
