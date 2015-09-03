package com.example.tests;

import java.util.regex.Pattern;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	goToMainPage();
    openGroupsPage();
    creationNewGroup();
    GroupData group = new GroupData();
    group.groupName = "group name1";
    group.header = "header1";
    group.footer = "footer1";
	fillGroupForm(group);
    submitCreationNewGroup();
    returnToGroupsPage();
  }

@Test
public void testEmptyGroupCreation() throws Exception {
	goToMainPage();
    openGroupsPage();
    creationNewGroup();
    fillGroupForm(new GroupData("", "", ""));
    submitCreationNewGroup();
    returnToGroupsPage();
  }
}
