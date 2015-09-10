package com.example.tests;

import java.util.regex.Pattern;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.navigationHelper.goToMainPage();
    app.navigationHelper.openGroupsPage();
    app.groupHelper.creationNewGroup();
    GroupData group = new GroupData();
    group.groupName = "group name1";
    group.header = "header1";
    group.footer = "footer1";
	app.groupHelper.fillGroupForm(app, this, group);
    app.groupHelper.submitCreationNewGroup();
    app.groupHelper.returnToGroupsPage();
  }

@Test
public void testEmptyGroupCreation() throws Exception {
	app.navigationHelper.goToMainPage();
    app.navigationHelper.openGroupsPage();
    app.groupHelper.creationNewGroup();
    app.groupHelper.fillGroupForm(app, this, new GroupData ("", "", ""));
    app.groupHelper.submitCreationNewGroup();
    app.groupHelper.returnToGroupsPage();
  }
}
